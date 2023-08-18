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
	

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TypeExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, NUMBER=12, TEXT=13, ATTR=14, SUM=15, SUB=16, MUL=17, 
		DIV=18, OPREL=19, ID=20, VIRG=21, PF=22, AP=23, FP=24, ACO=25, FCO=26, 
		BLANK=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "NUMBER", "TEXT", "ATTR", "SUM", "SUB", "MUL", "DIV", 
			"OPREL", "ID", "VIRG", "PF", "AP", "FP", "ACO", "FCO", "BLANK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog.'", "'declare'", "'INTEGER'", "'REAL'", 
			"'if'", "'else'", "'leia'", "'escreva'", "'while'", "'do'", null, null, 
			"':='", "'+'", "'-'", "'*'", "'/'", null, null, "','", "'.'", "'('", 
			"')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NUMBER", "TEXT", "ATTR", "SUM", "SUB", "MUL", "DIV", "OPREL", "ID", 
			"VIRG", "PF", "AP", "FP", "ACO", "FCO", "BLANK"
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


	public TypeExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TypeExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001b\u00ba\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0004\u000b~\b"+
		"\u000b\u000b\u000b\f\u000b\u007f\u0001\f\u0001\f\u0005\f\u0084\b\f\n\f"+
		"\f\f\u0087\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00a0"+
		"\b\u0012\u0001\u0013\u0003\u0013\u00a3\b\u0013\u0001\u0013\u0005\u0013"+
		"\u00a6\b\u0013\n\u0013\f\u0013\u00a9\t\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0000\u0000\u001b\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b\u0001"+
		"\u0000\u0005\u0001\u000009\u0006\u0000\t\t !--09AZaz\u0002\u0000AZaz\u0003"+
		"\u000009AZaz\u0003\u0000\t\n\r\r  \u00c1\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00017\u0001\u0000\u0000\u0000\u0003@\u0001\u0000\u0000\u0000"+
		"\u0005I\u0001\u0000\u0000\u0000\u0007Q\u0001\u0000\u0000\u0000\tY\u0001"+
		"\u0000\u0000\u0000\u000b^\u0001\u0000\u0000\u0000\ra\u0001\u0000\u0000"+
		"\u0000\u000ff\u0001\u0000\u0000\u0000\u0011k\u0001\u0000\u0000\u0000\u0013"+
		"s\u0001\u0000\u0000\u0000\u0015y\u0001\u0000\u0000\u0000\u0017}\u0001"+
		"\u0000\u0000\u0000\u0019\u0081\u0001\u0000\u0000\u0000\u001b\u008a\u0001"+
		"\u0000\u0000\u0000\u001d\u008d\u0001\u0000\u0000\u0000\u001f\u008f\u0001"+
		"\u0000\u0000\u0000!\u0091\u0001\u0000\u0000\u0000#\u0093\u0001\u0000\u0000"+
		"\u0000%\u009f\u0001\u0000\u0000\u0000\'\u00a2\u0001\u0000\u0000\u0000"+
		")\u00aa\u0001\u0000\u0000\u0000+\u00ac\u0001\u0000\u0000\u0000-\u00ae"+
		"\u0001\u0000\u0000\u0000/\u00b0\u0001\u0000\u0000\u00001\u00b2\u0001\u0000"+
		"\u0000\u00003\u00b4\u0001\u0000\u0000\u00005\u00b6\u0001\u0000\u0000\u0000"+
		"78\u0005p\u0000\u000089\u0005r\u0000\u00009:\u0005o\u0000\u0000:;\u0005"+
		"g\u0000\u0000;<\u0005r\u0000\u0000<=\u0005a\u0000\u0000=>\u0005m\u0000"+
		"\u0000>?\u0005a\u0000\u0000?\u0002\u0001\u0000\u0000\u0000@A\u0005f\u0000"+
		"\u0000AB\u0005i\u0000\u0000BC\u0005m\u0000\u0000CD\u0005p\u0000\u0000"+
		"DE\u0005r\u0000\u0000EF\u0005o\u0000\u0000FG\u0005g\u0000\u0000GH\u0005"+
		".\u0000\u0000H\u0004\u0001\u0000\u0000\u0000IJ\u0005d\u0000\u0000JK\u0005"+
		"e\u0000\u0000KL\u0005c\u0000\u0000LM\u0005l\u0000\u0000MN\u0005a\u0000"+
		"\u0000NO\u0005r\u0000\u0000OP\u0005e\u0000\u0000P\u0006\u0001\u0000\u0000"+
		"\u0000QR\u0005I\u0000\u0000RS\u0005N\u0000\u0000ST\u0005T\u0000\u0000"+
		"TU\u0005E\u0000\u0000UV\u0005G\u0000\u0000VW\u0005E\u0000\u0000WX\u0005"+
		"R\u0000\u0000X\b\u0001\u0000\u0000\u0000YZ\u0005R\u0000\u0000Z[\u0005"+
		"E\u0000\u0000[\\\u0005A\u0000\u0000\\]\u0005L\u0000\u0000]\n\u0001\u0000"+
		"\u0000\u0000^_\u0005i\u0000\u0000_`\u0005f\u0000\u0000`\f\u0001\u0000"+
		"\u0000\u0000ab\u0005e\u0000\u0000bc\u0005l\u0000\u0000cd\u0005s\u0000"+
		"\u0000de\u0005e\u0000\u0000e\u000e\u0001\u0000\u0000\u0000fg\u0005l\u0000"+
		"\u0000gh\u0005e\u0000\u0000hi\u0005i\u0000\u0000ij\u0005a\u0000\u0000"+
		"j\u0010\u0001\u0000\u0000\u0000kl\u0005e\u0000\u0000lm\u0005s\u0000\u0000"+
		"mn\u0005c\u0000\u0000no\u0005r\u0000\u0000op\u0005e\u0000\u0000pq\u0005"+
		"v\u0000\u0000qr\u0005a\u0000\u0000r\u0012\u0001\u0000\u0000\u0000st\u0005"+
		"w\u0000\u0000tu\u0005h\u0000\u0000uv\u0005i\u0000\u0000vw\u0005l\u0000"+
		"\u0000wx\u0005e\u0000\u0000x\u0014\u0001\u0000\u0000\u0000yz\u0005d\u0000"+
		"\u0000z{\u0005o\u0000\u0000{\u0016\u0001\u0000\u0000\u0000|~\u0007\u0000"+
		"\u0000\u0000}|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0018\u0001\u0000\u0000\u0000\u0081\u0085\u0005\"\u0000\u0000\u0082\u0084"+
		"\u0007\u0001\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005\"\u0000\u0000\u0089\u001a\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005:\u0000\u0000\u008b\u008c\u0005=\u0000"+
		"\u0000\u008c\u001c\u0001\u0000\u0000\u0000\u008d\u008e\u0005+\u0000\u0000"+
		"\u008e\u001e\u0001\u0000\u0000\u0000\u008f\u0090\u0005-\u0000\u0000\u0090"+
		" \u0001\u0000\u0000\u0000\u0091\u0092\u0005*\u0000\u0000\u0092\"\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0005/\u0000\u0000\u0094$\u0001\u0000\u0000"+
		"\u0000\u0095\u00a0\u0005>\u0000\u0000\u0096\u0097\u0005>\u0000\u0000\u0097"+
		"\u00a0\u0005=\u0000\u0000\u0098\u00a0\u0005<\u0000\u0000\u0099\u009a\u0005"+
		"<\u0000\u0000\u009a\u00a0\u0005=\u0000\u0000\u009b\u009c\u0005=\u0000"+
		"\u0000\u009c\u00a0\u0005=\u0000\u0000\u009d\u009e\u0005!\u0000\u0000\u009e"+
		"\u00a0\u0005=\u0000\u0000\u009f\u0095\u0001\u0000\u0000\u0000\u009f\u0096"+
		"\u0001\u0000\u0000\u0000\u009f\u0098\u0001\u0000\u0000\u0000\u009f\u0099"+
		"\u0001\u0000\u0000\u0000\u009f\u009b\u0001\u0000\u0000\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u00a0&\u0001\u0000\u0000\u0000\u00a1\u00a3\u0007"+
		"\u0002\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a6\u0007\u0003\u0000\u0000\u00a5\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8(\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005,\u0000"+
		"\u0000\u00ab*\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005.\u0000\u0000\u00ad"+
		",\u0001\u0000\u0000\u0000\u00ae\u00af\u0005(\u0000\u0000\u00af.\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0005)\u0000\u0000\u00b10\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0005{\u0000\u0000\u00b32\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0005}\u0000\u0000\u00b54\u0001\u0000\u0000\u0000\u00b6\u00b7\u0007"+
		"\u0004\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0006"+
		"\u001a\u0000\u0000\u00b96\u0001\u0000\u0000\u0000\b\u0000\u007f\u0083"+
		"\u0085\u009f\u00a2\u00a5\u00a7\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}