// Generated from TypeExpression.g4 by ANTLR 4.13.0
package parser;

	import java.util.ArrayList;
	import java.util.List;
	import symbols.DataType;
	import java.util.Stack;
	import symbols.Identifier;
	import symbols.SymbolTable;
	import expressions.*;
	import ast.*;
	

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TypeExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, NUMBER=13, REAL=14, TEXT=15, ATTR=16, SUM=17, 
		SUB=18, MUL=19, DIV=20, OPREL=21, ID=22, VIRG=23, PF=24, AP=25, FP=26, 
		ACO=27, FCO=28, BLANK=29;
	public static final int
		RULE_programa = 0, RULE_inicio = 1, RULE_fim = 2, RULE_decl = 3, RULE_tipo = 4, 
		RULE_lista_var = 5, RULE_cmd = 6, RULE_cmdIf = 7, RULE_cmdRead = 8, RULE_cmdWrite = 9, 
		RULE_cmdAttr = 10, RULE_cmdWhile = 11, RULE_cmdDoWhile = 12, RULE_expr = 13, 
		RULE_termo = 14, RULE_exprl = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "inicio", "fim", "decl", "tipo", "lista_var", "cmd", "cmdIf", 
			"cmdRead", "cmdWrite", "cmdAttr", "cmdWhile", "cmdDoWhile", "expr", "termo", 
			"exprl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog.'", "'declare'", "'INTEGER'", "'REAL'", 
			"'STRING'", "'if'", "'else'", "'leia'", "'escreva'", "'while'", "'do'", 
			null, null, null, "':='", "'+'", "'-'", "'*'", "'/'", null, null, "','", 
			"'.'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "NUMBER", "REAL", "TEXT", "ATTR", "SUM", "SUB", "MUL", "DIV", "OPREL", 
			"ID", "VIRG", "PF", "AP", "FP", "ACO", "FCO", "BLANK"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TypeExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public TypeExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public InicioContext inicio() {
			return getRuleContext(InicioContext.class,0);
		}
		public FimContext fim() {
			return getRuleContext(FimContext.class,0);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			inicio();
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				decl();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				cmd();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4202112L) != 0) );
			setState(43);
			fim();

							program.setComandos(stack.pop());
						
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__0);

										CmdInicio _CmdInicio = new CmdInicio();
										stack.peek().add(_CmdInicio);
										
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FimContext extends ParserRuleContext {
		public FimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterFim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitFim(this);
		}
	}

	public final FimContext fim() throws RecognitionException {
		FimContext _localctx = new FimContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__1);

										CmdFim _CmdFim = new CmdFim();
										stack.peek().add(_CmdFim);
										
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Lista_varContext lista_var() {
			return getRuleContext(Lista_varContext.class,0);
		}
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__2);
			setState(53);
			tipo();
			setState(54);
			lista_var();
			setState(55);
			match(PF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(T__3);
				 currentType = DataType.INTEGER; 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(T__4);
				 currentType = DataType.REAL; 
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(T__5);
				 currentType = DataType.STRING;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_varContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TypeExpressionParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TypeExpressionParser.ID, i);
		}
		public List<TerminalNode> VIRG() { return getTokens(TypeExpressionParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(TypeExpressionParser.VIRG, i);
		}
		public Lista_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterLista_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitLista_var(this);
		}
	}

	public final Lista_varContext lista_var() throws RecognitionException {
		Lista_varContext _localctx = new Lista_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lista_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(ID);
			 
							symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType)); 
							List<String> listaID = new ArrayList<>();
							listaID.add(_input.LT(-1).getText());
							
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(67);
				match(VIRG);
				setState(68);
				match(ID);
				 
				           		symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType)); 
				           		listaID.add(_input.LT(-1).getText());
				   
				           		
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			           		CmdDeclare _CmdDeclare = new CmdDeclare(listaID,currentType);
							stack.peek().add(_CmdDeclare);
						  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public CmdAttrContext cmdAttr() {
			return getRuleContext(CmdAttrContext.class,0);
		}
		public CmdReadContext cmdRead() {
			return getRuleContext(CmdReadContext.class,0);
		}
		public CmdWriteContext cmdWrite() {
			return getRuleContext(CmdWriteContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdDoWhileContext cmdDoWhile() {
			return getRuleContext(CmdDoWhileContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmd);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				cmdAttr();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				cmdRead();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				cmdWrite();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				cmdIf();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				cmdWhile();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				cmdDoWhile();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdIfContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(TypeExpressionParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(TypeExpressionParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(TypeExpressionParser.FP, 0); }
		public List<TerminalNode> ACO() { return getTokens(TypeExpressionParser.ACO); }
		public TerminalNode ACO(int i) {
			return getToken(TypeExpressionParser.ACO, i);
		}
		public List<TerminalNode> FCO() { return getTokens(TypeExpressionParser.FCO); }
		public TerminalNode FCO(int i) {
			return getToken(TypeExpressionParser.FCO, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmdIf(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__6);

							stack.push(new ArrayList<AbstractCommand>());
							BinaryExpression _relExpr = new BinaryExpression();				
							CmdIf _cmdIf = new CmdIf();
						
			setState(87);
			match(AP);
			setState(88);
			expr();

							_relExpr.setLeftSide(expression);
						
			setState(90);
			match(OPREL);

							_relExpr.setOperator(_input.LT(-1).getText());
						
			setState(92);
			expr();

							_relExpr.setRightSide(expression);
							if (leftDT != rightDT) {
			                    throw new RuntimeException("Semantic ERROR - Type Mismatching: " + leftDT + " - " + rightDT);
			                }
							_cmdIf.setExpr(_relExpr);
						
			setState(94);
			match(FP);
			setState(95);
			match(ACO);
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				cmd();
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4202112L) != 0) );

							_cmdIf.setListaTrue(stack.pop());
								
						
			setState(102);
			match(FCO);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(103);
				match(T__7);
				setState(104);
				match(ACO);

								stack.push(new ArrayList<AbstractCommand>());
							
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(106);
					cmd();
					}
					}
					setState(109); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4202112L) != 0) );
				setState(111);
				match(FCO);
				}
			}


							_cmdIf.setListaFalse(stack.pop());
							stack.peek().add(_cmdIf);
						
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdReadContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(TypeExpressionParser.AP, 0); }
		public TerminalNode ID() { return getToken(TypeExpressionParser.ID, 0); }
		public TerminalNode FP() { return getToken(TypeExpressionParser.FP, 0); }
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public CmdReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmdRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmdRead(this);
		}
	}

	public final CmdReadContext cmdRead() throws RecognitionException {
		CmdReadContext _localctx = new CmdReadContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__8);
			setState(118);
			match(AP);
			setState(119);
			match(ID);

							Identifier id = symbolTable.get(_input.LT(-1).getText());
							if (id == null){
								throw new RuntimeException("Undeclared Variable");
							}
							DataType dataType = id.getType();
							CmdRead _read = new CmdRead(id,dataType);
							stack.peek().add(_read);
						 
			setState(121);
			match(FP);
			setState(122);
			match(PF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdWriteContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(TypeExpressionParser.AP, 0); }
		public TerminalNode FP() { return getToken(TypeExpressionParser.FP, 0); }
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public TerminalNode ID() { return getToken(TypeExpressionParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(TypeExpressionParser.TEXT, 0); }
		public CmdWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmdWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmdWrite(this);
		}
	}

	public final CmdWriteContext cmdWrite() throws RecognitionException {
		CmdWriteContext _localctx = new CmdWriteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__9);
			setState(125);
			match(AP);
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(126);
				match(ID);

					         	Identifier id = symbolTable.get(_input.LT(-1).getText());
					         	if (id == null){
					         		throw new RuntimeException("Undeclared Variable");	         		
					         	}
					         	DataType dataType = id.getType();
					         	CmdWrite _write = new CmdWrite(id,dataType);
					         	stack.peek().add(_write);
					         
				}
				break;
			case TEXT:
				{
				setState(128);
				match(TEXT);

					         	CmdWrite _write = new CmdWrite(_input.LT(-1).getText());
					         	stack.peek().add(_write);
					         	
					         
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(132);
			match(FP);
			setState(133);
			match(PF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdAttrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TypeExpressionParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(TypeExpressionParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public CmdAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmdAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmdAttr(this);
		}
	}

	public final CmdAttrContext cmdAttr() throws RecognitionException {
		CmdAttrContext _localctx = new CmdAttrContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(ID);

							idAtribuido = _input.LT(-1).getText();
							if (!symbolTable.exists(_input.LT(-1).getText())){
								throw new RuntimeException("Semantic ERROR - Undeclared Identifier");
							}
							leftDT = symbolTable.get(_input.LT(-1).getText()).getType();
							rightDT = null;
							
			setState(137);
			match(ATTR);
			setState(138);
			expr();
			setState(139);
			match(PF);

								// logica para atribuir o valor da expressao no identificador
								Identifier id = symbolTable.get(idAtribuido);
								id.setValue(expression.eval());
								symbolTable.add(idAtribuido, id);
								
								System.out.println("EVAL ("+expression+") = "+expression.eval());
								
								CmdAttrib _attr = new CmdAttrib(id, expression);
								stack.peek().add(_attr);
								expression = null;					
							
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdWhileContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(TypeExpressionParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(TypeExpressionParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(TypeExpressionParser.FP, 0); }
		public TerminalNode ACO() { return getToken(TypeExpressionParser.ACO, 0); }
		public TerminalNode FCO() { return getToken(TypeExpressionParser.FCO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmdWhile(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__10);

							stack.push(new ArrayList<AbstractCommand>());
							BinaryExpression _relExpr = new BinaryExpression();				
							CmdWhile _CmdWhile = new CmdWhile();
						
			setState(144);
			match(AP);
			setState(145);
			expr();

							_relExpr.setLeftSide(expression);
						
			setState(147);
			match(OPREL);

							_relExpr.setOperator(_input.LT(-1).getText());
						
			setState(149);
			expr();

							_relExpr.setRightSide(expression);
							if (leftDT != rightDT) {
			                    throw new RuntimeException("Semantic ERROR - Type Mismatching: " + leftDT + " - " + rightDT);
			                }
							_CmdWhile.setExpr(_relExpr);
							
						
			setState(151);
			match(FP);
			setState(152);
			match(ACO);
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153);
				cmd();
				}
				}
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4202112L) != 0) );

							_CmdWhile.setComandos(stack.pop());
							stack.peek().add(_CmdWhile);
						
			setState(159);
			match(FCO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdDoWhileContext extends ParserRuleContext {
		public TerminalNode ACO() { return getToken(TypeExpressionParser.ACO, 0); }
		public TerminalNode FCO() { return getToken(TypeExpressionParser.FCO, 0); }
		public TerminalNode AP() { return getToken(TypeExpressionParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(TypeExpressionParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(TypeExpressionParser.FP, 0); }
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdDoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDoWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmdDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmdDoWhile(this);
		}
	}

	public final CmdDoWhileContext cmdDoWhile() throws RecognitionException {
		CmdDoWhileContext _localctx = new CmdDoWhileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdDoWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__11);

								stack.push(new ArrayList<AbstractCommand>());
								BinaryExpression _relExpr = new BinaryExpression();				
								CmdDoWhile _CmdDoWhile = new CmdDoWhile();
								
			setState(163);
			match(ACO);
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				cmd();
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4202112L) != 0) );
			setState(169);
			match(FCO);
			setState(170);
			match(T__10);
			setState(171);
			match(AP);
			setState(172);
			expr();

							_relExpr.setLeftSide(expression);
						
			setState(174);
			match(OPREL);

							String text = _input.LT(-1).getText();
						    _relExpr.setOperator(text);
						
			setState(176);
			expr();

							_relExpr.setRightSide(expression);
							_CmdDoWhile.setExpr(_relExpr);
							
						
			setState(178);
			match(FP);

							_CmdDoWhile.setComandos(stack.pop());
							stack.peek().add(_CmdDoWhile);
						
			setState(180);
			match(PF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public List<ExprlContext> exprl() {
			return getRuleContexts(ExprlContext.class);
		}
		public ExprlContext exprl(int i) {
			return getRuleContext(ExprlContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			termo();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) {
				{
				{
				setState(183);
				exprl();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TypeExpressionParser.NUMBER, 0); }
		public TerminalNode REAL() { return getToken(TypeExpressionParser.REAL, 0); }
		public TerminalNode TEXT() { return getToken(TypeExpressionParser.TEXT, 0); }
		public TerminalNode ID() { return getToken(TypeExpressionParser.ID, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_termo);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(NUMBER);

								expression = new NumberExpression(Integer.parseInt(_input.LT(-1).getText()));
								rightDT = DataType.INTEGER; 
							
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(REAL);

								expression = new RealExpression(Double.parseDouble(_input.LT(-1).getText()));
								rightDT = DataType.REAL; 
							
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(TEXT);

						  		expression = new StringExpression(_input.LT(-1).getText());
						  		rightDT = DataType.STRING; 
						  	
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(ID);

								if (!symbolTable.exists(_input.LT(-1).getText())){
									throw new RuntimeException("Semantic ERROR - Undeclared Identifier: "+_input.LT(-1).getText());
								}
								rightDT = symbolTable.get(_input.LT(-1).getText()).getType();
								if (leftDT != rightDT){
									throw new RuntimeException("Semantic ERROR - Type Mismatching "+leftDT+ "-"+rightDT);
								}					
								
								Identifier id = symbolTable.get(_input.LT(-1).getText());
								if (id.getValue() != null){
									if 		  (rightDT == DataType.INTEGER) {
										expression = new NumberExpression(id.getValue());
									} else if (rightDT == DataType.REAL) {
										expression = new RealExpression(id.getValue());
									} else if (rightDT == DataType.STRING) {
										expression = new StringExpression(id.getValue());
									}
								}
								else{
									throw new RuntimeException("Semantic ERROR - Unassigned variable");
								}
							
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprlContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode SUM() { return getToken(TypeExpressionParser.SUM, 0); }
		public TerminalNode SUB() { return getToken(TypeExpressionParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(TypeExpressionParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TypeExpressionParser.DIV, 0); }
		public ExprlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterExprl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitExprl(this);
		}
	}

	public final ExprlContext exprl() throws RecognitionException {
		ExprlContext _localctx = new ExprlContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exprl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 
							operator = _input.LT(-1).getText();
							BinaryExpression _exprADD = new BinaryExpression(operator);
							_exprADD.setLeftSide(expression);
						
			setState(201);
			termo();

							_exprADD.setRightSide(expression);
							expression = _exprADD;
						
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u00cd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0004\u0000#\b\u0000\u000b\u0000\f\u0000"+
		"$\u0001\u0000\u0004\u0000(\b\u0000\u000b\u0000\f\u0000)\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004@\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005G\b\u0005\n\u0005\f\u0005J\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006T\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007b\b\u0007\u000b"+
		"\u0007\f\u0007c\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0004\u0007l\b\u0007\u000b\u0007\f\u0007m\u0001\u0007"+
		"\u0001\u0007\u0003\u0007r\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u0083\b\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u009b\b\u000b\u000b"+
		"\u000b\f\u000b\u009c\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0004\f\u00a6\b\f\u000b\f\f\f\u00a7\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r\u00b9\b\r\n\r\f\r\u00bc\t\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00c6\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e\u0000\u0001\u0001\u0000\u0011\u0014\u00d0\u0000 \u0001\u0000\u0000"+
		"\u0000\u0002.\u0001\u0000\u0000\u0000\u00041\u0001\u0000\u0000\u0000\u0006"+
		"4\u0001\u0000\u0000\u0000\b?\u0001\u0000\u0000\u0000\nA\u0001\u0000\u0000"+
		"\u0000\fS\u0001\u0000\u0000\u0000\u000eU\u0001\u0000\u0000\u0000\u0010"+
		"u\u0001\u0000\u0000\u0000\u0012|\u0001\u0000\u0000\u0000\u0014\u0087\u0001"+
		"\u0000\u0000\u0000\u0016\u008e\u0001\u0000\u0000\u0000\u0018\u00a1\u0001"+
		"\u0000\u0000\u0000\u001a\u00b6\u0001\u0000\u0000\u0000\u001c\u00c5\u0001"+
		"\u0000\u0000\u0000\u001e\u00c7\u0001\u0000\u0000\u0000 \"\u0003\u0002"+
		"\u0001\u0000!#\u0003\u0006\u0003\u0000\"!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000"+
		"%\'\u0001\u0000\u0000\u0000&(\u0003\f\u0006\u0000\'&\u0001\u0000\u0000"+
		"\u0000()\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000"+
		"\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0003\u0004\u0002\u0000,-\u0006"+
		"\u0000\uffff\uffff\u0000-\u0001\u0001\u0000\u0000\u0000./\u0005\u0001"+
		"\u0000\u0000/0\u0006\u0001\uffff\uffff\u00000\u0003\u0001\u0000\u0000"+
		"\u000012\u0005\u0002\u0000\u000023\u0006\u0002\uffff\uffff\u00003\u0005"+
		"\u0001\u0000\u0000\u000045\u0005\u0003\u0000\u000056\u0003\b\u0004\u0000"+
		"67\u0003\n\u0005\u000078\u0005\u0018\u0000\u00008\u0007\u0001\u0000\u0000"+
		"\u00009:\u0005\u0004\u0000\u0000:@\u0006\u0004\uffff\uffff\u0000;<\u0005"+
		"\u0005\u0000\u0000<@\u0006\u0004\uffff\uffff\u0000=>\u0005\u0006\u0000"+
		"\u0000>@\u0006\u0004\uffff\uffff\u0000?9\u0001\u0000\u0000\u0000?;\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@\t\u0001\u0000\u0000\u0000"+
		"AB\u0005\u0016\u0000\u0000BH\u0006\u0005\uffff\uffff\u0000CD\u0005\u0017"+
		"\u0000\u0000DE\u0005\u0016\u0000\u0000EG\u0006\u0005\uffff\uffff\u0000"+
		"FC\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000KL\u0006\u0005\uffff\uffff\u0000L\u000b\u0001\u0000\u0000"+
		"\u0000MT\u0003\u0014\n\u0000NT\u0003\u0010\b\u0000OT\u0003\u0012\t\u0000"+
		"PT\u0003\u000e\u0007\u0000QT\u0003\u0016\u000b\u0000RT\u0003\u0018\f\u0000"+
		"SM\u0001\u0000\u0000\u0000SN\u0001\u0000\u0000\u0000SO\u0001\u0000\u0000"+
		"\u0000SP\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000SR\u0001\u0000"+
		"\u0000\u0000T\r\u0001\u0000\u0000\u0000UV\u0005\u0007\u0000\u0000VW\u0006"+
		"\u0007\uffff\uffff\u0000WX\u0005\u0019\u0000\u0000XY\u0003\u001a\r\u0000"+
		"YZ\u0006\u0007\uffff\uffff\u0000Z[\u0005\u0015\u0000\u0000[\\\u0006\u0007"+
		"\uffff\uffff\u0000\\]\u0003\u001a\r\u0000]^\u0006\u0007\uffff\uffff\u0000"+
		"^_\u0005\u001a\u0000\u0000_a\u0005\u001b\u0000\u0000`b\u0003\f\u0006\u0000"+
		"a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0006\u0007"+
		"\uffff\uffff\u0000fq\u0005\u001c\u0000\u0000gh\u0005\b\u0000\u0000hi\u0005"+
		"\u001b\u0000\u0000ik\u0006\u0007\uffff\uffff\u0000jl\u0003\f\u0006\u0000"+
		"kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0005\u001c"+
		"\u0000\u0000pr\u0001\u0000\u0000\u0000qg\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0006\u0007\uffff\uffff"+
		"\u0000t\u000f\u0001\u0000\u0000\u0000uv\u0005\t\u0000\u0000vw\u0005\u0019"+
		"\u0000\u0000wx\u0005\u0016\u0000\u0000xy\u0006\b\uffff\uffff\u0000yz\u0005"+
		"\u001a\u0000\u0000z{\u0005\u0018\u0000\u0000{\u0011\u0001\u0000\u0000"+
		"\u0000|}\u0005\n\u0000\u0000}\u0082\u0005\u0019\u0000\u0000~\u007f\u0005"+
		"\u0016\u0000\u0000\u007f\u0083\u0006\t\uffff\uffff\u0000\u0080\u0081\u0005"+
		"\u000f\u0000\u0000\u0081\u0083\u0006\t\uffff\uffff\u0000\u0082~\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0005\u001a\u0000\u0000\u0085\u0086\u0005"+
		"\u0018\u0000\u0000\u0086\u0013\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"\u0016\u0000\u0000\u0088\u0089\u0006\n\uffff\uffff\u0000\u0089\u008a\u0005"+
		"\u0010\u0000\u0000\u008a\u008b\u0003\u001a\r\u0000\u008b\u008c\u0005\u0018"+
		"\u0000\u0000\u008c\u008d\u0006\n\uffff\uffff\u0000\u008d\u0015\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005\u000b\u0000\u0000\u008f\u0090\u0006\u000b"+
		"\uffff\uffff\u0000\u0090\u0091\u0005\u0019\u0000\u0000\u0091\u0092\u0003"+
		"\u001a\r\u0000\u0092\u0093\u0006\u000b\uffff\uffff\u0000\u0093\u0094\u0005"+
		"\u0015\u0000\u0000\u0094\u0095\u0006\u000b\uffff\uffff\u0000\u0095\u0096"+
		"\u0003\u001a\r\u0000\u0096\u0097\u0006\u000b\uffff\uffff\u0000\u0097\u0098"+
		"\u0005\u001a\u0000\u0000\u0098\u009a\u0005\u001b\u0000\u0000\u0099\u009b"+
		"\u0003\f\u0006\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001"+
		"\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0006"+
		"\u000b\uffff\uffff\u0000\u009f\u00a0\u0005\u001c\u0000\u0000\u00a0\u0017"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\f\u0000\u0000\u00a2\u00a3\u0006"+
		"\f\uffff\uffff\u0000\u00a3\u00a5\u0005\u001b\u0000\u0000\u00a4\u00a6\u0003"+
		"\f\u0006\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u001c"+
		"\u0000\u0000\u00aa\u00ab\u0005\u000b\u0000\u0000\u00ab\u00ac\u0005\u0019"+
		"\u0000\u0000\u00ac\u00ad\u0003\u001a\r\u0000\u00ad\u00ae\u0006\f\uffff"+
		"\uffff\u0000\u00ae\u00af\u0005\u0015\u0000\u0000\u00af\u00b0\u0006\f\uffff"+
		"\uffff\u0000\u00b0\u00b1\u0003\u001a\r\u0000\u00b1\u00b2\u0006\f\uffff"+
		"\uffff\u0000\u00b2\u00b3\u0005\u001a\u0000\u0000\u00b3\u00b4\u0006\f\uffff"+
		"\uffff\u0000\u00b4\u00b5\u0005\u0018\u0000\u0000\u00b5\u0019\u0001\u0000"+
		"\u0000\u0000\u00b6\u00ba\u0003\u001c\u000e\u0000\u00b7\u00b9\u0003\u001e"+
		"\u000f\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bb\u001b\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0005\r\u0000\u0000\u00be\u00c6\u0006\u000e\uffff"+
		"\uffff\u0000\u00bf\u00c0\u0005\u000e\u0000\u0000\u00c0\u00c6\u0006\u000e"+
		"\uffff\uffff\u0000\u00c1\u00c2\u0005\u000f\u0000\u0000\u00c2\u00c6\u0006"+
		"\u000e\uffff\uffff\u0000\u00c3\u00c4\u0005\u0016\u0000\u0000\u00c4\u00c6"+
		"\u0006\u000e\uffff\uffff\u0000\u00c5\u00bd\u0001\u0000\u0000\u0000\u00c5"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c5\u00c1\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c6\u001d\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0007\u0000\u0000\u0000\u00c8\u00c9\u0006\u000f\uffff\uffff\u0000"+
		"\u00c9\u00ca\u0003\u001c\u000e\u0000\u00ca\u00cb\u0006\u000f\uffff\uffff"+
		"\u0000\u00cb\u001f\u0001\u0000\u0000\u0000\r$)?HScmq\u0082\u009c\u00a7"+
		"\u00ba\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}