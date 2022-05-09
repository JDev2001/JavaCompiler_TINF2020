// Generated from F:/User Folder/Desktop/JavaCompiler_TINF2020/Project/Parser/src/grammar\antlrGrammar.g4 by ANTLR 4.9.2
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class antlrGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, AccessModifier=8, 
		JBoolean=9, JNull=10, Void=11, Super=12, This=13, If=14, Else=15, Equal=16, 
		PlusEqual=17, MinusEqual=18, Comperator=19, NotOperator=20, OpBeforeOrAfterIdentifier=21, 
		PointOperator=22, AddSubOperator=23, LogicalOperator=24, LBracket=25, 
		RBracket=26, CurlyLBracket=27, CurlyRBracket=28, Dot=29, Comma=30, Semicolon=31, 
		Identifier=32, JCharacter=33, JInteger=34, WS=35, Comment=36, LineComment=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "AccessModifier", 
			"JBoolean", "JNull", "Void", "Super", "This", "If", "Else", "Equal", 
			"PlusEqual", "MinusEqual", "Comperator", "NotOperator", "OpBeforeOrAfterIdentifier", 
			"PointOperator", "AddSubOperator", "LogicalOperator", "LBracket", "RBracket", 
			"CurlyLBracket", "CurlyRBracket", "Dot", "Comma", "Semicolon", "Identifier", 
			"JCharacter", "JInteger", "WS", "Comment", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'new'", "'while'", "'return'", "'int'", "'char'", "'boolean'", 
			null, null, "'null'", "'void'", "'super'", "'this'", "'if'", "'else'", 
			"'='", "'+='", "'-='", null, "'!'", null, null, null, null, "'('", "')'", 
			"'{'", "'}'", "'.'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "AccessModifier", "JBoolean", 
			"JNull", "Void", "Super", "This", "If", "Else", "Equal", "PlusEqual", 
			"MinusEqual", "Comperator", "NotOperator", "OpBeforeOrAfterIdentifier", 
			"PointOperator", "AddSubOperator", "LogicalOperator", "LBracket", "RBracket", 
			"CurlyLBracket", "CurlyRBracket", "Dot", "Comma", "Semicolon", "Identifier", 
			"JCharacter", "JInteger", "WS", "Comment", "LineComment"
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


	public antlrGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "antlrGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0118\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u008c\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0097\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\5\24\u00c7\n\24\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00cf\n\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u00d9\n\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\7!\u00eb\n!"+
		"\f!\16!\u00ee\13!\3\"\3\"\3\"\3\"\3#\6#\u00f5\n#\r#\16#\u00f6\3$\6$\u00fa"+
		"\n$\r$\16$\u00fb\3$\3$\3%\3%\3%\3%\7%\u0104\n%\f%\16%\u0107\13%\3%\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\7&\u0112\n&\f&\16&\u0115\13&\3&\3&\3\u0105\2\'\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'\3\2\n\4\2>>@@\4\2,,\61\61\5\2\'\'--//\4\2C\\c|\5\2\62"+
		";C\\c|\3\2\62;\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0125\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\3M\3\2\2\2\5S\3\2\2\2\7W\3\2\2\2\t]\3\2\2\2\13d\3\2\2\2\rh\3"+
		"\2\2\2\17m\3\2\2\2\21\u008b\3\2\2\2\23\u0096\3\2\2\2\25\u0098\3\2\2\2"+
		"\27\u009d\3\2\2\2\31\u00a2\3\2\2\2\33\u00a8\3\2\2\2\35\u00ad\3\2\2\2\37"+
		"\u00b0\3\2\2\2!\u00b5\3\2\2\2#\u00b7\3\2\2\2%\u00ba\3\2\2\2\'\u00c6\3"+
		"\2\2\2)\u00c8\3\2\2\2+\u00ce\3\2\2\2-\u00d0\3\2\2\2/\u00d2\3\2\2\2\61"+
		"\u00d8\3\2\2\2\63\u00da\3\2\2\2\65\u00dc\3\2\2\2\67\u00de\3\2\2\29\u00e0"+
		"\3\2\2\2;\u00e2\3\2\2\2=\u00e4\3\2\2\2?\u00e6\3\2\2\2A\u00e8\3\2\2\2C"+
		"\u00ef\3\2\2\2E\u00f4\3\2\2\2G\u00f9\3\2\2\2I\u00ff\3\2\2\2K\u010d\3\2"+
		"\2\2MN\7e\2\2NO\7n\2\2OP\7c\2\2PQ\7u\2\2QR\7u\2\2R\4\3\2\2\2ST\7p\2\2"+
		"TU\7g\2\2UV\7y\2\2V\6\3\2\2\2WX\7y\2\2XY\7j\2\2YZ\7k\2\2Z[\7n\2\2[\\\7"+
		"g\2\2\\\b\3\2\2\2]^\7t\2\2^_\7g\2\2_`\7v\2\2`a\7w\2\2ab\7t\2\2bc\7p\2"+
		"\2c\n\3\2\2\2de\7k\2\2ef\7p\2\2fg\7v\2\2g\f\3\2\2\2hi\7e\2\2ij\7j\2\2"+
		"jk\7c\2\2kl\7t\2\2l\16\3\2\2\2mn\7d\2\2no\7q\2\2op\7q\2\2pq\7n\2\2qr\7"+
		"g\2\2rs\7c\2\2st\7p\2\2t\20\3\2\2\2uv\7r\2\2vw\7w\2\2wx\7d\2\2xy\7n\2"+
		"\2yz\7k\2\2z\u008c\7e\2\2{|\7r\2\2|}\7t\2\2}~\7q\2\2~\177\7v\2\2\177\u0080"+
		"\7g\2\2\u0080\u0081\7e\2\2\u0081\u0082\7v\2\2\u0082\u0083\7g\2\2\u0083"+
		"\u008c\7f\2\2\u0084\u0085\7r\2\2\u0085\u0086\7t\2\2\u0086\u0087\7k\2\2"+
		"\u0087\u0088\7x\2\2\u0088\u0089\7c\2\2\u0089\u008a\7v\2\2\u008a\u008c"+
		"\7g\2\2\u008bu\3\2\2\2\u008b{\3\2\2\2\u008b\u0084\3\2\2\2\u008c\22\3\2"+
		"\2\2\u008d\u008e\7v\2\2\u008e\u008f\7t\2\2\u008f\u0090\7w\2\2\u0090\u0097"+
		"\7g\2\2\u0091\u0092\7h\2\2\u0092\u0093\7c\2\2\u0093\u0094\7n\2\2\u0094"+
		"\u0095\7u\2\2\u0095\u0097\7g\2\2\u0096\u008d\3\2\2\2\u0096\u0091\3\2\2"+
		"\2\u0097\24\3\2\2\2\u0098\u0099\7p\2\2\u0099\u009a\7w\2\2\u009a\u009b"+
		"\7n\2\2\u009b\u009c\7n\2\2\u009c\26\3\2\2\2\u009d\u009e\7x\2\2\u009e\u009f"+
		"\7q\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7f\2\2\u00a1\30\3\2\2\2\u00a2\u00a3"+
		"\7u\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\u00a7\7t\2\2\u00a7\32\3\2\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7j\2\2\u00aa"+
		"\u00ab\7k\2\2\u00ab\u00ac\7u\2\2\u00ac\34\3\2\2\2\u00ad\u00ae\7k\2\2\u00ae"+
		"\u00af\7h\2\2\u00af\36\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7n\2\2\u00b2"+
		"\u00b3\7u\2\2\u00b3\u00b4\7g\2\2\u00b4 \3\2\2\2\u00b5\u00b6\7?\2\2\u00b6"+
		"\"\3\2\2\2\u00b7\u00b8\7-\2\2\u00b8\u00b9\7?\2\2\u00b9$\3\2\2\2\u00ba"+
		"\u00bb\7/\2\2\u00bb\u00bc\7?\2\2\u00bc&\3\2\2\2\u00bd\u00be\7?\2\2\u00be"+
		"\u00c7\7?\2\2\u00bf\u00c0\7#\2\2\u00c0\u00c7\7?\2\2\u00c1\u00c2\7@\2\2"+
		"\u00c2\u00c7\7?\2\2\u00c3\u00c4\7>\2\2\u00c4\u00c7\7?\2\2\u00c5\u00c7"+
		"\t\2\2\2\u00c6\u00bd\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6"+
		"\u00c3\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7(\3\2\2\2\u00c8\u00c9\7#\2\2\u00c9"+
		"*\3\2\2\2\u00ca\u00cb\7-\2\2\u00cb\u00cf\7-\2\2\u00cc\u00cd\7/\2\2\u00cd"+
		"\u00cf\7/\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf,\3\2\2\2\u00d0"+
		"\u00d1\t\3\2\2\u00d1.\3\2\2\2\u00d2\u00d3\t\4\2\2\u00d3\60\3\2\2\2\u00d4"+
		"\u00d5\7(\2\2\u00d5\u00d9\7(\2\2\u00d6\u00d7\7~\2\2\u00d7\u00d9\7~\2\2"+
		"\u00d8\u00d4\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\62\3\2\2\2\u00da\u00db"+
		"\7*\2\2\u00db\64\3\2\2\2\u00dc\u00dd\7+\2\2\u00dd\66\3\2\2\2\u00de\u00df"+
		"\7}\2\2\u00df8\3\2\2\2\u00e0\u00e1\7\177\2\2\u00e1:\3\2\2\2\u00e2\u00e3"+
		"\7\60\2\2\u00e3<\3\2\2\2\u00e4\u00e5\7.\2\2\u00e5>\3\2\2\2\u00e6\u00e7"+
		"\7=\2\2\u00e7@\3\2\2\2\u00e8\u00ec\t\5\2\2\u00e9\u00eb\t\6\2\2\u00ea\u00e9"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"B\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7)\2\2\u00f0\u00f1\t\5\2\2\u00f1"+
		"\u00f2\7)\2\2\u00f2D\3\2\2\2\u00f3\u00f5\t\7\2\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7F\3\2\2\2"+
		"\u00f8\u00fa\t\b\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\b$\2\2\u00fe"+
		"H\3\2\2\2\u00ff\u0100\7\61\2\2\u0100\u0101\7,\2\2\u0101\u0105\3\2\2\2"+
		"\u0102\u0104\13\2\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u0109\7,\2\2\u0109\u010a\7\61\2\2\u010a\u010b\3\2\2\2\u010b\u010c\b%"+
		"\2\2\u010cJ\3\2\2\2\u010d\u010e\7\61\2\2\u010e\u010f\7\61\2\2\u010f\u0113"+
		"\3\2\2\2\u0110\u0112\n\t\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0116\u0117\b&\2\2\u0117L\3\2\2\2\r\2\u008b\u0096\u00c6\u00ce\u00d8"+
		"\u00ec\u00f6\u00fb\u0105\u0113\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}