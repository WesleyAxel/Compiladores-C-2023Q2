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
	private char operator;
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
}
programa  : inicio decl+ cmd+ fim 
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
		  
decl	  : 'declare' lista_var PF
		  ;
		 
tipo	  : 'INTEGER' { currentType = DataType.INTEGER; }
          | 'REAL'    { currentType = DataType.REAL; }
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
           		CmdDeclare _CmdDeclare = new CmdDeclare(listaID);
				stack.peek().add(_CmdDeclare);
			  }
   		  ;
   		  
cmd		  : cmdAttr | cmdRead | cmdWrite | cmdIf | cmdWhile | cmdDoWhile
		  ;
		  
cmdIf     : 'if' {
				stack.push(new ArrayList<AbstractCommand>());
				BinaryExpression _relExpr = new BinaryExpression();				
				CmdIf _cmdIf = new CmdIf();
			} 
			AP expr {
				_relExpr.setLeftSide(expression);
			}
			OPREL {
				_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
			} 
			expr {
				_relExpr.setRightSide(expression);
				_cmdIf.setExpr(_relExpr);
				
			} FP ACO cmd+  
			{
				_cmdIf.setListaTrue(stack.pop());
					
			} FCO
			('else' ACO {
				stack.push(new ArrayList<AbstractCommand>());
			}
			cmd+ FCO)? 
			{
				_cmdIf.setListaFalse(stack.pop());
				stack.peek().add(_cmdIf);
			}		 
		  ; 
		  
cmdRead   : 'leia' AP ID {
				Identifier id = symbolTable.get(_input.LT(-1).getText());
				if (id == null){
					throw new RuntimeException("Undeclared Variable");
				}
				CmdRead _read = new CmdRead(id);
				stack.peek().add(_read);
			 }
			 FP PF
		  ;		 
		  
cmdWrite  : 'escreva' AP (
	         ID {
	         	Identifier id = symbolTable.get(_input.LT(-1).getText());
	         	if (id == null){
	         		throw new RuntimeException("Undeclared Variable");	         		
	         	}
	         	CmdWrite _write = new CmdWrite(id);
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
					throw new RuntimeException("Semantic ERROR - Undeclared Identifier");
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
		  
cmdWhile  : 'while' {
				stack.push(new ArrayList<AbstractCommand>());
				BinaryExpression _relExpr = new BinaryExpression();				
				CmdWhile _CmdWhile = new CmdWhile();
			} 
			AP expr {
				_relExpr.setLeftSide(expression);
			}
			OPREL {
				_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
			} 
			expr {
				_relExpr.setRightSide(expression);
				_CmdWhile.setExpr(_relExpr);
				
			} FP ACO (cmd)+ {
				_CmdWhile.setComandos(stack.pop());
				stack.peek().add(_CmdWhile);
			} FCO		  
		  ;
		  
cmdDoWhile  : 'do' {
					// FAZER O CÓDIGO DE IMPRIMIR COMANDOS

					} ACO (cmd)+ FCO
			  'while' {
				stack.push(new ArrayList<AbstractCommand>());
				BinaryExpression _relExpr = new BinaryExpression();				
				CmdDoWhile _CmdDoWhile = new CmdDoWhile();
				} 
			AP expr {
				_relExpr.setLeftSide(expression);
			}
			OPREL {
				_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
			} 
			expr {
				_relExpr.setRightSide(expression);
				_CmdDoWhile.setExpr(_relExpr);
				
			} FP {
				_CmdDoWhile.setComandos(stack.pop());
				stack.peek().add(_CmdDoWhile);
			} PF
		  ;		  
		  
		 
expr	  : termo exprl*
          ;
          
termo     : NUMBER 
			{
				expression = new NumberExpression(Integer.parseInt(_input.LT(-1).getText()));
			}
		  |
			ID {
				if (!symbolTable.exists(_input.LT(-1).getText())){
					throw new RuntimeException("Semantic ERROR - Undeclared Identifier: "+_input.LT(-1).getText());
				}
				rightDT = symbolTable.get(_input.LT(-1).getText()).getType();
				if (leftDT != rightDT){
					throw new RuntimeException("Semantic ERROR - Type Mismatching "+leftDT+ "-"+rightDT);
				}					
				
				Identifier id = symbolTable.get(_input.LT(-1).getText());
				if (id.getValue() != null){
					expression = new NumberExpression(id.getValue());
				}
				else{
					throw new RuntimeException("Semantic ERROR - Unassigned variable");
				}
			}
		  ;
		  
exprl     : (SUM | SUB | MUL | DIV) { 
				operator = _input.LT(-1).getText().charAt(0);
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