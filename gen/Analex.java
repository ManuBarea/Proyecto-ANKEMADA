// Generated from C:/Users/Manuel/OneDrive/Documentos/Grado Ing Informatica/4�/PL2020/PROCESADORES DE LENGUAJES/Proyecto-ANKEMADA/src\Analex.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Analex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, VARIABLES=4, SUBPROGRAMAS=5, FUNCION=6, 
		PROCEDIMIENTO=7, FPROCEDIMIENTO=8, NUM=9, LOG=10, SEQ=11, DEV=12, CIERTO=13, 
		FALSO=14, ENTERO=15, BOOLEANO=16, Y=17, O=18, NO=19, NUMERO=20, IDENT=21, 
		DP=22, PA=23, PC=24, PyC=25, COMA=26, ASIG=27, MAYOR=28, MENOR=29, IGUAL=30, 
		MAS=31, MENOS=32, POR=33, DIV=34, COMENTARIO_BLOQUE=35, COMENTARIO_LINEA=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "VARIABLES", "SUBPROGRAMAS", 
			"FUNCION", "PROCEDIMIENTO", "FPROCEDIMIENTO", "NUM", "LOG", "SEQ", "DEV", 
			"CIERTO", "FALSO", "ENTERO", "BOOLEANO", "Y", "O", "NO", "NUMERO", "IDENT", 
			"DP", "PA", "PC", "PyC", "COMA", "ASIG", "MAYOR", "MENOR", "IGUAL", "MAS", 
			"MENOS", "POR", "DIV", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'VARIABLES'", "'SUBPROGRAMAS'", "'FUNCION'", 
			"'PROCEDIMIENTO'", "'FPROCEDIMIENTO'", "'NUM'", "'LOG'", "'SEQ'", "'dev'", 
			"'cierto'", "'falso'", "'entero'", "'booleano'", "'O'", "'Y'", "'NO'", 
			null, null, "':'", "'('", "')'", "';'", "','", "'='", "'>'", "'<'", "'=='", 
			"'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "VARIABLES", "SUBPROGRAMAS", 
			"FUNCION", "PROCEDIMIENTO", "FPROCEDIMIENTO", "NUM", "LOG", "SEQ", "DEV", 
			"CIERTO", "FALSO", "ENTERO", "BOOLEANO", "Y", "O", "NO", "NUMERO", "IDENT", 
			"DP", "PA", "PC", "PyC", "COMA", "ASIG", "MAYOR", "MENOR", "IGUAL", "MAS", 
			"MENOS", "POR", "DIV", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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


	public Analex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Analex.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0119\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\5\4Y\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\5\27\u00d4\n\27\3\27\6\27\u00d7\n\27\r\27\16\27\u00d8\3\30\3\30"+
		"\3\30\3\30\7\30\u00df\n\30\f\30\16\30\u00e2\13\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\7&\u0103\n&\f&\16&\u0106\13&\3&\3&"+
		"\3&\3&\3&\3\'\3\'\3\'\3\'\7\'\u0111\n\'\f\'\16\'\u0114\13\'\3\'\3\'\3"+
		"\'\3\'\4\u0104\u0112\2(\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27"+
		"\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31"+
		"\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&\3\2\4\3\2\62;\4\2C\\c|\2\u011e"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\3O\3\2\2\2\5S\3\2\2\2\7X\3\2\2\2\t^\3\2\2\2\13`\3\2\2\2\rb\3"+
		"\2\2\2\17l\3\2\2\2\21y\3\2\2\2\23\u0081\3\2\2\2\25\u008f\3\2\2\2\27\u009e"+
		"\3\2\2\2\31\u00a2\3\2\2\2\33\u00a6\3\2\2\2\35\u00aa\3\2\2\2\37\u00ae\3"+
		"\2\2\2!\u00b5\3\2\2\2#\u00bb\3\2\2\2%\u00c2\3\2\2\2\'\u00cb\3\2\2\2)\u00cd"+
		"\3\2\2\2+\u00cf\3\2\2\2-\u00d3\3\2\2\2/\u00da\3\2\2\2\61\u00e3\3\2\2\2"+
		"\63\u00e5\3\2\2\2\65\u00e7\3\2\2\2\67\u00e9\3\2\2\29\u00eb\3\2\2\2;\u00ed"+
		"\3\2\2\2=\u00ef\3\2\2\2?\u00f1\3\2\2\2A\u00f3\3\2\2\2C\u00f6\3\2\2\2E"+
		"\u00f8\3\2\2\2G\u00fa\3\2\2\2I\u00fc\3\2\2\2K\u00fe\3\2\2\2M\u010c\3\2"+
		"\2\2OP\7\"\2\2PQ\3\2\2\2QR\b\2\2\2R\4\3\2\2\2ST\7\13\2\2TU\3\2\2\2UV\b"+
		"\3\2\2V\6\3\2\2\2WY\7\17\2\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\f\2\2["+
		"\\\3\2\2\2\\]\b\4\2\2]\b\3\2\2\2^_\t\2\2\2_\n\3\2\2\2`a\t\3\2\2a\f\3\2"+
		"\2\2bc\7X\2\2cd\7C\2\2de\7T\2\2ef\7K\2\2fg\7C\2\2gh\7D\2\2hi\7N\2\2ij"+
		"\7G\2\2jk\7U\2\2k\16\3\2\2\2lm\7U\2\2mn\7W\2\2no\7D\2\2op\7R\2\2pq\7T"+
		"\2\2qr\7Q\2\2rs\7I\2\2st\7T\2\2tu\7C\2\2uv\7O\2\2vw\7C\2\2wx\7U\2\2x\20"+
		"\3\2\2\2yz\7H\2\2z{\7W\2\2{|\7P\2\2|}\7E\2\2}~\7K\2\2~\177\7Q\2\2\177"+
		"\u0080\7P\2\2\u0080\22\3\2\2\2\u0081\u0082\7R\2\2\u0082\u0083\7T\2\2\u0083"+
		"\u0084\7Q\2\2\u0084\u0085\7E\2\2\u0085\u0086\7G\2\2\u0086\u0087\7F\2\2"+
		"\u0087\u0088\7K\2\2\u0088\u0089\7O\2\2\u0089\u008a\7K\2\2\u008a\u008b"+
		"\7G\2\2\u008b\u008c\7P\2\2\u008c\u008d\7V\2\2\u008d\u008e\7Q\2\2\u008e"+
		"\24\3\2\2\2\u008f\u0090\7H\2\2\u0090\u0091\7R\2\2\u0091\u0092\7T\2\2\u0092"+
		"\u0093\7Q\2\2\u0093\u0094\7E\2\2\u0094\u0095\7G\2\2\u0095\u0096\7F\2\2"+
		"\u0096\u0097\7K\2\2\u0097\u0098\7O\2\2\u0098\u0099\7K\2\2\u0099\u009a"+
		"\7G\2\2\u009a\u009b\7P\2\2\u009b\u009c\7V\2\2\u009c\u009d\7Q\2\2\u009d"+
		"\26\3\2\2\2\u009e\u009f\7P\2\2\u009f\u00a0\7W\2\2\u00a0\u00a1\7O\2\2\u00a1"+
		"\30\3\2\2\2\u00a2\u00a3\7N\2\2\u00a3\u00a4\7Q\2\2\u00a4\u00a5\7I\2\2\u00a5"+
		"\32\3\2\2\2\u00a6\u00a7\7U\2\2\u00a7\u00a8\7G\2\2\u00a8\u00a9\7S\2\2\u00a9"+
		"\34\3\2\2\2\u00aa\u00ab\7f\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7x\2\2\u00ad"+
		"\36\3\2\2\2\u00ae\u00af\7e\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7g\2\2\u00b1"+
		"\u00b2\7t\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7q\2\2\u00b4 \3\2\2\2\u00b5"+
		"\u00b6\7h\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7u\2\2"+
		"\u00b9\u00ba\7q\2\2\u00ba\"\3\2\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7p"+
		"\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1"+
		"\7q\2\2\u00c1$\3\2\2\2\u00c2\u00c3\7d\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5"+
		"\7q\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7c\2\2\u00c8"+
		"\u00c9\7p\2\2\u00c9\u00ca\7q\2\2\u00ca&\3\2\2\2\u00cb\u00cc\7Q\2\2\u00cc"+
		"(\3\2\2\2\u00cd\u00ce\7[\2\2\u00ce*\3\2\2\2\u00cf\u00d0\7P\2\2\u00d0\u00d1"+
		"\7Q\2\2\u00d1,\3\2\2\2\u00d2\u00d4\7/\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d7\5\t\5\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9.\3\2\2\2"+
		"\u00da\u00e0\5\13\6\2\u00db\u00df\5\13\6\2\u00dc\u00df\5\t\5\2\u00dd\u00df"+
		"\7a\2\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\60\3\2\2"+
		"\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7<\2\2\u00e4\62\3\2\2\2\u00e5\u00e6"+
		"\7*\2\2\u00e6\64\3\2\2\2\u00e7\u00e8\7+\2\2\u00e8\66\3\2\2\2\u00e9\u00ea"+
		"\7=\2\2\u00ea8\3\2\2\2\u00eb\u00ec\7.\2\2\u00ec:\3\2\2\2\u00ed\u00ee\7"+
		"?\2\2\u00ee<\3\2\2\2\u00ef\u00f0\7@\2\2\u00f0>\3\2\2\2\u00f1\u00f2\7>"+
		"\2\2\u00f2@\3\2\2\2\u00f3\u00f4\7?\2\2\u00f4\u00f5\7?\2\2\u00f5B\3\2\2"+
		"\2\u00f6\u00f7\7-\2\2\u00f7D\3\2\2\2\u00f8\u00f9\7/\2\2\u00f9F\3\2\2\2"+
		"\u00fa\u00fb\7,\2\2\u00fbH\3\2\2\2\u00fc\u00fd\7\61\2\2\u00fdJ\3\2\2\2"+
		"\u00fe\u00ff\7\61\2\2\u00ff\u0100\7,\2\2\u0100\u0104\3\2\2\2\u0101\u0103"+
		"\13\2\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0105\3\2\2\2"+
		"\u0104\u0102\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108"+
		"\7,\2\2\u0108\u0109\7\61\2\2\u0109\u010a\3\2\2\2\u010a\u010b\b&\2\2\u010b"+
		"L\3\2\2\2\u010c\u010d\7\61\2\2\u010d\u010e\7\61\2\2\u010e\u0112\3\2\2"+
		"\2\u010f\u0111\13\2\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2"+
		"\2\2\u0115\u0116\5\7\4\2\u0116\u0117\3\2\2\2\u0117\u0118\b\'\2\2\u0118"+
		"N\3\2\2\2\n\2X\u00d3\u00d8\u00de\u00e0\u0104\u0112\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}