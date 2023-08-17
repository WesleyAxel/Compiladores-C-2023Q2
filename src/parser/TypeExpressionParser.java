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
		T__9=10, NUMBER=11, TEXT=12, ATTR=13, SUM=14, SUB=15, MUL=16, DIV=17, 
		OPREL=18, ID=19, VIRG=20, PF=21, AP=22, FP=23, ACO=24, FCO=25, BLANK=26;
	public static final int
		RULE_programa = 0, RULE_inicio = 1, RULE_fim = 2, RULE_decl = 3, RULE_tipo = 4, 
		RULE_lista_var = 5, RULE_cmd = 6, RULE_cmdIf = 7, RULE_cmdRead = 8, RULE_cmdWrite = 9, 
		RULE_cmdAttr = 10, RULE_cmdWhile = 11, RULE_expr = 12, RULE_termo = 13, 
		RULE_exprl = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "inicio", "fim", "decl", "tipo", "lista_var", "cmd", "cmdIf", 
			"cmdRead", "cmdWrite", "cmdAttr", "cmdWhile", "expr", "termo", "exprl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog.'", "'declare'", "'INTEGER'", "'REAL'", 
			"'if'", "'else'", "'leia'", "'escreva'", "'while'", null, null, "':='", 
			"'+'", "'-'", "'*'", "'/'", null, null, "','", "'.'", "'('", "')'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "NUMBER", 
			"TEXT", "ATTR", "SUM", "SUB", "MUL", "DIV", "OPREL", "ID", "VIRG", "PF", 
			"AP", "FP", "ACO", "FCO", "BLANK"
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
			setState(30);
			inicio();
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				decl();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				cmd();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 526144L) != 0) );
			setState(41);
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
			setState(44);
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
			setState(47);
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
			setState(50);
			match(T__2);
			setState(51);
			lista_var();
			setState(52);
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
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(T__3);
				 currentType = DataType.INTEGER; 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(T__4);
				 currentType = DataType.REAL; 
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
			setState(60);
			match(ID);
			 
							symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType)); 
							List<String> listaID = new ArrayList<>();
							listaID.add(_input.LT(-1).getText());
							
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(62);
				match(VIRG);
				setState(63);
				match(ID);
				 
				           		symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType)); 
				           		listaID.add(_input.LT(-1).getText());
				   
				           		
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			           		CmdDeclare _CmdDeclare = new CmdDeclare(listaID);
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
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				cmdAttr();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				cmdRead();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				cmdWrite();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				cmdIf();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				cmdWhile();
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
			setState(79);
			match(T__5);

							stack.push(new ArrayList<AbstractCommand>());
							BinaryExpression _relExpr = new BinaryExpression();				
							CmdIf _cmdIf = new CmdIf();
						
			setState(81);
			match(AP);
			setState(82);
			expr();

							_relExpr.setLeftSide(expression);
						
			setState(84);
			match(OPREL);

							_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
						
			setState(86);
			expr();

							_relExpr.setRightSide(expression);
							_cmdIf.setExpr(_relExpr);
							
						
			setState(88);
			match(FP);
			setState(89);
			match(ACO);
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				cmd();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 526144L) != 0) );

							_cmdIf.setListaTrue(stack.pop());
								
						
			setState(96);
			match(FCO);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(97);
				match(T__6);
				setState(98);
				match(ACO);

								stack.push(new ArrayList<AbstractCommand>());
							
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(100);
					cmd();
					}
					}
					setState(103); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 526144L) != 0) );
				setState(105);
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
			setState(111);
			match(T__7);
			setState(112);
			match(AP);
			setState(113);
			match(ID);

							Identifier id = symbolTable.get(_input.LT(-1).getText());
							if (id == null){
								throw new RuntimeException("Undeclared Variable");
							}
							CmdRead _read = new CmdRead(id);
							stack.peek().add(_read);
						 
			setState(115);
			match(FP);
			setState(116);
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
			setState(118);
			match(T__8);
			setState(119);
			match(AP);
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(120);
				match(ID);

					         	Identifier id = symbolTable.get(_input.LT(-1).getText());
					         	if (id == null){
					         		throw new RuntimeException("Undeclared Variable");	         		
					         	}
					         	CmdWrite _write = new CmdWrite(id);
					         	stack.peek().add(_write);
					         
				}
				break;
			case TEXT:
				{
				setState(122);
				match(TEXT);

					         	CmdWrite _write = new CmdWrite(_input.LT(-1).getText());
					         	stack.peek().add(_write);
					         	
					         
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(126);
			match(FP);
			setState(127);
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
			setState(129);
			match(ID);

							idAtribuido = _input.LT(-1).getText();
							if (!symbolTable.exists(_input.LT(-1).getText())){
								throw new RuntimeException("Semantic ERROR - Undeclared Identifier");
							}
							leftDT = symbolTable.get(_input.LT(-1).getText()).getType();
							rightDT = null;
						
			setState(131);
			match(ATTR);
			setState(132);
			expr();
			setState(133);
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
			setState(136);
			match(T__9);

							stack.push(new ArrayList<AbstractCommand>());
							BinaryExpression _relExpr = new BinaryExpression();				
							CmdWhile _CmdWhile = new CmdWhile();
						
			setState(138);
			match(AP);
			setState(139);
			expr();

							_relExpr.setLeftSide(expression);
						
			setState(141);
			match(OPREL);

							_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
						
			setState(143);
			expr();

							_relExpr.setRightSide(expression);
							_CmdWhile.setExpr(_relExpr);
							
						
			setState(145);
			match(FP);
			setState(146);
			match(ACO);
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				cmd();
				}
				}
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 526144L) != 0) );

							_CmdWhile.setComandos(stack.pop());
							stack.peek().add(_CmdWhile);
						
			setState(153);
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
		enterRule(_localctx, 24, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			termo();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0)) {
				{
				{
				setState(156);
				exprl();
				}
				}
				setState(161);
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
		enterRule(_localctx, 26, RULE_termo);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(NUMBER);

								expression = new NumberExpression(Integer.parseInt(_input.LT(-1).getText()));
							
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
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
									expression = new NumberExpression(id.getValue());
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
		enterRule(_localctx, 28, RULE_exprl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 
							operator = _input.LT(-1).getText().charAt(0);
							BinaryExpression _exprADD = new BinaryExpression(operator);
							_exprADD.setLeftSide(expression);
						
			setState(170);
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
		"\u0004\u0001\u001a\u00ae\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0004\u0000!\b\u0000\u000b\u0000\f\u0000\"\u0001\u0000\u0004\u0000"+
		"&\b\u0000\u000b\u0000\f\u0000\'\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004;\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005B\b\u0005\n\u0005\f\u0005E\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006N\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\\\b\u0007\u000b"+
		"\u0007\f\u0007]\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0004\u0007f\b\u0007\u000b\u0007\f\u0007g\u0001\u0007"+
		"\u0001\u0007\u0003\u0007l\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t}\b\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u0095\b\u000b\u000b"+
		"\u000b\f\u000b\u0096\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0005\f\u009e\b\f\n\f\f\f\u00a1\t\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0003\r\u00a7\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0001\u0001\u0000\u000e"+
		"\u0011\u00ad\u0000\u001e\u0001\u0000\u0000\u0000\u0002,\u0001\u0000\u0000"+
		"\u0000\u0004/\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000\b"+
		":\u0001\u0000\u0000\u0000\n<\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000"+
		"\u0000\u000eO\u0001\u0000\u0000\u0000\u0010o\u0001\u0000\u0000\u0000\u0012"+
		"v\u0001\u0000\u0000\u0000\u0014\u0081\u0001\u0000\u0000\u0000\u0016\u0088"+
		"\u0001\u0000\u0000\u0000\u0018\u009b\u0001\u0000\u0000\u0000\u001a\u00a6"+
		"\u0001\u0000\u0000\u0000\u001c\u00a8\u0001\u0000\u0000\u0000\u001e \u0003"+
		"\u0002\u0001\u0000\u001f!\u0003\u0006\u0003\u0000 \u001f\u0001\u0000\u0000"+
		"\u0000!\"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001"+
		"\u0000\u0000\u0000#%\u0001\u0000\u0000\u0000$&\u0003\f\u0006\u0000%$\u0001"+
		"\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000"+
		"\'(\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0003\u0004\u0002"+
		"\u0000*+\u0006\u0000\uffff\uffff\u0000+\u0001\u0001\u0000\u0000\u0000"+
		",-\u0005\u0001\u0000\u0000-.\u0006\u0001\uffff\uffff\u0000.\u0003\u0001"+
		"\u0000\u0000\u0000/0\u0005\u0002\u0000\u000001\u0006\u0002\uffff\uffff"+
		"\u00001\u0005\u0001\u0000\u0000\u000023\u0005\u0003\u0000\u000034\u0003"+
		"\n\u0005\u000045\u0005\u0015\u0000\u00005\u0007\u0001\u0000\u0000\u0000"+
		"67\u0005\u0004\u0000\u00007;\u0006\u0004\uffff\uffff\u000089\u0005\u0005"+
		"\u0000\u00009;\u0006\u0004\uffff\uffff\u0000:6\u0001\u0000\u0000\u0000"+
		":8\u0001\u0000\u0000\u0000;\t\u0001\u0000\u0000\u0000<=\u0005\u0013\u0000"+
		"\u0000=C\u0006\u0005\uffff\uffff\u0000>?\u0005\u0014\u0000\u0000?@\u0005"+
		"\u0013\u0000\u0000@B\u0006\u0005\uffff\uffff\u0000A>\u0001\u0000\u0000"+
		"\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0006"+
		"\u0005\uffff\uffff\u0000G\u000b\u0001\u0000\u0000\u0000HN\u0003\u0014"+
		"\n\u0000IN\u0003\u0010\b\u0000JN\u0003\u0012\t\u0000KN\u0003\u000e\u0007"+
		"\u0000LN\u0003\u0016\u000b\u0000MH\u0001\u0000\u0000\u0000MI\u0001\u0000"+
		"\u0000\u0000MJ\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000ML\u0001"+
		"\u0000\u0000\u0000N\r\u0001\u0000\u0000\u0000OP\u0005\u0006\u0000\u0000"+
		"PQ\u0006\u0007\uffff\uffff\u0000QR\u0005\u0016\u0000\u0000RS\u0003\u0018"+
		"\f\u0000ST\u0006\u0007\uffff\uffff\u0000TU\u0005\u0012\u0000\u0000UV\u0006"+
		"\u0007\uffff\uffff\u0000VW\u0003\u0018\f\u0000WX\u0006\u0007\uffff\uffff"+
		"\u0000XY\u0005\u0017\u0000\u0000Y[\u0005\u0018\u0000\u0000Z\\\u0003\f"+
		"\u0006\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_`\u0006\u0007\uffff\uffff\u0000`k\u0005\u0019\u0000\u0000ab\u0005\u0007"+
		"\u0000\u0000bc\u0005\u0018\u0000\u0000ce\u0006\u0007\uffff\uffff\u0000"+
		"df\u0003\f\u0006\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ij\u0005\u0019\u0000\u0000jl\u0001\u0000\u0000\u0000ka\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0006"+
		"\u0007\uffff\uffff\u0000n\u000f\u0001\u0000\u0000\u0000op\u0005\b\u0000"+
		"\u0000pq\u0005\u0016\u0000\u0000qr\u0005\u0013\u0000\u0000rs\u0006\b\uffff"+
		"\uffff\u0000st\u0005\u0017\u0000\u0000tu\u0005\u0015\u0000\u0000u\u0011"+
		"\u0001\u0000\u0000\u0000vw\u0005\t\u0000\u0000w|\u0005\u0016\u0000\u0000"+
		"xy\u0005\u0013\u0000\u0000y}\u0006\t\uffff\uffff\u0000z{\u0005\f\u0000"+
		"\u0000{}\u0006\t\uffff\uffff\u0000|x\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0005\u0017\u0000\u0000"+
		"\u007f\u0080\u0005\u0015\u0000\u0000\u0080\u0013\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005\u0013\u0000\u0000\u0082\u0083\u0006\n\uffff\uffff\u0000"+
		"\u0083\u0084\u0005\r\u0000\u0000\u0084\u0085\u0003\u0018\f\u0000\u0085"+
		"\u0086\u0005\u0015\u0000\u0000\u0086\u0087\u0006\n\uffff\uffff\u0000\u0087"+
		"\u0015\u0001\u0000\u0000\u0000\u0088\u0089\u0005\n\u0000\u0000\u0089\u008a"+
		"\u0006\u000b\uffff\uffff\u0000\u008a\u008b\u0005\u0016\u0000\u0000\u008b"+
		"\u008c\u0003\u0018\f\u0000\u008c\u008d\u0006\u000b\uffff\uffff\u0000\u008d"+
		"\u008e\u0005\u0012\u0000\u0000\u008e\u008f\u0006\u000b\uffff\uffff\u0000"+
		"\u008f\u0090\u0003\u0018\f\u0000\u0090\u0091\u0006\u000b\uffff\uffff\u0000"+
		"\u0091\u0092\u0005\u0017\u0000\u0000\u0092\u0094\u0005\u0018\u0000\u0000"+
		"\u0093\u0095\u0003\f\u0006\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0006\u000b\uffff\uffff\u0000\u0099\u009a\u0005\u0019\u0000\u0000"+
		"\u009a\u0017\u0001\u0000\u0000\u0000\u009b\u009f\u0003\u001a\r\u0000\u009c"+
		"\u009e\u0003\u001c\u000e\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u0019\u0001\u0000\u0000\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u000b\u0000\u0000\u00a3"+
		"\u00a7\u0006\r\uffff\uffff\u0000\u00a4\u00a5\u0005\u0013\u0000\u0000\u00a5"+
		"\u00a7\u0006\r\uffff\uffff\u0000\u00a6\u00a2\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a7\u001b\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0007\u0000\u0000\u0000\u00a9\u00aa\u0006\u000e\uffff\uffff\u0000"+
		"\u00aa\u00ab\u0003\u001a\r\u0000\u00ab\u00ac\u0006\u000e\uffff\uffff\u0000"+
		"\u00ac\u001d\u0001\u0000\u0000\u0000\f\"\':CM]gk|\u0096\u009f\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}