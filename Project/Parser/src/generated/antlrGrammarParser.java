// Generated from F:/User Folder/Desktop/JavaCompiler_TINF2020/Project/Parser/src/grammar\antlrGrammar.g4 by ANTLR 4.9.2
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
		Identifier=32, JCharacter=33, JInteger=34, WS=35, Comment=36, LineComment=37, 
		JString=38;
	public static final int
		RULE_programm = 0, RULE_jClass = 1, RULE_constructor = 2, RULE_classBody = 3, 
		RULE_methodDeclaration = 4, RULE_fieldDeclaration = 5, RULE_methodParameter = 6, 
		RULE_nMethodParameters = 7, RULE_nArguments = 8, RULE_expression = 9, 
		RULE_basicexpressions = 10, RULE_instVar = 11, RULE_statementExpressions = 12, 
		RULE_assign = 13, RULE_localVarDeclaration = 14, RULE_jNew = 15, RULE_methodCall = 16, 
		RULE_methodCallPrefix = 17, RULE_statement = 18, RULE_block = 19, RULE_ifelse = 20, 
		RULE_jIf = 21, RULE_jElseIf = 22, RULE_jElse = 23, RULE_jWhile = 24, RULE_jReturn = 25, 
		RULE_unary = 26, RULE_binary = 27, RULE_baseType = 28, RULE_objectType = 29, 
		RULE_operators = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"programm", "jClass", "constructor", "classBody", "methodDeclaration", 
			"fieldDeclaration", "methodParameter", "nMethodParameters", "nArguments", 
			"expression", "basicexpressions", "instVar", "statementExpressions", 
			"assign", "localVarDeclaration", "jNew", "methodCall", "methodCallPrefix", 
			"statement", "block", "ifelse", "jIf", "jElseIf", "jElse", "jWhile", 
			"jReturn", "unary", "binary", "baseType", "objectType", "operators"
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
			"JCharacter", "JInteger", "WS", "Comment", "LineComment", "JString"
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
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				jClass();
				}
				}
				setState(65); 
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
			setState(67);
			match(T__0);
			setState(68);
			match(Identifier);
			setState(69);
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
		enterRule(_localctx, 4, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(71);
				match(AccessModifier);
				}
			}

			setState(74);
			match(Identifier);
			setState(75);
			match(LBracket);
			setState(76);
			nMethodParameters();
			setState(77);
			match(RBracket);
			setState(78);
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
		enterRule(_localctx, 6, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(CurlyLBracket);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << AccessModifier) | (1L << Void) | (1L << Identifier))) != 0)) {
				{
				setState(84);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(81);
					methodDeclaration();
					}
					break;
				case 2:
					{
					setState(82);
					fieldDeclaration();
					}
					break;
				case 3:
					{
					setState(83);
					constructor();
					}
					break;
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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
		public TerminalNode Identifier() { return getToken(antlrGrammarParser.Identifier, 0); }
		public TerminalNode LBracket() { return getToken(antlrGrammarParser.LBracket, 0); }
		public NMethodParametersContext nMethodParameters() {
			return getRuleContext(NMethodParametersContext.class,0);
		}
		public TerminalNode RBracket() { return getToken(antlrGrammarParser.RBracket, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public TerminalNode Void() { return getToken(antlrGrammarParser.Void, 0); }
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
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(91);
				match(AccessModifier);
				}
			}

			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case Identifier:
				{
				setState(94);
				objectType();
				}
				break;
			case Void:
				{
				setState(95);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(98);
			match(Identifier);
			setState(99);
			match(LBracket);
			setState(100);
			nMethodParameters();
			setState(101);
			match(RBracket);
			setState(102);
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
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
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
		enterRule(_localctx, 10, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(104);
				match(AccessModifier);
				}
			}

			setState(107);
			objectType();
			setState(108);
			match(Identifier);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(109);
				match(Comma);
				setState(110);
				match(Identifier);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(116);
				match(Equal);
				setState(117);
				expression();
				}
			}

			setState(120);
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

	public static class MethodParameterContext extends ParserRuleContext {
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
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
		enterRule(_localctx, 12, RULE_methodParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			objectType();
			setState(123);
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
		enterRule(_localctx, 14, RULE_nMethodParameters);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Identifier))) != 0)) {
					{
					setState(125);
					methodParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				methodParameter();
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(129);
					match(Comma);
					setState(130);
					methodParameter();
					}
					}
					setState(133); 
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
		enterRule(_localctx, 16, RULE_nArguments);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << JBoolean) | (1L << JNull) | (1L << Super) | (1L << This) | (1L << NotOperator) | (1L << LBracket) | (1L << Identifier) | (1L << JCharacter) | (1L << JInteger) | (1L << JString))) != 0)) {
					{
					setState(137);
					expression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				expression();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(141);
					match(Comma);
					setState(142);
					expression();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
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
		enterRule(_localctx, 18, RULE_expression);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				basicexpressions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
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
		enterRule(_localctx, 20, RULE_basicexpressions);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				baseType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				instVar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				statementExpressions();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				unary();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				match(LBracket);
				setState(161);
				expression();
				setState(162);
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
		enterRule(_localctx, 22, RULE_instVar);
		int _la;
		try {
			int _alt;
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(This);
				setState(167);
				match(Dot);
				setState(168);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==This) {
					{
					setState(169);
					match(This);
					setState(170);
					match(Dot);
					}
				}

				setState(175); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(173);
						match(Identifier);
						setState(174);
						match(Dot);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(177); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(179);
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
		enterRule(_localctx, 24, RULE_statementExpressions);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				jNew();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
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
		enterRule(_localctx, 26, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(187);
				instVar();
				}
				break;
			case 2:
				{
				setState(188);
				match(Identifier);
				}
				break;
			}
			setState(191);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << PlusEqual) | (1L << MinusEqual))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(192);
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
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
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
		enterRule(_localctx, 28, RULE_localVarDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			objectType();
			setState(195);
			match(Identifier);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(196);
				match(Comma);
				setState(197);
				match(Identifier);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << PlusEqual) | (1L << MinusEqual))) != 0)) {
				{
				setState(203);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << PlusEqual) | (1L << MinusEqual))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(204);
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
		enterRule(_localctx, 30, RULE_jNew);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__1);
			setState(208);
			match(Identifier);
			setState(209);
			match(LBracket);
			setState(210);
			nArguments();
			setState(211);
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
		enterRule(_localctx, 32, RULE_methodCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(213);
				methodCallPrefix();
				}
				break;
			}
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					match(Identifier);
					setState(217);
					match(LBracket);
					setState(218);
					nArguments();
					setState(219);
					match(RBracket);
					setState(220);
					match(Dot);
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			{
			setState(227);
			match(Identifier);
			setState(228);
			match(LBracket);
			setState(229);
			nArguments();
			setState(230);
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
		enterRule(_localctx, 34, RULE_methodCallPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(232);
				instVar();
				}
				break;
			case 2:
				{
				setState(233);
				match(Identifier);
				setState(234);
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
		enterRule(_localctx, 36, RULE_statement);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				ifelse();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				localVarDeclaration();
				setState(239);
				match(Semicolon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				jReturn();
				setState(242);
				match(Semicolon);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				jWhile();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				statementExpressions();
				setState(247);
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
		enterRule(_localctx, 38, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(CurlyLBracket);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << This) | (1L << If) | (1L << CurlyLBracket) | (1L << Identifier))) != 0)) {
				{
				{
				setState(252);
				statement();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
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
		enterRule(_localctx, 40, RULE_ifelse);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			jIf();
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(261);
					jElseIf();
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(267);
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
		enterRule(_localctx, 42, RULE_jIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(If);
			setState(271);
			match(LBracket);
			setState(272);
			expression();
			setState(273);
			match(RBracket);
			setState(274);
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
		enterRule(_localctx, 44, RULE_jElseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(Else);
			setState(277);
			match(If);
			setState(278);
			match(LBracket);
			setState(279);
			expression();
			setState(280);
			match(RBracket);
			setState(281);
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
		enterRule(_localctx, 46, RULE_jElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(Else);
			setState(284);
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
		enterRule(_localctx, 48, RULE_jWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__2);
			setState(287);
			match(LBracket);
			setState(288);
			expression();
			setState(289);
			match(RBracket);
			setState(290);
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
		enterRule(_localctx, 50, RULE_jReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__3);
			setState(293);
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
		enterRule(_localctx, 52, RULE_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(NotOperator);
			setState(296);
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
		enterRule(_localctx, 54, RULE_binary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			basicexpressions();
			setState(302); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(299);
					operators();
					setState(300);
					basicexpressions();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(304); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		public TerminalNode JString() { return getToken(antlrGrammarParser.JString, 0); }
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
		enterRule(_localctx, 56, RULE_baseType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JBoolean) | (1L << JNull) | (1L << Super) | (1L << This) | (1L << JCharacter) | (1L << JInteger) | (1L << JString))) != 0)) ) {
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

	public static class ObjectTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(antlrGrammarParser.Identifier, 0); }
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitObjectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitObjectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Identifier))) != 0)) ) {
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
		enterRule(_localctx, 60, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u013b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\6\2B\n\2\r\2\16\2C\3\3\3\3\3\3\3\3\3\4\5\4K\n\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\3\5\3\5\3\6\5\6_\n\6\3\6\3"+
		"\6\5\6c\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\5\7l\n\7\3\7\3\7\3\7\3\7\7\7r"+
		"\n\7\f\7\16\7u\13\7\3\7\3\7\5\7y\n\7\3\7\3\7\3\b\3\b\3\b\3\t\5\t\u0081"+
		"\n\t\3\t\3\t\3\t\6\t\u0086\n\t\r\t\16\t\u0087\5\t\u008a\n\t\3\n\5\n\u008d"+
		"\n\n\3\n\3\n\3\n\7\n\u0092\n\n\f\n\16\n\u0095\13\n\3\n\5\n\u0098\n\n\3"+
		"\13\3\13\5\13\u009c\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a7"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00ae\n\r\3\r\3\r\6\r\u00b2\n\r\r\r\16\r"+
		"\u00b3\3\r\5\r\u00b7\n\r\3\16\3\16\3\16\5\16\u00bc\n\16\3\17\3\17\5\17"+
		"\u00c0\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00c9\n\20\f\20\16"+
		"\20\u00cc\13\20\3\20\3\20\5\20\u00d0\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\5\22\u00d9\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00e1\n\22\f"+
		"\22\16\22\u00e4\13\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u00ee"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00fc\n\24\3\25\3\25\7\25\u0100\n\25\f\25\16\25\u0103\13\25\3\25\3\25"+
		"\3\26\3\26\7\26\u0109\n\26\f\26\16\26\u010c\13\26\3\26\5\26\u010f\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\6\35\u0131\n\35\r\35\16\35\u0132\3\36\3\36\3\37\3"+
		"\37\3 \3 \3 \2\2!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>\2\6\3\2\22\24\6\2\13\f\16\17#$((\4\2\7\t\"\"\4\2\25\25\30\32"+
		"\2\u0146\2A\3\2\2\2\4E\3\2\2\2\6J\3\2\2\2\bR\3\2\2\2\n^\3\2\2\2\fk\3\2"+
		"\2\2\16|\3\2\2\2\20\u0089\3\2\2\2\22\u0097\3\2\2\2\24\u009b\3\2\2\2\26"+
		"\u00a6\3\2\2\2\30\u00b6\3\2\2\2\32\u00bb\3\2\2\2\34\u00bf\3\2\2\2\36\u00c4"+
		"\3\2\2\2 \u00d1\3\2\2\2\"\u00d8\3\2\2\2$\u00ed\3\2\2\2&\u00fb\3\2\2\2"+
		"(\u00fd\3\2\2\2*\u0106\3\2\2\2,\u0110\3\2\2\2.\u0116\3\2\2\2\60\u011d"+
		"\3\2\2\2\62\u0120\3\2\2\2\64\u0126\3\2\2\2\66\u0129\3\2\2\28\u012c\3\2"+
		"\2\2:\u0134\3\2\2\2<\u0136\3\2\2\2>\u0138\3\2\2\2@B\5\4\3\2A@\3\2\2\2"+
		"BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\3\3\2\2\2EF\7\3\2\2FG\7\"\2\2GH\5\b\5"+
		"\2H\5\3\2\2\2IK\7\n\2\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\"\2\2MN\7\33"+
		"\2\2NO\5\20\t\2OP\7\34\2\2PQ\5(\25\2Q\7\3\2\2\2RX\7\35\2\2SW\5\n\6\2T"+
		"W\5\f\7\2UW\5\6\4\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2"+
		"XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\36\2\2\\\t\3\2\2\2]_\7\n\2\2^]\3\2"+
		"\2\2^_\3\2\2\2_b\3\2\2\2`c\5<\37\2ac\7\r\2\2b`\3\2\2\2ba\3\2\2\2cd\3\2"+
		"\2\2de\7\"\2\2ef\7\33\2\2fg\5\20\t\2gh\7\34\2\2hi\5(\25\2i\13\3\2\2\2"+
		"jl\7\n\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\5<\37\2ns\7\"\2\2op\7 \2\2"+
		"pr\7\"\2\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tx\3\2\2\2us\3\2\2\2"+
		"vw\7\22\2\2wy\5\24\13\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7!\2\2{\r\3\2"+
		"\2\2|}\5<\37\2}~\7\"\2\2~\17\3\2\2\2\177\u0081\5\16\b\2\u0080\177\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\u008a\3\2\2\2\u0082\u0085\5\16\b\2\u0083"+
		"\u0084\7 \2\2\u0084\u0086\5\16\b\2\u0085\u0083\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0080\3\2\2\2\u0089\u0082\3\2\2\2\u008a\21\3\2\2\2\u008b\u008d\5\24\13"+
		"\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0098\3\2\2\2\u008e\u0093"+
		"\5\24\13\2\u008f\u0090\7 \2\2\u0090\u0092\5\24\13\2\u0091\u008f\3\2\2"+
		"\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0098"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\5\30\r\2\u0097\u008c\3\2\2\2"+
		"\u0097\u008e\3\2\2\2\u0097\u0096\3\2\2\2\u0098\23\3\2\2\2\u0099\u009c"+
		"\5\26\f\2\u009a\u009c\58\35\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2"+
		"\u009c\25\3\2\2\2\u009d\u00a7\5:\36\2\u009e\u00a7\5\30\r\2\u009f\u00a7"+
		"\7\"\2\2\u00a0\u00a7\5\32\16\2\u00a1\u00a7\5\66\34\2\u00a2\u00a3\7\33"+
		"\2\2\u00a3\u00a4\5\24\13\2\u00a4\u00a5\7\34\2\2\u00a5\u00a7\3\2\2\2\u00a6"+
		"\u009d\3\2\2\2\u00a6\u009e\3\2\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a0\3\2"+
		"\2\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a7\27\3\2\2\2\u00a8\u00a9"+
		"\7\17\2\2\u00a9\u00aa\7\37\2\2\u00aa\u00b7\7\"\2\2\u00ab\u00ac\7\17\2"+
		"\2\u00ac\u00ae\7\37\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00b0\7\"\2\2\u00b0\u00b2\7\37\2\2\u00b1\u00af\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\7\"\2\2\u00b6\u00a8\3\2\2\2\u00b6\u00ad\3\2"+
		"\2\2\u00b7\31\3\2\2\2\u00b8\u00bc\5\34\17\2\u00b9\u00bc\5 \21\2\u00ba"+
		"\u00bc\5\"\22\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3"+
		"\2\2\2\u00bc\33\3\2\2\2\u00bd\u00c0\5\30\r\2\u00be\u00c0\7\"\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\t\2"+
		"\2\2\u00c2\u00c3\5\24\13\2\u00c3\35\3\2\2\2\u00c4\u00c5\5<\37\2\u00c5"+
		"\u00ca\7\"\2\2\u00c6\u00c7\7 \2\2\u00c7\u00c9\7\"\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cf\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\t\2\2\2\u00ce\u00d0\5\24"+
		"\13\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\37\3\2\2\2\u00d1\u00d2"+
		"\7\4\2\2\u00d2\u00d3\7\"\2\2\u00d3\u00d4\7\33\2\2\u00d4\u00d5\5\22\n\2"+
		"\u00d5\u00d6\7\34\2\2\u00d6!\3\2\2\2\u00d7\u00d9\5$\23\2\u00d8\u00d7\3"+
		"\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00e2\3\2\2\2\u00da\u00db\7\"\2\2\u00db"+
		"\u00dc\7\33\2\2\u00dc\u00dd\5\22\n\2\u00dd\u00de\7\34\2\2\u00de\u00df"+
		"\7\37\2\2\u00df\u00e1\3\2\2\2\u00e0\u00da\3\2\2\2\u00e1\u00e4\3\2\2\2"+
		"\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e5\u00e6\7\"\2\2\u00e6\u00e7\7\33\2\2\u00e7\u00e8\5\22\n\2"+
		"\u00e8\u00e9\7\34\2\2\u00e9#\3\2\2\2\u00ea\u00ee\5\30\r\2\u00eb\u00ec"+
		"\7\"\2\2\u00ec\u00ee\7\37\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2"+
		"\u00ee%\3\2\2\2\u00ef\u00fc\5*\26\2\u00f0\u00f1\5\36\20\2\u00f1\u00f2"+
		"\7!\2\2\u00f2\u00fc\3\2\2\2\u00f3\u00f4\5\64\33\2\u00f4\u00f5\7!\2\2\u00f5"+
		"\u00fc\3\2\2\2\u00f6\u00fc\5\62\32\2\u00f7\u00fc\5(\25\2\u00f8\u00f9\5"+
		"\32\16\2\u00f9\u00fa\7!\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00ef\3\2\2\2\u00fb"+
		"\u00f0\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fb\u00f7\3\2"+
		"\2\2\u00fb\u00f8\3\2\2\2\u00fc\'\3\2\2\2\u00fd\u0101\7\35\2\2\u00fe\u0100"+
		"\5&\24\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7\36"+
		"\2\2\u0105)\3\2\2\2\u0106\u010a\5,\27\2\u0107\u0109\5.\30\2\u0108\u0107"+
		"\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010f\5\60\31\2\u010e\u010d\3"+
		"\2\2\2\u010e\u010f\3\2\2\2\u010f+\3\2\2\2\u0110\u0111\7\20\2\2\u0111\u0112"+
		"\7\33\2\2\u0112\u0113\5\24\13\2\u0113\u0114\7\34\2\2\u0114\u0115\5(\25"+
		"\2\u0115-\3\2\2\2\u0116\u0117\7\21\2\2\u0117\u0118\7\20\2\2\u0118\u0119"+
		"\7\33\2\2\u0119\u011a\5\24\13\2\u011a\u011b\7\34\2\2\u011b\u011c\5(\25"+
		"\2\u011c/\3\2\2\2\u011d\u011e\7\21\2\2\u011e\u011f\5(\25\2\u011f\61\3"+
		"\2\2\2\u0120\u0121\7\5\2\2\u0121\u0122\7\33\2\2\u0122\u0123\5\24\13\2"+
		"\u0123\u0124\7\34\2\2\u0124\u0125\5(\25\2\u0125\63\3\2\2\2\u0126\u0127"+
		"\7\6\2\2\u0127\u0128\5\24\13\2\u0128\65\3\2\2\2\u0129\u012a\7\26\2\2\u012a"+
		"\u012b\5\24\13\2\u012b\67\3\2\2\2\u012c\u0130\5\26\f\2\u012d\u012e\5>"+
		" \2\u012e\u012f\5\26\f\2\u012f\u0131\3\2\2\2\u0130\u012d\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u01339\3\2\2\2"+
		"\u0134\u0135\t\3\2\2\u0135;\3\2\2\2\u0136\u0137\t\4\2\2\u0137=\3\2\2\2"+
		"\u0138\u0139\t\5\2\2\u0139?\3\2\2\2\"CJVX^bksx\u0080\u0087\u0089\u008c"+
		"\u0093\u0097\u009b\u00a6\u00ad\u00b3\u00b6\u00bb\u00bf\u00ca\u00cf\u00d8"+
		"\u00e2\u00ed\u00fb\u0101\u010a\u010e\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}