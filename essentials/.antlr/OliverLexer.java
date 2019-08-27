// Generated from /home/wesley/Documents/ufabc/10QUAD/compiladores/projeto/essentials/Oliver.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OliverLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, OP_REL=17, 
		OP_AS=18, OP_AC=19, TEXTO=20, NUM=21, REAL=22, TIPO=23, ID=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "OP_REL", 
		"OP_AS", "OP_AC", "TEXTO", "NUM", "REAL", "TIPO", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Oliver'", "'Moriturus te saluto'", "'let'", "','", "'as'", "'read'", 
		"'write'", "'if'", "'('", "')'", "'{'", "'}'", "'else'", "'while'", "'do'", 
		"'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "OP_REL", "OP_AS", "OP_AC", "TEXTO", "NUM", 
		"REAL", "TIPO", "ID", "WS"
	};
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


	public OliverLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Oliver.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00c3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0089\n\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\6\25\u0091\n\25\r\25\16\25\u0092\3\25\3\25\3\26\6\26\u0098\n\26\r\26"+
		"\16\26\u0099\3\27\6\27\u009d\n\27\r\27\16\27\u009e\3\27\3\27\6\27\u00a3"+
		"\n\27\r\27\16\27\u00a4\5\27\u00a7\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\5\30\u00b4\n\30\3\31\3\31\7\31\u00b8\n\31\f\31"+
		"\16\31\u00bb\13\31\3\32\6\32\u00be\n\32\r\32\16\32\u00bf\3\32\3\32\2\2"+
		"\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\n\4\2>>@@\4"+
		"\2--//\4\2,,\61\61\6\2\f\f\17\17$$^^\3\2\62;\3\2c|\5\2\62;C\\c|\5\2\13"+
		"\f\17\17\"\"\2\u00ce\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5<\3\2\2"+
		"\2\7P\3\2\2\2\tT\3\2\2\2\13V\3\2\2\2\rY\3\2\2\2\17^\3\2\2\2\21d\3\2\2"+
		"\2\23g\3\2\2\2\25i\3\2\2\2\27k\3\2\2\2\31m\3\2\2\2\33o\3\2\2\2\35t\3\2"+
		"\2\2\37z\3\2\2\2!}\3\2\2\2#\u0088\3\2\2\2%\u008a\3\2\2\2\'\u008c\3\2\2"+
		"\2)\u008e\3\2\2\2+\u0097\3\2\2\2-\u009c\3\2\2\2/\u00b3\3\2\2\2\61\u00b5"+
		"\3\2\2\2\63\u00bd\3\2\2\2\65\66\7Q\2\2\66\67\7n\2\2\678\7k\2\289\7x\2"+
		"\29:\7g\2\2:;\7t\2\2;\4\3\2\2\2<=\7O\2\2=>\7q\2\2>?\7t\2\2?@\7k\2\2@A"+
		"\7v\2\2AB\7w\2\2BC\7t\2\2CD\7w\2\2DE\7u\2\2EF\7\"\2\2FG\7v\2\2GH\7g\2"+
		"\2HI\7\"\2\2IJ\7u\2\2JK\7c\2\2KL\7n\2\2LM\7w\2\2MN\7v\2\2NO\7q\2\2O\6"+
		"\3\2\2\2PQ\7n\2\2QR\7g\2\2RS\7v\2\2S\b\3\2\2\2TU\7.\2\2U\n\3\2\2\2VW\7"+
		"c\2\2WX\7u\2\2X\f\3\2\2\2YZ\7t\2\2Z[\7g\2\2[\\\7c\2\2\\]\7f\2\2]\16\3"+
		"\2\2\2^_\7y\2\2_`\7t\2\2`a\7k\2\2ab\7v\2\2bc\7g\2\2c\20\3\2\2\2de\7k\2"+
		"\2ef\7h\2\2f\22\3\2\2\2gh\7*\2\2h\24\3\2\2\2ij\7+\2\2j\26\3\2\2\2kl\7"+
		"}\2\2l\30\3\2\2\2mn\7\177\2\2n\32\3\2\2\2op\7g\2\2pq\7n\2\2qr\7u\2\2r"+
		"s\7g\2\2s\34\3\2\2\2tu\7y\2\2uv\7j\2\2vw\7k\2\2wx\7n\2\2xy\7g\2\2y\36"+
		"\3\2\2\2z{\7f\2\2{|\7q\2\2| \3\2\2\2}~\7?\2\2~\"\3\2\2\2\177\u0089\t\2"+
		"\2\2\u0080\u0081\7>\2\2\u0081\u0089\7?\2\2\u0082\u0083\7@\2\2\u0083\u0089"+
		"\7?\2\2\u0084\u0085\7#\2\2\u0085\u0089\7?\2\2\u0086\u0087\7?\2\2\u0087"+
		"\u0089\7?\2\2\u0088\177\3\2\2\2\u0088\u0080\3\2\2\2\u0088\u0082\3\2\2"+
		"\2\u0088\u0084\3\2\2\2\u0088\u0086\3\2\2\2\u0089$\3\2\2\2\u008a\u008b"+
		"\t\3\2\2\u008b&\3\2\2\2\u008c\u008d\t\4\2\2\u008d(\3\2\2\2\u008e\u0090"+
		"\7$\2\2\u008f\u0091\n\5\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7$"+
		"\2\2\u0095*\3\2\2\2\u0096\u0098\t\6\2\2\u0097\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a,\3\2\2\2\u009b"+
		"\u009d\t\6\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a6\3\2\2\2\u00a0\u00a2\7\60\2\2\u00a1"+
		"\u00a3\t\6\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7.\3\2\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7g\2\2\u00aa"+
		"\u00ab\7c\2\2\u00ab\u00b4\7n\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2"+
		"\u00ae\u00af\7v\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7i\2\2\u00b1\u00b2"+
		"\7g\2\2\u00b2\u00b4\7t\2\2\u00b3\u00a8\3\2\2\2\u00b3\u00ac\3\2\2\2\u00b4"+
		"\60\3\2\2\2\u00b5\u00b9\t\7\2\2\u00b6\u00b8\t\b\2\2\u00b7\u00b6\3\2\2"+
		"\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\62"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\t\t\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c2\b\32\2\2\u00c2\64\3\2\2\2\f\2\u0088\u0092\u0099\u009e"+
		"\u00a4\u00a6\u00b3\u00b9\u00bf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}