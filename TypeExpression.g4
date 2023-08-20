grammar TypeExpression;

@header{
	import java.util.ArrayList;
	import java.util.List;
	import symbols.DataType;
	import java.util.Stack;
	import symbols.Identifier;
	import symbols.SymbolTable;
	import expressions.*;
	import ast.*;
}

@members{
	private SymbolTable symbolTable = new SymbolTable();
	private DataType currentType;
	private AbstractExpression expression;
	private String operator;
	private DataType leftDT;
	private DataType rightDT;
	private String   idAtribuido;
	private String   text;
	private Program  program = new Program();
	private Stack<List<AbstractCommand>> stack = new Stack<List<AbstractCommand>>();
	
	public void init(){
		program.setSymbolTable(symbolTable);
		stack.push(new ArrayList<AbstractCommand>());
	}
		
	public void exibirID(){
		symbolTable.getSymbols().values().stream().forEach((id)->System.out.println(id));
	}
	
	public void generateObjectCode(){
		program.generateTarget();
	}
	
	public void runInterpreter(){
		program.run();
	}

	public void checkId(String name){
	Identifier id = symbolTable.get(name);
        if (id == null){
            throw new RuntimeException("Syntax error: Undeclared Variable" + " [" + name + "] used in expression!");
        } else if (id.getValue() == null) {
            throw new RuntimeException("Syntax error: Unassigned Variable" + " [" + name + "] used in expression!");
        }
	}

	DataType getExpressionType(String expr) {
        if (symbolTable.exists(expr)) {
            return symbolTable.get(expr).getType();
        } else if (expr.matches("[0-9]+")) {
            return DataType.INTEGER;
        } else if (expr.matches("[0-9]+\\.[0-9]+")) {
            return DataType.REAL;
        } else if (expr.matches("\".*\"")) {
            return DataType.STRING;
        }
        throw new RuntimeException("Semantic error: Unknown expression type for: [" + expr + "]!");
    }
}
programa  : inicio (decl)* (cmd)* fim
			{
				program.setComandos(stack.pop());
			}
		  ;
		  
inicio    : 'programa' {
							CmdInicio _CmdInicio = new CmdInicio();
							stack.peek().add(_CmdInicio);
							}
		  ;

fim       : 'fimprog.' {
							CmdFim _CmdFim = new CmdFim();
							stack.peek().add(_CmdFim);
							}
          ;
		  
decl	  : 'declare' tipo lista_var PF
		  ;
		 
tipo	  : 'INTEGER' 			{ currentType = DataType.INTEGER; }
          | 'REAL'    			{ currentType = DataType.REAL; }
          | 'STRING'			{ currentType = DataType.STRING;}
          ;
         
lista_var : ID  { 
				symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType)); 
				List<String> listaID = new ArrayList<>();
				listaID.add(_input.LT(-1).getText());
				} 
           (VIRG ID 
           		{ 
           		symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType)); 
           		listaID.add(_input.LT(-1).getText());
   
           		}
           )* {
           		CmdDeclare _CmdDeclare = new CmdDeclare(listaID,currentType);
				stack.peek().add(_CmdDeclare);
			  }
   		  ;
   		  
cmd		  : cmdAttr | cmdRead | cmdWrite | cmdIf | cmdWhile | cmdDoWhile
		  ;
		  
cmdIf     : 'if' {
                stack.push(new ArrayList<AbstractCommand>());
                String _leftExpr = new String();
                String _rightExpr = new String();
                String _relExpr = new String();
                CmdIf _cmdIf = new CmdIf();
            }
            AP (
            REAL
            |
            NUMBER
            |
            TEXT
            |
            ID {_leftExpr = _input.LT(-1).getText(); checkId(_leftExpr);}
            ) {
                _leftExpr = "";
                _leftExpr += _input.LT(-1).getText();
                _relExpr += _leftExpr;
            }
            OPREL {
                _relExpr += _input.LT(-1).getText();
            }
            (
            REAL
            |
            NUMBER
            |
            TEXT
            |
            ID {_rightExpr = _input.LT(-1).getText(); checkId(_rightExpr);}
            ) {
                _rightExpr = "";
                _rightExpr = _input.LT(-1).getText();
                _relExpr += _rightExpr;

                DataType leftType = getExpressionType(_leftExpr);
                DataType rightType = getExpressionType(_rightExpr);

                if (leftType != rightType) {
                    throw new RuntimeException("Type mismatch: Incompatible types for If expression comparison. Cannot compare [" + leftType + "] to [" + rightType + "]!");
                }

                _cmdIf.setExpr(_relExpr);
            }
            FP ACO (cmd)+
            {
                _cmdIf.setListaTrue(stack.pop());
                stack.peek().add(_cmdIf);
            } FCO
            (
                'else' ACO {
                    stack.push(new ArrayList<AbstractCommand>());
                } (cmd)+ FCO
                {
                    _cmdIf.setListaFalse(stack.pop());
                }
            )?
          ;

cmdRead   : 'leia' AP ID {
				Identifier id = symbolTable.get(_input.LT(-1).getText());
				if (id == null){
					throw new RuntimeException("Syntax error: Cannot write to undeclared variable: [" + _input.LT(-1).getText() + "]!");
				}
				DataType dataType = id.getType();
				CmdRead _read = new CmdRead(id,dataType);
				stack.peek().add(_read);
			 }
			 FP PF
		  ;		 
		  
cmdWrite  : 'escreva' AP (
	         ID {
	         	Identifier id = symbolTable.get(_input.LT(-1).getText());
	         	if (id == null){
	         		throw new RuntimeException("Syntax error: Cannot read undeclared Variable: [" + _input.LT(-1).getText() + "]!");
	         	}
	         	DataType dataType = id.getType();
	         	CmdWrite _write = new CmdWrite(id,dataType);
	         	stack.peek().add(_write);
	         } 
	         | 
	         TEXT {
	         	CmdWrite _write = new CmdWrite(_input.LT(-1).getText());
	         	stack.peek().add(_write);
	         	
	         }
             ) FP PF
          ;		      		  
   		  
cmdAttr   : ID {
				idAtribuido = _input.LT(-1).getText();
				if (!symbolTable.exists(_input.LT(-1).getText())){
					throw new RuntimeException("Syntax error: Undeclared variable assignment. Variable [" + _input.LT(-1).getText() + "] has not been declared!");
				}
				leftDT = symbolTable.get(_input.LT(-1).getText()).getType();
				rightDT = null;
				}
         	ATTR expr PF
				{
					// logica para atribuir o valor da expressao no identificador
					Identifier id = symbolTable.get(idAtribuido);
					id.setValue(expression.eval());
					symbolTable.add(idAtribuido, id);
					
					System.out.println("EVAL ("+expression+") = "+expression.eval());
					
					CmdAttrib _attr = new CmdAttrib(id, expression);
					stack.peek().add(_attr);
					expression = null;					
				}
		  ;
		  
cmdWhile : 'while' {
             stack.push(new ArrayList<AbstractCommand>());
             String _leftExpr = new String();
             String _rightExpr = new String();
             String _relExpr = new String();
             CmdWhile _CmdWhile = new CmdWhile();
           }
            AP (
            REAL
            |
            NUMBER
            |
            TEXT
            |
            ID {_leftExpr = _input.LT(-1).getText(); checkId(_leftExpr);}
            ) {
                _leftExpr = "";
                _leftExpr = _input.LT(-1).getText();
                _relExpr += _leftExpr;
            }
            OPREL {
                _relExpr += _input.LT(-1).getText();
            }
            (
            REAL
            |
            NUMBER
            |
            TEXT
            |
            ID {_rightExpr = _input.LT(-1).getText(); checkId(_rightExpr);}
            ) {
                _rightExpr = "";
                _rightExpr = _input.LT(-1).getText();
                _relExpr += _rightExpr;

                DataType leftType = getExpressionType(_leftExpr);
                DataType rightType = getExpressionType(_rightExpr);

                if (leftType != rightType) {
                    throw new RuntimeException("Type mismatch: Incompatible types for While expression comparison. Cannot compare [" + leftType + "] to [" + rightType + "]!");
                }

                _CmdWhile.setExpr(_relExpr);
            }
           FP ACO (cmd)+ {
             _CmdWhile.setComandos(stack.pop());
             stack.peek().add(_CmdWhile);
           } FCO
         ;

cmdDoWhile  : 'do' {
					stack.push(new ArrayList<AbstractCommand>());
					String _leftExpr = new String();
                    String _rightExpr = new String();
                    String _relExpr = new String();
					CmdDoWhile _CmdDoWhile = new CmdDoWhile();
					} ACO (cmd)+ FCO
			  'while'
            AP (
            REAL
            |
            NUMBER
            |
            TEXT
            |
            ID {_leftExpr = _input.LT(-1).getText(); checkId(_leftExpr);}
            ) {
                _leftExpr = "";
                _leftExpr = _input.LT(-1).getText();
                _relExpr += _leftExpr;
            }
            OPREL {
                _relExpr += _input.LT(-1).getText();
            }
            (
            REAL
            |
            NUMBER
            |
            TEXT
            |
            ID {_rightExpr = _input.LT(-1).getText(); checkId(_rightExpr);}
            ) {
                _rightExpr = "";
                _rightExpr = _input.LT(-1).getText();
                _relExpr += _rightExpr;

                DataType leftType = getExpressionType(_leftExpr);
                DataType rightType = getExpressionType(_rightExpr);

                if (leftType != rightType) {
                    throw new RuntimeException("Type mismatch: Incompatible types for Do While expression comparison. Cannot compare [" + leftType + "] to [" + rightType + "]!");
                }

                _CmdDoWhile.setExpr(_relExpr);
            }
			FP {
				_CmdDoWhile.setComandos(stack.pop());
				stack.peek().add(_CmdDoWhile);
			} PF
		  ;		  
		  
		 
expr	  : termo exprl*
          ;
          
termo     :  NUMBER 
			{
				expression = new NumberExpression(Integer.parseInt(_input.LT(-1).getText()));
				rightDT = DataType.INTEGER; 
			}
			| REAL
			{
				expression = new RealExpression(Double.parseDouble(_input.LT(-1).getText()));
				rightDT = DataType.REAL; 
			}
		  	| TEXT
		  	{
		  		expression = new StringExpression(_input.LT(-1).getText());
		  		rightDT = DataType.STRING; 
		  	}
			| ID {
				if (!symbolTable.exists(_input.LT(-1).getText())){
					throw new RuntimeException("Undeclared Identifier: "+_input.LT(-1).getText());
				}
				rightDT = symbolTable.get(_input.LT(-1).getText()).getType();
				if (leftDT != rightDT){
					throw new RuntimeException("Type Mismatching " + leftDT + " - " + rightDT);
				}					
				
				Identifier id = symbolTable.get(_input.LT(-1).getText());
				if (id.getValue() != null){
					if 	(rightDT == DataType.INTEGER) {
						expression = new NumberExpression(id.getText());
					} else if (rightDT == DataType.REAL) {
						expression = new RealExpression(id.getText());
					} else if (rightDT == DataType.STRING) {
						expression = new StringExpression(id.getText());
					}
				}
				else{
					throw new RuntimeException("Reference to unassigned variable");
				}
			}
		  ;
		  
exprl     : (SUM | SUB | MUL | DIV) { 
				operator = _input.LT(-1).getText();
				BinaryExpression _exprADD = new BinaryExpression(operator);
				_exprADD.setLeftSide(expression);
			} 
			termo
			{
				_exprADD.setRightSide(expression);
				expression = _exprADD;
			}
          ;		         
		  
NUMBER	  : [0-9]+
		  ;
		  
REAL	  : [0-9]+('.'[0-9]+)?
		  ;
		  
TEXT 	  : '"' ([a-z]|[A-Z]|[0-9]|' '|'\t'|'!'|'-')* '"'
		  ;		  
		  
ATTR	  : ':='
   		  ;		
   		  
SUM	      : '+'
		  ;
		  
SUB		  : '-'		     		    
          ;
          
MUL		  : '*'
          ;
          
DIV		  : '/'
		  ;
          
OPREL     : '>' | '>=' | '<' | '<=' | '==' | '!=' 
 		  ;          
   		  
ID		  : ([a-z]|[A-Z]) ([a-z]|[A-Z]|[0-9])*
          ;
          
VIRG      : ','
          ;
          
PF        : '.'
          ;
          
AP	      : '('          
	      ;
	      
FP 		  : ')'
          ;	   

ACO		  : '{'
		  ;

FCO		  : '}'
		  ;          
             
BLANK     : (' '| '\t' | '\n' | '\r') -> skip
          ;                                 		           		 		 