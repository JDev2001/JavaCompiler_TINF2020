// Generated from F:/User Folder/Work/ARBURG/DHBW/Dokumente/Compilerbau/JavaCompiler_TINF2020/Project/Parser/src/grammar\antlrGrammar.g4 by ANTLR 4.10.1
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class antlrGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, AccessModifier=9, 
		JBoolean=10, JNull=11, Super=12, This=13, If=14, Else=15, Equal=16, PlusEqual=17, 
		MinusEqual=18, Comperator=19, NotOperator=20, OpBeforeOrAfterIdentifier=21, 
		PointOperator=22, AddSubOperator=23, LogicalOperator=24, LBracket=25, 
		RBracket=26, CurlyLBracket=27, CurlyRBracket=28, Dot=29, Comma=30, Semicolon=31, 
		Identifier=32, JCharacter=33, JInteger=34, WS=35, Comment=36, LineComment=37;
	public static final int
		RULE_programm = 0, RULE_jClass = 1, RULE_classBody = 2, RULE_methodDeclaration = 3, 
		RULE_fieldDeclaration = 4, RULE_constructor = 5, RULE_type = 6, RULE_methodType = 7, 
		RULE_nMethodParameters = 8, RULE_methodParameter = 9, RULE_block = 10, 
		RULE_nArguments = 11, RULE_expression = 12, RULE_basicexpressions = 13, 
		RULE_instVar = 14, RULE_statementExpressions = 15, RULE_assign = 16, RULE_localVarDeclaration = 17, 
		RULE_jNew = 18, RULE_methodCall = 19, RULE_methodCallPrefix = 20, RULE_statement = 21, 
		RULE_ifelse = 22, RULE_jIf = 23, RULE_jElseIf = 24, RULE_jElse = 25, RULE_jWhile = 26, 
		RULE_jReturn = 27, RULE_unary = 28, RULE_binary = 29, RULE_baseType = 30, 
		RULE_operators = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"programm", "jClass", "classBody", "methodDeclaration", "fieldDeclaration", 
			"constructor", "type", "methodType", "nMethodParameters", "methodParameter", 
			"block", "nArguments", "expression", "basicexpressions", "instVar", "statementExpressions", 
			"assign", "localVarDeclaration", "jNew", "methodCall", "methodCallPrefix", 
			"statement", "ifelse", "jIf", "jElseIf", "jElse", "jWhile", "jReturn", 
			"unary", "binary", "baseType", "operators"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'int'", "'char'", "'boolean'", "'void'", "'new'", "'while'", 
			"'return'", null, null, "'null'", "'super'", "'this'", "'if'", "'else'", 
			"'='", "'+='", "'-='", null, "'!'", null, null, null, null, "'('", "')'", 
			"'{'", "'}'", "'.'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "AccessModifier", 
			"JBoolean", "JNull", "Super", "This", "If", "Else", "Equal", "PlusEqual", 
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

	@Override
	public String getGrammarFileName() { return "antlrGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public antlrGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgrammContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(antlrGrammarParser.Identifier, 0); }
		public List<JClassContext> jClass() {
			return getRuleContexts(JClassContext.class);
		}
		public JClassContext jClass(int i) {
			return getRuleContext(JClassContext.class,i);
		}
		public ProgrammContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterProgramm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitProgramm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitProgramm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammContext programm() throws RecognitionException {
		ProgrammContext _localctx = new ProgrammContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(64);
				match(Identifier);
				}
			}

			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				jClass();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	public static class JClassContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(antlrGrammarParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public JClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterJClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitJClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitJClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JClassContext jClass() throws RecognitionException {
		JClassContext _localctx = new JClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__0);
			setState(73);
			match(Identifier);
			setState(74);
			classBody();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode CurlyLBracket() { return getToken(antlrGrammarParser.CurlyLBracket, 0); }
		public TerminalNode CurlyRBracket() { return getToken(antlrGrammarParser.CurlyRBracket, 0); }
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<ConstructorContext> constructor() {
			return getRuleContexts(ConstructorContext.class);
		}
		public ConstructorContext constructor(int i) {
			return getRuleContext(ConstructorContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(CurlyLBracket);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << AccessModifier) | (1L << Identifier))) != 0)) {
				{
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(77);
					methodDeclaration();
					}
					break;
				case 2:
					{
					setState(78);
					fieldDeclaration();
					}
					break;
				case 3:
					{
					setState(79);
					constructor();
					}
					break;
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(CurlyRBracket);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(antlrGrammarParser.Identifier, 0); }
		public TerminalNode LBracket() { return getToken(antlrGrammarParser.LBracket, 0); }
		public NMethodParametersContext nMethodParameters() {
			return getRuleContext(NMethodParametersContext.class,0);
		}
		public TerminalNode RBracket() { return getToken(antlrGrammarParser.RBracket, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode AccessModifier() { return getToken(antlrGrammarParser.AccessModifier, 0); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(87);
				match(AccessModifier);
				}
			}

			setState(90);
			methodType();
			setState(91);
			match(Identifier);
			setState(92);
			match(LBracket);
			setState(93);
			nMethodParameters();
			setState(94);
			match(RBracket);
			setState(95);
			block();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(antlrGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(antlrGrammarParser.Identifier, i);
		}
		public TerminalNode Semicolon() { return getToken(antlrGrammarParser.Semicolon, 0); }
		public TerminalNode AccessModifier() { return getToken(antlrGrammarParser.AccessModifier, 0); }
		public List<TerminalNode> Comma() { return getTokens(antlrGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(antlrGrammarParser.Comma, i);
		}
		public TerminalNode Equal() { return getToken(antlrGrammarParser.Equal, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(97);
				match(AccessModifier);
				}
			}

			setState(100);
			type();
			setState(101);
			match(Identifier);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(102);
				match(Comma);
				setState(103);
				match(Identifier);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(109);
				match(Equal);
				setState(110);
				expression();
				}
			}

			setState(113);
			match(Semicolon);
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

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(antlrGrammarParser.Identifier, 0); }
		public TerminalNode LBracket() { return getToken(antlrGrammarParser.LBracket, 0); }
		public NMethodParametersContext nMethodParameters() {
			return getRuleContext(NMethodParametersContext.class,0);
		}
		public TerminalNode RBracket() { return getToken(antlrGrammarParser.RBracket, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode AccessModifier() { return getToken(antlrGrammarParser.AccessModifier, 0); }
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(115);
				match(AccessModifier);
				}
			}

			setState(118);
			match(Identifier);
			setState(119);
			match(LBracket);
			setState(120);
			nMethodParameters();
			setState(121);
			match(RBracket);
			setState(122);
			block();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(antlrGrammarParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << Identifier))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MethodTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterMethodType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitMethodType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitMethodType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodTypeContext methodType() throws RecognitionException {
		MethodTypeContext _localctx = new MethodTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodType);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(T__4);
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				type();
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

	public static class NMethodParametersContext extends ParserRuleContext {
		public List<MethodParameterContext> methodParameter() {
			return getRuleContexts(MethodParameterContext.class);
		}
		public MethodParameterContext methodParameter(int i) {
			return getRuleContext(MethodParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(antlrGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(antlrGrammarParser.Comma, i);
		}
		public NMethodParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nMethodParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterNMethodParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitNMethodParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitNMethodParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NMethodParametersContext nMethodParameters() throws RecognitionException {
		NMethodParametersContext _localctx = new NMethodParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nMethodParameters);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << Identifier))) != 0)) {
					{
					setState(130);
					methodParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				methodParameter();
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(134);
					match(Comma);
					setState(135);
					methodParameter();
					}
					}
					setState(138); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
				break;
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

	public static class MethodParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(antlrGrammarParser.Identifier, 0); }
		public MethodParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterMethodParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitMethodParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitMethodParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParameterContext methodParameter() throws RecognitionException {
		MethodParameterContext _localctx = new MethodParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			type();
			setState(143);
			match(Identifier);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode CurlyLBracket() { return getToken(antlrGrammarParser.CurlyLBracket, 0); }
		public TerminalNode CurlyRBracket() { return getToken(antlrGrammarParser.CurlyRBracket, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(CurlyLBracket);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << This) | (1L << If) | (1L << CurlyLBracket) | (1L << Identifier))) != 0)) {
				{
				{
				setState(146);
				statement();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(CurlyRBracket);
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

	public static class NArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(antlrGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(antlrGrammarParser.Comma, i);
		}
		public InstVarContext instVar() {
			return getRuleContext(InstVarContext.class,0);
		}
		public NArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterNArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitNArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitNArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NArgumentsContext nArguments() throws RecognitionException {
		NArgumentsContext _localctx = new NArgumentsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nArguments);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << JBoolean) | (1L << JNull) | (1L << Super) | (1L << This) | (1L << NotOperator) | (1L << LBracket) | (1L << Identifier) | (1L << JCharacter) | (1L << JInteger) | (1L << WS))) != 0)) {
					{
					setState(154);
					expression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				expression();
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(158);
					match(Comma);
					setState(159);
					expression();
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				instVar();
				}
				break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public BasicexpressionsContext basicexpressions() {
			return getRuleContext(BasicexpressionsContext.class,0);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				basicexpressions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				binary();
				}
				break;
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

	public static class BasicexpressionsContext extends ParserRuleContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public InstVarContext instVar() {
			return getRuleContext(InstVarContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(antlrGrammarParser.Identifier, 0); }
		public StatementExpressionsContext statementExpressions() {
			return getRuleContext(StatementExpressionsContext.class,0);
		}
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode LBracket() { return getToken(antlrGrammarParser.LBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBracket() { return getToken(antlrGrammarParser.RBracket, 0); }
		public BasicexpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicexpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterBasicexpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitBasicexpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitBasicexpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicexpressionsContext basicexpressions() throws RecognitionException {
		BasicexpressionsContext _localctx = new BasicexpressionsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_basicexpressions);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				baseType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				instVar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				statementExpressions();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				unary();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(177);
				match(LBracket);
				setState(178);
				expression();
				setState(179);
				match(RBracket);
				}
				break;
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

	public static class InstVarContext extends ParserRuleContext {
		public TerminalNode This() { return getToken(antlrGrammarParser.This, 0); }
		public List<TerminalNode> Dot() { return getTokens(antlrGrammarParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(antlrGrammarParser.Dot, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(antlrGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(antlrGrammarParser.Identifier, i);
		}
		public InstVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterInstVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitInstVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitInstVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstVarContext instVar() throws RecognitionException {
		InstVarContext _localctx = new InstVarContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_instVar);
		int _la;
		try {
			int _alt;
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(This);
				setState(184);
				match(Dot);
				setState(185);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==This) {
					{
					setState(186);
					match(This);
					setState(187);
					match(Dot);
					}
				}

				setState(192); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(190);
						match(Identifier);
						setState(191);
						match(Dot);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(194); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(196);
				match(Identifier);
				}
				break;
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

	public static class StatementExpressionsContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public JNewContext jNew() {
			return getRuleContext(JNewContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public StatementExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterStatementExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitStatementExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitStatementExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionsContext statementExpressions() throws RecognitionException {
		StatementExpressionsContext _localctx = new StatementExpressionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statementExpressions);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				jNew();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				methodCall();
				}
				break;
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

	public static class AssignContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Equal() { return getToken(antlrGrammarParser.Equal, 0); }
		public TerminalNode PlusEqual() { return getToken(antlrGrammarParser.PlusEqual, 0); }
		public TerminalNode MinusEqual() { return getToken(antlrGrammarParser.MinusEqual, 0); }
		public InstVarContext instVar() {
			return getRuleContext(InstVarContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(antlrGrammarParser.Identifier, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(204);
				instVar();
				}
				break;
			case 2:
				{
				setState(205);
				match(Identifier);
				}
				break;
			}
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << PlusEqual) | (1L << MinusEqual))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(209);
			expression();
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

	public static class LocalVarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(antlrGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(antlrGrammarParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(antlrGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(antlrGrammarParser.Comma, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Equal() { return getToken(antlrGrammarParser.Equal, 0); }
		public TerminalNode PlusEqual() { return getToken(antlrGrammarParser.PlusEqual, 0); }
		public TerminalNode MinusEqual() { return getToken(antlrGrammarParser.MinusEqual, 0); }
		public LocalVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVarDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterLocalVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitLocalVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitLocalVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVarDeclarationContext localVarDeclaration() throws RecognitionException {
		LocalVarDeclarationContext _localctx = new LocalVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_localVarDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			type();
			setState(212);
			match(Identifier);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(213);
				match(Comma);
				setState(214);
				match(Identifier);
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << PlusEqual) | (1L << MinusEqual))) != 0)) {
				{
				setState(220);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << PlusEqual) | (1L << MinusEqual))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(221);
				expression();
				}
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

	public static class JNewContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(antlrGrammarParser.Identifier, 0); }
		public TerminalNode LBracket() { return getToken(antlrGrammarParser.LBracket, 0); }
		public NArgumentsContext nArguments() {
			return getRuleContext(NArgumentsContext.class,0);
		}
		public TerminalNode RBracket() { return getToken(antlrGrammarParser.RBracket, 0); }
		public JNewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jNew; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterJNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitJNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitJNew(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JNewContext jNew() throws RecognitionException {
		JNewContext _localctx = new JNewContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jNew);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__5);
			setState(225);
			match(Identifier);
			setState(226);
			match(LBracket);
			setState(227);
			nArguments();
			setState(228);
			match(RBracket);
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

	public static class MethodCallContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(antlrGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(antlrGrammarParser.Identifier, i);
		}
		public List<TerminalNode> LBracket() { return getTokens(antlrGrammarParser.LBracket); }
		public TerminalNode LBracket(int i) {
			return getToken(antlrGrammarParser.LBracket, i);
		}
		public List<NArgumentsContext> nArguments() {
			return getRuleContexts(NArgumentsContext.class);
		}
		public NArgumentsContext nArguments(int i) {
			return getRuleContext(NArgumentsContext.class,i);
		}
		public List<TerminalNode> RBracket() { return getTokens(antlrGrammarParser.RBracket); }
		public TerminalNode RBracket(int i) {
			return getToken(antlrGrammarParser.RBracket, i);
		}
		public MethodCallPrefixContext methodCallPrefix() {
			return getRuleContext(MethodCallPrefixContext.class,0);
		}
		public List<TerminalNode> Dot() { return getTokens(antlrGrammarParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(antlrGrammarParser.Dot, i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_methodCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(230);
				methodCallPrefix();
				}
				break;
			}
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233);
					match(Identifier);
					setState(234);
					match(LBracket);
					setState(235);
					nArguments();
					setState(236);
					match(RBracket);
					setState(237);
					match(Dot);
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			{
			setState(244);
			match(Identifier);
			setState(245);
			match(LBracket);
			setState(246);
			nArguments();
			setState(247);
			match(RBracket);
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

	public static class MethodCallPrefixContext extends ParserRuleContext {
		public InstVarContext instVar() {
			return getRuleContext(InstVarContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(antlrGrammarParser.Identifier, 0); }
		public TerminalNode Dot() { return getToken(antlrGrammarParser.Dot, 0); }
		public MethodCallPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterMethodCallPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitMethodCallPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitMethodCallPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallPrefixContext methodCallPrefix() throws RecognitionException {
		MethodCallPrefixContext _localctx = new MethodCallPrefixContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodCallPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(249);
				instVar();
				}
				break;
			case 2:
				{
				setState(250);
				match(Identifier);
				setState(251);
				match(Dot);
				}
				break;
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

	public static class StatementContext extends ParserRuleContext {
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public LocalVarDeclarationContext localVarDeclaration() {
			return getRuleContext(LocalVarDeclarationContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(antlrGrammarParser.Semicolon, 0); }
		public JReturnContext jReturn() {
			return getRuleContext(JReturnContext.class,0);
		}
		public JWhileContext jWhile() {
			return getRuleContext(JWhileContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementExpressionsContext statementExpressions() {
			return getRuleContext(StatementExpressionsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statement);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				ifelse();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				localVarDeclaration();
				setState(256);
				match(Semicolon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				jReturn();
				setState(259);
				match(Semicolon);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				jWhile();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(263);
				statementExpressions();
				setState(264);
				match(Semicolon);
				}
				break;
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

	public static class IfelseContext extends ParserRuleContext {
		public JIfContext jIf() {
			return getRuleContext(JIfContext.class,0);
		}
		public List<JElseIfContext> jElseIf() {
			return getRuleContexts(JElseIfContext.class);
		}
		public JElseIfContext jElseIf(int i) {
			return getRuleContext(JElseIfContext.class,i);
		}
		public JElseContext jElse() {
			return getRuleContext(JElseContext.class,0);
		}
		public IfelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitIfelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitIfelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelseContext ifelse() throws RecognitionException {
		IfelseContext _localctx = new IfelseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifelse);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			jIf();
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					jElseIf();
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(275);
				jElse();
				}
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

	public static class JIfContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(antlrGrammarParser.If, 0); }
		public TerminalNode LBracket() { return getToken(antlrGrammarParser.LBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBracket() { return getToken(antlrGrammarParser.RBracket, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public JIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterJIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitJIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitJIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JIfContext jIf() throws RecognitionException {
		JIfContext _localctx = new JIfContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_jIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(If);
			setState(279);
			match(LBracket);
			setState(280);
			expression();
			setState(281);
			match(RBracket);
			setState(282);
			block();
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

	public static class JElseIfContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(antlrGrammarParser.Else, 0); }
		public TerminalNode If() { return getToken(antlrGrammarParser.If, 0); }
		public TerminalNode LBracket() { return getToken(antlrGrammarParser.LBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBracket() { return getToken(antlrGrammarParser.RBracket, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public JElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jElseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterJElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitJElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitJElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JElseIfContext jElseIf() throws RecognitionException {
		JElseIfContext _localctx = new JElseIfContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_jElseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(Else);
			setState(285);
			match(If);
			setState(286);
			match(LBracket);
			setState(287);
			expression();
			setState(288);
			match(RBracket);
			setState(289);
			block();
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

	public static class JElseContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(antlrGrammarParser.Else, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public JElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterJElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitJElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitJElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JElseContext jElse() throws RecognitionException {
		JElseContext _localctx = new JElseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_jElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(Else);
			setState(292);
			block();
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

	public static class JWhileContext extends ParserRuleContext {
		public TerminalNode LBracket() { return getToken(antlrGrammarParser.LBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBracket() { return getToken(antlrGrammarParser.RBracket, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public JWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterJWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitJWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitJWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JWhileContext jWhile() throws RecognitionException {
		JWhileContext _localctx = new JWhileContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_jWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__6);
			setState(295);
			match(LBracket);
			setState(296);
			expression();
			setState(297);
			match(RBracket);
			setState(298);
			block();
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

	public static class JReturnContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterJReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitJReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitJReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JReturnContext jReturn() throws RecognitionException {
		JReturnContext _localctx = new JReturnContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_jReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__7);
			setState(301);
			expression();
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

	public static class UnaryContext extends ParserRuleContext {
		public TerminalNode NotOperator() { return getToken(antlrGrammarParser.NotOperator, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(NotOperator);
			setState(304);
			expression();
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

	public static class BinaryContext extends ParserRuleContext {
		public List<BasicexpressionsContext> basicexpressions() {
			return getRuleContexts(BasicexpressionsContext.class);
		}
		public BasicexpressionsContext basicexpressions(int i) {
			return getRuleContext(BasicexpressionsContext.class,i);
		}
		public List<OperatorsContext> operators() {
			return getRuleContexts(OperatorsContext.class);
		}
		public OperatorsContext operators(int i) {
			return getRuleContext(OperatorsContext.class,i);
		}
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_binary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			basicexpressions();
			setState(310); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(307);
					operators();
					setState(308);
					basicexpressions();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(312); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode JBoolean() { return getToken(antlrGrammarParser.JBoolean, 0); }
		public TerminalNode JNull() { return getToken(antlrGrammarParser.JNull, 0); }
		public TerminalNode This() { return getToken(antlrGrammarParser.This, 0); }
		public TerminalNode WS() { return getToken(antlrGrammarParser.WS, 0); }
		public TerminalNode JCharacter() { return getToken(antlrGrammarParser.JCharacter, 0); }
		public TerminalNode JInteger() { return getToken(antlrGrammarParser.JInteger, 0); }
		public TerminalNode Super() { return getToken(antlrGrammarParser.Super, 0); }
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_baseType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JBoolean) | (1L << JNull) | (1L << Super) | (1L << This) | (1L << JCharacter) | (1L << JInteger) | (1L << WS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OperatorsContext extends ParserRuleContext {
		public TerminalNode LogicalOperator() { return getToken(antlrGrammarParser.LogicalOperator, 0); }
		public TerminalNode Comperator() { return getToken(antlrGrammarParser.Comperator, 0); }
		public TerminalNode AddSubOperator() { return getToken(antlrGrammarParser.AddSubOperator, 0); }
		public TerminalNode PointOperator() { return getToken(antlrGrammarParser.PointOperator, 0); }
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comperator) | (1L << PointOperator) | (1L << AddSubOperator) | (1L << LogicalOperator))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001%\u013f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0003\u0000B\b\u0000\u0001\u0000"+
		"\u0004\u0000E\b\u0000\u000b\u0000\f\u0000F\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002Q\b\u0002\n\u0002\f\u0002T\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0003\u0003Y\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004c\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004i\b"+
		"\u0004\n\u0004\f\u0004l\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004p\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0003\u0005u\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0081\b\u0007\u0001"+
		"\b\u0003\b\u0084\b\b\u0001\b\u0001\b\u0001\b\u0004\b\u0089\b\b\u000b\b"+
		"\f\b\u008a\u0003\b\u008d\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005"+
		"\n\u0094\b\n\n\n\f\n\u0097\t\n\u0001\n\u0001\n\u0001\u000b\u0003\u000b"+
		"\u009c\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00a1\b"+
		"\u000b\n\u000b\f\u000b\u00a4\t\u000b\u0001\u000b\u0003\u000b\u00a7\b\u000b"+
		"\u0001\f\u0001\f\u0003\f\u00ab\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b6\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00bd\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0004\u000e\u00c1\b\u000e\u000b\u000e\f\u000e\u00c2"+
		"\u0001\u000e\u0003\u000e\u00c6\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00cb\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00cf\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u00d8\b\u0011\n\u0011\f\u0011\u00db\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00df\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0003\u0013"+
		"\u00e8\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u00f0\b\u0013\n\u0013\f\u0013\u00f3\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00fd\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u010b\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u010f\b\u0016\n\u0016\f\u0016\u0112\t\u0016"+
		"\u0001\u0016\u0003\u0016\u0115\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0004\u001d"+
		"\u0137\b\u001d\u000b\u001d\f\u001d\u0138\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0000\u0000 \u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>\u0000\u0004\u0002\u0000\u0002\u0004  \u0001\u0000\u0010\u0012\u0002"+
		"\u0000\n\r!#\u0002\u0000\u0013\u0013\u0016\u0018\u014a\u0000A\u0001\u0000"+
		"\u0000\u0000\u0002H\u0001\u0000\u0000\u0000\u0004L\u0001\u0000\u0000\u0000"+
		"\u0006X\u0001\u0000\u0000\u0000\bb\u0001\u0000\u0000\u0000\nt\u0001\u0000"+
		"\u0000\u0000\f|\u0001\u0000\u0000\u0000\u000e\u0080\u0001\u0000\u0000"+
		"\u0000\u0010\u008c\u0001\u0000\u0000\u0000\u0012\u008e\u0001\u0000\u0000"+
		"\u0000\u0014\u0091\u0001\u0000\u0000\u0000\u0016\u00a6\u0001\u0000\u0000"+
		"\u0000\u0018\u00aa\u0001\u0000\u0000\u0000\u001a\u00b5\u0001\u0000\u0000"+
		"\u0000\u001c\u00c5\u0001\u0000\u0000\u0000\u001e\u00ca\u0001\u0000\u0000"+
		"\u0000 \u00ce\u0001\u0000\u0000\u0000\"\u00d3\u0001\u0000\u0000\u0000"+
		"$\u00e0\u0001\u0000\u0000\u0000&\u00e7\u0001\u0000\u0000\u0000(\u00fc"+
		"\u0001\u0000\u0000\u0000*\u010a\u0001\u0000\u0000\u0000,\u010c\u0001\u0000"+
		"\u0000\u0000.\u0116\u0001\u0000\u0000\u00000\u011c\u0001\u0000\u0000\u0000"+
		"2\u0123\u0001\u0000\u0000\u00004\u0126\u0001\u0000\u0000\u00006\u012c"+
		"\u0001\u0000\u0000\u00008\u012f\u0001\u0000\u0000\u0000:\u0132\u0001\u0000"+
		"\u0000\u0000<\u013a\u0001\u0000\u0000\u0000>\u013c\u0001\u0000\u0000\u0000"+
		"@B\u0005 \u0000\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"BD\u0001\u0000\u0000\u0000CE\u0003\u0002\u0001\u0000DC\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000G\u0001\u0001\u0000\u0000\u0000HI\u0005\u0001\u0000\u0000"+
		"IJ\u0005 \u0000\u0000JK\u0003\u0004\u0002\u0000K\u0003\u0001\u0000\u0000"+
		"\u0000LR\u0005\u001b\u0000\u0000MQ\u0003\u0006\u0003\u0000NQ\u0003\b\u0004"+
		"\u0000OQ\u0003\n\u0005\u0000PM\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000UV\u0005\u001c\u0000\u0000V\u0005\u0001\u0000\u0000"+
		"\u0000WY\u0005\t\u0000\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z[\u0003\u000e\u0007\u0000[\\\u0005 \u0000"+
		"\u0000\\]\u0005\u0019\u0000\u0000]^\u0003\u0010\b\u0000^_\u0005\u001a"+
		"\u0000\u0000_`\u0003\u0014\n\u0000`\u0007\u0001\u0000\u0000\u0000ac\u0005"+
		"\t\u0000\u0000ba\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000de\u0003\f\u0006\u0000ej\u0005 \u0000\u0000fg\u0005"+
		"\u001e\u0000\u0000gi\u0005 \u0000\u0000hf\u0001\u0000\u0000\u0000il\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"ko\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0005\u0010\u0000"+
		"\u0000np\u0003\u0018\f\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qr\u0005\u001f\u0000\u0000r\t\u0001\u0000"+
		"\u0000\u0000su\u0005\t\u0000\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0005 \u0000\u0000wx\u0005\u0019"+
		"\u0000\u0000xy\u0003\u0010\b\u0000yz\u0005\u001a\u0000\u0000z{\u0003\u0014"+
		"\n\u0000{\u000b\u0001\u0000\u0000\u0000|}\u0007\u0000\u0000\u0000}\r\u0001"+
		"\u0000\u0000\u0000~\u0081\u0005\u0005\u0000\u0000\u007f\u0081\u0003\f"+
		"\u0006\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u000f\u0001\u0000\u0000\u0000\u0082\u0084\u0003\u0012\t\u0000"+
		"\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u008d\u0001\u0000\u0000\u0000\u0085\u0088\u0003\u0012\t\u0000\u0086"+
		"\u0087\u0005\u001e\u0000\u0000\u0087\u0089\u0003\u0012\t\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d"+
		"\u0001\u0000\u0000\u0000\u008c\u0083\u0001\u0000\u0000\u0000\u008c\u0085"+
		"\u0001\u0000\u0000\u0000\u008d\u0011\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0003\f\u0006\u0000\u008f\u0090\u0005 \u0000\u0000\u0090\u0013\u0001"+
		"\u0000\u0000\u0000\u0091\u0095\u0005\u001b\u0000\u0000\u0092\u0094\u0003"+
		"*\u0015\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000"+
		"\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0005\u001c\u0000\u0000\u0099\u0015\u0001\u0000"+
		"\u0000\u0000\u009a\u009c\u0003\u0018\f\u0000\u009b\u009a\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u00a7\u0001\u0000\u0000"+
		"\u0000\u009d\u00a2\u0003\u0018\f\u0000\u009e\u009f\u0005\u001e\u0000\u0000"+
		"\u009f\u00a1\u0003\u0018\f\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a7\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a7\u0003\u001c\u000e\u0000\u00a6"+
		"\u009b\u0001\u0000\u0000\u0000\u00a6\u009d\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u0017\u0001\u0000\u0000\u0000\u00a8"+
		"\u00ab\u0003\u001a\r\u0000\u00a9\u00ab\u0003:\u001d\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u0019"+
		"\u0001\u0000\u0000\u0000\u00ac\u00b6\u0003<\u001e\u0000\u00ad\u00b6\u0003"+
		"\u001c\u000e\u0000\u00ae\u00b6\u0005 \u0000\u0000\u00af\u00b6\u0003\u001e"+
		"\u000f\u0000\u00b0\u00b6\u00038\u001c\u0000\u00b1\u00b2\u0005\u0019\u0000"+
		"\u0000\u00b2\u00b3\u0003\u0018\f\u0000\u00b3\u00b4\u0005\u001a\u0000\u0000"+
		"\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00ac\u0001\u0000\u0000\u0000"+
		"\u00b5\u00ad\u0001\u0000\u0000\u0000\u00b5\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b5\u00af\u0001\u0000\u0000\u0000\u00b5\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b6\u001b\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0005\r\u0000\u0000\u00b8\u00b9\u0005\u001d\u0000\u0000\u00b9"+
		"\u00c6\u0005 \u0000\u0000\u00ba\u00bb\u0005\r\u0000\u0000\u00bb\u00bd"+
		"\u0005\u001d\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0005 \u0000\u0000\u00bf\u00c1\u0005\u001d\u0000\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c6\u0005 \u0000\u0000\u00c5\u00b7\u0001\u0000"+
		"\u0000\u0000\u00c5\u00bc\u0001\u0000\u0000\u0000\u00c6\u001d\u0001\u0000"+
		"\u0000\u0000\u00c7\u00cb\u0003 \u0010\u0000\u00c8\u00cb\u0003$\u0012\u0000"+
		"\u00c9\u00cb\u0003&\u0013\u0000\u00ca\u00c7\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb"+
		"\u001f\u0001\u0000\u0000\u0000\u00cc\u00cf\u0003\u001c\u000e\u0000\u00cd"+
		"\u00cf\u0005 \u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0007\u0001\u0000\u0000\u00d1\u00d2\u0003\u0018\f\u0000\u00d2!\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0003\f\u0006\u0000\u00d4\u00d9\u0005 "+
		"\u0000\u0000\u00d5\u00d6\u0005\u001e\u0000\u0000\u00d6\u00d8\u0005 \u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000"+
		"\u0000\u00da\u00de\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0007\u0001\u0000\u0000\u00dd\u00df\u0003\u0018\f\u0000"+
		"\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df#\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0006\u0000\u0000\u00e1"+
		"\u00e2\u0005 \u0000\u0000\u00e2\u00e3\u0005\u0019\u0000\u0000\u00e3\u00e4"+
		"\u0003\u0016\u000b\u0000\u00e4\u00e5\u0005\u001a\u0000\u0000\u00e5%\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e8\u0003(\u0014\u0000\u00e7\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00f1\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0005 \u0000\u0000\u00ea\u00eb\u0005\u0019\u0000"+
		"\u0000\u00eb\u00ec\u0003\u0016\u000b\u0000\u00ec\u00ed\u0005\u001a\u0000"+
		"\u0000\u00ed\u00ee\u0005\u001d\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000"+
		"\u0000\u00ef\u00e9\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0005 \u0000\u0000\u00f5\u00f6\u0005\u0019\u0000\u0000"+
		"\u00f6\u00f7\u0003\u0016\u000b\u0000\u00f7\u00f8\u0005\u001a\u0000\u0000"+
		"\u00f8\'\u0001\u0000\u0000\u0000\u00f9\u00fd\u0003\u001c\u000e\u0000\u00fa"+
		"\u00fb\u0005 \u0000\u0000\u00fb\u00fd\u0005\u001d\u0000\u0000\u00fc\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd)\u0001"+
		"\u0000\u0000\u0000\u00fe\u010b\u0003,\u0016\u0000\u00ff\u0100\u0003\""+
		"\u0011\u0000\u0100\u0101\u0005\u001f\u0000\u0000\u0101\u010b\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u00036\u001b\u0000\u0103\u0104\u0005\u001f\u0000"+
		"\u0000\u0104\u010b\u0001\u0000\u0000\u0000\u0105\u010b\u00034\u001a\u0000"+
		"\u0106\u010b\u0003\u0014\n\u0000\u0107\u0108\u0003\u001e\u000f\u0000\u0108"+
		"\u0109\u0005\u001f\u0000\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a"+
		"\u00fe\u0001\u0000\u0000\u0000\u010a\u00ff\u0001\u0000\u0000\u0000\u010a"+
		"\u0102\u0001\u0000\u0000\u0000\u010a\u0105\u0001\u0000\u0000\u0000\u010a"+
		"\u0106\u0001\u0000\u0000\u0000\u010a\u0107\u0001\u0000\u0000\u0000\u010b"+
		"+\u0001\u0000\u0000\u0000\u010c\u0110\u0003.\u0017\u0000\u010d\u010f\u0003"+
		"0\u0018\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000"+
		"\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000"+
		"\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0113\u0115\u00032\u0019\u0000\u0114\u0113\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115-\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0005\u000e\u0000\u0000\u0117\u0118\u0005\u0019\u0000\u0000"+
		"\u0118\u0119\u0003\u0018\f\u0000\u0119\u011a\u0005\u001a\u0000\u0000\u011a"+
		"\u011b\u0003\u0014\n\u0000\u011b/\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0005\u000f\u0000\u0000\u011d\u011e\u0005\u000e\u0000\u0000\u011e\u011f"+
		"\u0005\u0019\u0000\u0000\u011f\u0120\u0003\u0018\f\u0000\u0120\u0121\u0005"+
		"\u001a\u0000\u0000\u0121\u0122\u0003\u0014\n\u0000\u01221\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0005\u000f\u0000\u0000\u0124\u0125\u0003\u0014"+
		"\n\u0000\u01253\u0001\u0000\u0000\u0000\u0126\u0127\u0005\u0007\u0000"+
		"\u0000\u0127\u0128\u0005\u0019\u0000\u0000\u0128\u0129\u0003\u0018\f\u0000"+
		"\u0129\u012a\u0005\u001a\u0000\u0000\u012a\u012b\u0003\u0014\n\u0000\u012b"+
		"5\u0001\u0000\u0000\u0000\u012c\u012d\u0005\b\u0000\u0000\u012d\u012e"+
		"\u0003\u0018\f\u0000\u012e7\u0001\u0000\u0000\u0000\u012f\u0130\u0005"+
		"\u0014\u0000\u0000\u0130\u0131\u0003\u0018\f\u0000\u01319\u0001\u0000"+
		"\u0000\u0000\u0132\u0136\u0003\u001a\r\u0000\u0133\u0134\u0003>\u001f"+
		"\u0000\u0134\u0135\u0003\u001a\r\u0000\u0135\u0137\u0001\u0000\u0000\u0000"+
		"\u0136\u0133\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000"+
		"\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000"+
		"\u0139;\u0001\u0000\u0000\u0000\u013a\u013b\u0007\u0002\u0000\u0000\u013b"+
		"=\u0001\u0000\u0000\u0000\u013c\u013d\u0007\u0003\u0000\u0000\u013d?\u0001"+
		"\u0000\u0000\u0000!AFPRXbjot\u0080\u0083\u008a\u008c\u0095\u009b\u00a2"+
		"\u00a6\u00aa\u00b5\u00bc\u00c2\u00c5\u00ca\u00ce\u00d9\u00de\u00e7\u00f1"+
		"\u00fc\u010a\u0110\u0114\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}