// Generated from C:/Users/Administrator/Desktop/JavaCompiler_TINF2020/Project/src/Parser/grammar\antlrGrammar.g4 by ANTLR 4.10.1
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
		MinusEqual=18, Comperator=19, NotOperator=20, OpIdentifier=21, PointSlashOperator=22, 
		AddSubOperator=23, LogicalOperator=24, LBracket=25, RBracket=26, CurlyLBracket=27, 
		CurlyRBracket=28, Dot=29, Comma=30, Semicolon=31, Identifier=32, JCharacter=33, 
		Const=34, WS=35, Comment=36, LineComment=37;
	public static final int
		RULE_programm = 0, RULE_jClass = 1, RULE_classBody = 2, RULE_constructor = 3, 
		RULE_methodDeclaration = 4, RULE_fieldDeclaration = 5, RULE_type = 6, 
		RULE_methodType = 7, RULE_nMethodParameters = 8, RULE_methodParameter = 9, 
		RULE_block = 10, RULE_statement = 11, RULE_varDeclaration = 12, RULE_ifelse = 13, 
		RULE_jIf = 14, RULE_jElse = 15, RULE_jWhile = 16, RULE_jReturn = 17, RULE_statementExpressions = 18, 
		RULE_instVar = 19, RULE_this = 20, RULE_assign = 21, RULE_assignOperator = 22, 
		RULE_methodCall = 23, RULE_jNew = 24, RULE_methodCallPrefix = 25, RULE_nArguments = 26, 
		RULE_expression = 27, RULE_basicexpressions = 28, RULE_unary = 29, RULE_unaryOperator = 30, 
		RULE_baseType = 31, RULE_operators = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"programm", "jClass", "classBody", "constructor", "methodDeclaration", 
			"fieldDeclaration", "type", "methodType", "nMethodParameters", "methodParameter", 
			"block", "statement", "varDeclaration", "ifelse", "jIf", "jElse", "jWhile", 
			"jReturn", "statementExpressions", "instVar", "this", "assign", "assignOperator", 
			"methodCall", "jNew", "methodCallPrefix", "nArguments", "expression", 
			"basicexpressions", "unary", "unaryOperator", "baseType", "operators"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'int'", "'char'", "'boolean'", "'void'", "'while'", 
			"'return'", "'new'", null, null, "'null'", "'super'", "'this'", "'if'", 
			"'else'", "'='", "'+='", "'-='", null, "'!'", null, null, null, null, 
			"'('", "')'", "'{'", "'}'", "'.'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "AccessModifier", 
			"JBoolean", "JNull", "Super", "This", "If", "Else", "Equal", "PlusEqual", 
			"MinusEqual", "Comperator", "NotOperator", "OpIdentifier", "PointSlashOperator", 
			"AddSubOperator", "LogicalOperator", "LBracket", "RBracket", "CurlyLBracket", 
			"CurlyRBracket", "Dot", "Comma", "Semicolon", "Identifier", "JCharacter", 
			"Const", "WS", "Comment", "LineComment"
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
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(66);
				match(Identifier);
				}
			}

			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				jClass();
				}
				}
				setState(72); 
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
			setState(74);
			match(T__0);
			setState(75);
			match(Identifier);
			setState(76);
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
			setState(78);
			match(CurlyLBracket);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << AccessModifier) | (1L << Identifier))) != 0)) {
				{
				setState(82);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(79);
					methodDeclaration();
					}
					break;
				case 2:
					{
					setState(80);
					fieldDeclaration();
					}
					break;
				case 3:
					{
					setState(81);
					constructor();
					}
					break;
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
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
		enterRule(_localctx, 6, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(89);
				match(AccessModifier);
				}
			}

			setState(92);
			match(Identifier);
			setState(93);
			match(LBracket);
			setState(94);
			nMethodParameters();
			setState(95);
			match(RBracket);
			setState(96);
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
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(98);
				match(AccessModifier);
				}
			}

			setState(101);
			methodType();
			setState(102);
			match(Identifier);
			setState(103);
			match(LBracket);
			setState(104);
			nMethodParameters();
			setState(105);
			match(RBracket);
			setState(106);
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
		enterRule(_localctx, 10, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(108);
				match(AccessModifier);
				}
			}

			setState(111);
			type();
			setState(112);
			match(Identifier);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(113);
				match(Comma);
				setState(114);
				match(Identifier);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(120);
				match(Equal);
				setState(121);
				expression(0);
				}
			}

			setState(124);
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
			setState(126);
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
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__4);
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
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
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << Identifier))) != 0)) {
					{
					setState(132);
					methodParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				methodParameter();
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136);
					match(Comma);
					setState(137);
					methodParameter();
					}
					}
					setState(140); 
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
			setState(144);
			type();
			setState(145);
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
			setState(147);
			match(CurlyLBracket);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << This) | (1L << If) | (1L << CurlyLBracket) | (1L << Identifier))) != 0)) {
				{
				{
				setState(148);
				statement();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(antlrGrammarParser.Semicolon, 0); }
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public JWhileContext jWhile() {
			return getRuleContext(JWhileContext.class,0);
		}
		public JReturnContext jReturn() {
			return getRuleContext(JReturnContext.class,0);
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
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				varDeclaration();
				setState(158);
				match(Semicolon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				ifelse();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				jWhile();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				jReturn();
				setState(163);
				match(Semicolon);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				statementExpressions();
				setState(166);
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

	public static class VarDeclarationContext extends ParserRuleContext {
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
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			type();
			setState(171);
			match(Identifier);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(172);
				match(Comma);
				setState(173);
				match(Identifier);
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << PlusEqual) | (1L << MinusEqual))) != 0)) {
				{
				setState(179);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << PlusEqual) | (1L << MinusEqual))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(180);
				expression(0);
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

	public static class IfelseContext extends ParserRuleContext {
		public JIfContext jIf() {
			return getRuleContext(JIfContext.class,0);
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
		enterRule(_localctx, 26, RULE_ifelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			jIf();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(184);
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
		enterRule(_localctx, 28, RULE_jIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(If);
			setState(188);
			match(LBracket);
			setState(189);
			expression(0);
			setState(190);
			match(RBracket);
			setState(191);
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
		enterRule(_localctx, 30, RULE_jElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(Else);
			setState(194);
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
		enterRule(_localctx, 32, RULE_jWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__5);
			setState(197);
			match(LBracket);
			setState(198);
			expression(0);
			setState(199);
			match(RBracket);
			setState(200);
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
		enterRule(_localctx, 34, RULE_jReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__6);
			setState(203);
			expression(0);
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
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public JNewContext jNew() {
			return getRuleContext(JNewContext.class,0);
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
		enterRule(_localctx, 36, RULE_statementExpressions);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				jNew();
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
		enterRule(_localctx, 38, RULE_instVar);
		int _la;
		try {
			int _alt;
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(210);
				match(This);
				setState(211);
				match(Dot);
				setState(212);
				match(Identifier);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==This) {
					{
					setState(213);
					match(This);
					setState(214);
					match(Dot);
					}
				}

				setState(219); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(217);
						match(Identifier);
						setState(218);
						match(Dot);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(221); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(223);
				match(Identifier);
				}
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

	public static class ThisContext extends ParserRuleContext {
		public TerminalNode This() { return getToken(antlrGrammarParser.This, 0); }
		public TerminalNode Dot() { return getToken(antlrGrammarParser.Dot, 0); }
		public ThisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_this; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitThis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisContext this_() throws RecognitionException {
		ThisContext _localctx = new ThisContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_this);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(This);
			setState(227);
			match(Dot);
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
		public AssignOperatorContext assignOperator() {
			return getRuleContext(AssignOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 42, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(229);
				instVar();
				}
				break;
			case 2:
				{
				setState(230);
				match(Identifier);
				}
				break;
			}
			setState(233);
			assignOperator();
			setState(234);
			expression(0);
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

	public static class AssignOperatorContext extends ParserRuleContext {
		public TerminalNode Equal() { return getToken(antlrGrammarParser.Equal, 0); }
		public TerminalNode PlusEqual() { return getToken(antlrGrammarParser.PlusEqual, 0); }
		public TerminalNode MinusEqual() { return getToken(antlrGrammarParser.MinusEqual, 0); }
		public AssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterAssignOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitAssignOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitAssignOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignOperatorContext assignOperator() throws RecognitionException {
		AssignOperatorContext _localctx = new AssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << PlusEqual) | (1L << MinusEqual))) != 0)) ) {
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
		enterRule(_localctx, 46, RULE_methodCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(238);
				methodCallPrefix();
				}
				break;
			}
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(241);
					match(Identifier);
					setState(242);
					match(LBracket);
					setState(243);
					nArguments();
					setState(244);
					match(RBracket);
					setState(245);
					match(Dot);
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			{
			setState(252);
			match(Identifier);
			setState(253);
			match(LBracket);
			setState(254);
			nArguments();
			setState(255);
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
		enterRule(_localctx, 48, RULE_jNew);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__7);
			setState(258);
			match(Identifier);
			setState(259);
			match(LBracket);
			setState(260);
			nArguments();
			setState(261);
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

	public static class MethodCallPrefixContext extends ParserRuleContext {
		public ThisContext this_() {
			return getRuleContext(ThisContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_methodCallPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(263);
				this_();
				}
				break;
			case 2:
				{
				setState(264);
				instVar();
				}
				break;
			case 3:
				{
				setState(265);
				match(Identifier);
				setState(266);
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
		enterRule(_localctx, 52, RULE_nArguments);
		int _la;
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << JBoolean) | (1L << JNull) | (1L << Super) | (1L << This) | (1L << NotOperator) | (1L << OpIdentifier) | (1L << LBracket) | (1L << Identifier) | (1L << JCharacter) | (1L << Const))) != 0)) {
					{
					setState(269);
					expression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				expression(0);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(273);
					match(Comma);
					setState(274);
					expression(0);
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(283);
			basicexpressions();
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(285);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(286);
					operators();
					setState(287);
					expression(2);
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BasicexpressionsContext extends ParserRuleContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
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
		enterRule(_localctx, 56, RULE_basicexpressions);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				baseType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				statementExpressions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				unary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				match(LBracket);
				setState(298);
				expression(0);
				setState(299);
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

	public static class UnaryContext extends ParserRuleContext {
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
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
		enterRule(_localctx, 58, RULE_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			unaryOperator();
			setState(304);
			expression(0);
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode NotOperator() { return getToken(antlrGrammarParser.NotOperator, 0); }
		public TerminalNode OpIdentifier() { return getToken(antlrGrammarParser.OpIdentifier, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !(_la==NotOperator || _la==OpIdentifier) ) {
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

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(antlrGrammarParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode JBoolean() { return getToken(antlrGrammarParser.JBoolean, 0); }
		public TerminalNode JNull() { return getToken(antlrGrammarParser.JNull, 0); }
		public TerminalNode This() { return getToken(antlrGrammarParser.This, 0); }
		public TerminalNode JCharacter() { return getToken(antlrGrammarParser.JCharacter, 0); }
		public TerminalNode Const() { return getToken(antlrGrammarParser.Const, 0); }
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
		enterRule(_localctx, 62, RULE_baseType);
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				match(JBoolean);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
				match(JNull);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(312);
				match(This);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(313);
				match(JCharacter);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(314);
				match(Const);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(315);
				match(Super);
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

	public static class OperatorsContext extends ParserRuleContext {
		public TerminalNode LogicalOperator() { return getToken(antlrGrammarParser.LogicalOperator, 0); }
		public TerminalNode Comperator() { return getToken(antlrGrammarParser.Comperator, 0); }
		public TerminalNode AddSubOperator() { return getToken(antlrGrammarParser.AddSubOperator, 0); }
		public TerminalNode PointSlashOperator() { return getToken(antlrGrammarParser.PointSlashOperator, 0); }
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
		enterRule(_localctx, 64, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comperator) | (1L << PointSlashOperator) | (1L << AddSubOperator) | (1L << LogicalOperator))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u0141\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0003\u0000D\b\u0000"+
		"\u0001\u0000\u0004\u0000G\b\u0000\u000b\u0000\f\u0000H\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002S\b\u0002\n\u0002\f\u0002V\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0003\u0003[\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004d\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0003\u0005n\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005t\b\u0005\n\u0005\f\u0005w\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005{\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0083"+
		"\b\u0007\u0001\b\u0003\b\u0086\b\b\u0001\b\u0001\b\u0001\b\u0004\b\u008b"+
		"\b\b\u000b\b\f\b\u008c\u0003\b\u008f\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0005\n\u0096\b\n\n\n\f\n\u0099\t\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00a9\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00af\b\f\n\f\f"+
		"\f\u00b2\t\f\u0001\f\u0001\f\u0003\f\u00b6\b\f\u0001\r\u0001\r\u0003\r"+
		"\u00ba\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00d1\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00d8\b\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u00dc\b\u0013\u000b"+
		"\u0013\f\u0013\u00dd\u0001\u0013\u0003\u0013\u00e1\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u00e8\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0003\u0017\u00f0\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u00f8\b\u0017\n\u0017\f\u0017\u00fb"+
		"\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u010c\b\u0019\u0001"+
		"\u001a\u0003\u001a\u010f\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u0114\b\u001a\n\u001a\f\u001a\u0117\t\u001a\u0003\u001a\u0119\b"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u0122\b\u001b\n\u001b\f\u001b\u0125\t\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u012e\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u013d\b\u001f"+
		"\u0001 \u0001 \u0001 \u0000\u00016!\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000"+
		"\u0004\u0002\u0000\u0002\u0004  \u0001\u0000\u0010\u0012\u0001\u0000\u0014"+
		"\u0015\u0002\u0000\u0013\u0013\u0016\u0018\u014e\u0000C\u0001\u0000\u0000"+
		"\u0000\u0002J\u0001\u0000\u0000\u0000\u0004N\u0001\u0000\u0000\u0000\u0006"+
		"Z\u0001\u0000\u0000\u0000\bc\u0001\u0000\u0000\u0000\nm\u0001\u0000\u0000"+
		"\u0000\f~\u0001\u0000\u0000\u0000\u000e\u0082\u0001\u0000\u0000\u0000"+
		"\u0010\u008e\u0001\u0000\u0000\u0000\u0012\u0090\u0001\u0000\u0000\u0000"+
		"\u0014\u0093\u0001\u0000\u0000\u0000\u0016\u00a8\u0001\u0000\u0000\u0000"+
		"\u0018\u00aa\u0001\u0000\u0000\u0000\u001a\u00b7\u0001\u0000\u0000\u0000"+
		"\u001c\u00bb\u0001\u0000\u0000\u0000\u001e\u00c1\u0001\u0000\u0000\u0000"+
		" \u00c4\u0001\u0000\u0000\u0000\"\u00ca\u0001\u0000\u0000\u0000$\u00d0"+
		"\u0001\u0000\u0000\u0000&\u00e0\u0001\u0000\u0000\u0000(\u00e2\u0001\u0000"+
		"\u0000\u0000*\u00e7\u0001\u0000\u0000\u0000,\u00ec\u0001\u0000\u0000\u0000"+
		".\u00ef\u0001\u0000\u0000\u00000\u0101\u0001\u0000\u0000\u00002\u010b"+
		"\u0001\u0000\u0000\u00004\u0118\u0001\u0000\u0000\u00006\u011a\u0001\u0000"+
		"\u0000\u00008\u012d\u0001\u0000\u0000\u0000:\u012f\u0001\u0000\u0000\u0000"+
		"<\u0132\u0001\u0000\u0000\u0000>\u013c\u0001\u0000\u0000\u0000@\u013e"+
		"\u0001\u0000\u0000\u0000BD\u0005 \u0000\u0000CB\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000EG\u0003\u0002\u0001"+
		"\u0000FE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000I\u0001\u0001\u0000\u0000\u0000"+
		"JK\u0005\u0001\u0000\u0000KL\u0005 \u0000\u0000LM\u0003\u0004\u0002\u0000"+
		"M\u0003\u0001\u0000\u0000\u0000NT\u0005\u001b\u0000\u0000OS\u0003\b\u0004"+
		"\u0000PS\u0003\n\u0005\u0000QS\u0003\u0006\u0003\u0000RO\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WX\u0005\u001c\u0000\u0000"+
		"X\u0005\u0001\u0000\u0000\u0000Y[\u0005\t\u0000\u0000ZY\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0005 "+
		"\u0000\u0000]^\u0005\u0019\u0000\u0000^_\u0003\u0010\b\u0000_`\u0005\u001a"+
		"\u0000\u0000`a\u0003\u0014\n\u0000a\u0007\u0001\u0000\u0000\u0000bd\u0005"+
		"\t\u0000\u0000cb\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000ef\u0003\u000e\u0007\u0000fg\u0005 \u0000\u0000gh\u0005"+
		"\u0019\u0000\u0000hi\u0003\u0010\b\u0000ij\u0005\u001a\u0000\u0000jk\u0003"+
		"\u0014\n\u0000k\t\u0001\u0000\u0000\u0000ln\u0005\t\u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"op\u0003\f\u0006\u0000pu\u0005 \u0000\u0000qr\u0005\u001e\u0000\u0000"+
		"rt\u0005 \u0000\u0000sq\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vz\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000xy\u0005\u0010\u0000\u0000y{\u00036\u001b"+
		"\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|}\u0005\u001f\u0000\u0000}\u000b\u0001\u0000\u0000\u0000"+
		"~\u007f\u0007\u0000\u0000\u0000\u007f\r\u0001\u0000\u0000\u0000\u0080"+
		"\u0083\u0005\u0005\u0000\u0000\u0081\u0083\u0003\f\u0006\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u000f"+
		"\u0001\u0000\u0000\u0000\u0084\u0086\u0003\u0012\t\u0000\u0085\u0084\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u008f\u0001"+
		"\u0000\u0000\u0000\u0087\u008a\u0003\u0012\t\u0000\u0088\u0089\u0005\u001e"+
		"\u0000\u0000\u0089\u008b\u0003\u0012\t\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f\u0001\u0000\u0000"+
		"\u0000\u008e\u0085\u0001\u0000\u0000\u0000\u008e\u0087\u0001\u0000\u0000"+
		"\u0000\u008f\u0011\u0001\u0000\u0000\u0000\u0090\u0091\u0003\f\u0006\u0000"+
		"\u0091\u0092\u0005 \u0000\u0000\u0092\u0013\u0001\u0000\u0000\u0000\u0093"+
		"\u0097\u0005\u001b\u0000\u0000\u0094\u0096\u0003\u0016\u000b\u0000\u0095"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u009a\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0005\u001c\u0000\u0000\u009b\u0015\u0001\u0000\u0000\u0000\u009c"+
		"\u00a9\u0003\u0014\n\u0000\u009d\u009e\u0003\u0018\f\u0000\u009e\u009f"+
		"\u0005\u001f\u0000\u0000\u009f\u00a9\u0001\u0000\u0000\u0000\u00a0\u00a9"+
		"\u0003\u001a\r\u0000\u00a1\u00a9\u0003 \u0010\u0000\u00a2\u00a3\u0003"+
		"\"\u0011\u0000\u00a3\u00a4\u0005\u001f\u0000\u0000\u00a4\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0003$\u0012\u0000\u00a6\u00a7\u0005\u001f\u0000"+
		"\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u009c\u0001\u0000\u0000"+
		"\u0000\u00a8\u009d\u0001\u0000\u0000\u0000\u00a8\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a1\u0001\u0000\u0000\u0000\u00a8\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a5\u0001\u0000\u0000\u0000\u00a9\u0017\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0003\f\u0006\u0000\u00ab\u00b0\u0005 \u0000\u0000"+
		"\u00ac\u00ad\u0005\u001e\u0000\u0000\u00ad\u00af\u0005 \u0000\u0000\u00ae"+
		"\u00ac\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0007\u0001\u0000\u0000\u00b4\u00b6\u00036\u001b\u0000\u00b5\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u0019"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b9\u0003\u001c\u000e\u0000\u00b8\u00ba"+
		"\u0003\u001e\u000f\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ba\u001b\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0005\u000e\u0000\u0000\u00bc\u00bd\u0005\u0019\u0000\u0000\u00bd\u00be"+
		"\u00036\u001b\u0000\u00be\u00bf\u0005\u001a\u0000\u0000\u00bf\u00c0\u0003"+
		"\u0014\n\u0000\u00c0\u001d\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u000f"+
		"\u0000\u0000\u00c2\u00c3\u0003\u0014\n\u0000\u00c3\u001f\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0005\u0006\u0000\u0000\u00c5\u00c6\u0005\u0019\u0000"+
		"\u0000\u00c6\u00c7\u00036\u001b\u0000\u00c7\u00c8\u0005\u001a\u0000\u0000"+
		"\u00c8\u00c9\u0003\u0014\n\u0000\u00c9!\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005\u0007\u0000\u0000\u00cb\u00cc\u00036\u001b\u0000\u00cc#\u0001"+
		"\u0000\u0000\u0000\u00cd\u00d1\u0003*\u0015\u0000\u00ce\u00d1\u0003.\u0017"+
		"\u0000\u00cf\u00d1\u00030\u0018\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000"+
		"\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d1%\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\r\u0000\u0000\u00d3"+
		"\u00d4\u0005\u001d\u0000\u0000\u00d4\u00e1\u0005 \u0000\u0000\u00d5\u00d6"+
		"\u0005\r\u0000\u0000\u00d6\u00d8\u0005\u001d\u0000\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00db\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0005 \u0000\u0000\u00da\u00dc\u0005\u001d"+
		"\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0005 \u0000"+
		"\u0000\u00e0\u00d2\u0001\u0000\u0000\u0000\u00e0\u00d7\u0001\u0000\u0000"+
		"\u0000\u00e1\'\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\r\u0000\u0000"+
		"\u00e3\u00e4\u0005\u001d\u0000\u0000\u00e4)\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e8\u0003&\u0013\u0000\u00e6\u00e8\u0005 \u0000\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0003,\u0016\u0000\u00ea\u00eb\u00036\u001b"+
		"\u0000\u00eb+\u0001\u0000\u0000\u0000\u00ec\u00ed\u0007\u0001\u0000\u0000"+
		"\u00ed-\u0001\u0000\u0000\u0000\u00ee\u00f0\u00032\u0019\u0000\u00ef\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f9"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005 \u0000\u0000\u00f2\u00f3\u0005"+
		"\u0019\u0000\u0000\u00f3\u00f4\u00034\u001a\u0000\u00f4\u00f5\u0005\u001a"+
		"\u0000\u0000\u00f5\u00f6\u0005\u001d\u0000\u0000\u00f6\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f1\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000"+
		"\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0005 \u0000\u0000\u00fd\u00fe\u0005\u0019\u0000"+
		"\u0000\u00fe\u00ff\u00034\u001a\u0000\u00ff\u0100\u0005\u001a\u0000\u0000"+
		"\u0100/\u0001\u0000\u0000\u0000\u0101\u0102\u0005\b\u0000\u0000\u0102"+
		"\u0103\u0005 \u0000\u0000\u0103\u0104\u0005\u0019\u0000\u0000\u0104\u0105"+
		"\u00034\u001a\u0000\u0105\u0106\u0005\u001a\u0000\u0000\u01061\u0001\u0000"+
		"\u0000\u0000\u0107\u010c\u0003(\u0014\u0000\u0108\u010c\u0003&\u0013\u0000"+
		"\u0109\u010a\u0005 \u0000\u0000\u010a\u010c\u0005\u001d\u0000\u0000\u010b"+
		"\u0107\u0001\u0000\u0000\u0000\u010b\u0108\u0001\u0000\u0000\u0000\u010b"+
		"\u0109\u0001\u0000\u0000\u0000\u010c3\u0001\u0000\u0000\u0000\u010d\u010f"+
		"\u00036\u001b\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010e\u010f\u0001"+
		"\u0000\u0000\u0000\u010f\u0119\u0001\u0000\u0000\u0000\u0110\u0115\u0003"+
		"6\u001b\u0000\u0111\u0112\u0005\u001e\u0000\u0000\u0112\u0114\u00036\u001b"+
		"\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"+
		"\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000"+
		"\u0000\u0118\u010e\u0001\u0000\u0000\u0000\u0118\u0110\u0001\u0000\u0000"+
		"\u0000\u01195\u0001\u0000\u0000\u0000\u011a\u011b\u0006\u001b\uffff\uffff"+
		"\u0000\u011b\u011c\u00038\u001c\u0000\u011c\u0123\u0001\u0000\u0000\u0000"+
		"\u011d\u011e\n\u0001\u0000\u0000\u011e\u011f\u0003@ \u0000\u011f\u0120"+
		"\u00036\u001b\u0002\u0120\u0122\u0001\u0000\u0000\u0000\u0121\u011d\u0001"+
		"\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u01247\u0001\u0000"+
		"\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u012e\u0003>\u001f"+
		"\u0000\u0127\u012e\u0003$\u0012\u0000\u0128\u012e\u0003:\u001d\u0000\u0129"+
		"\u012a\u0005\u0019\u0000\u0000\u012a\u012b\u00036\u001b\u0000\u012b\u012c"+
		"\u0005\u001a\u0000\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u0126"+
		"\u0001\u0000\u0000\u0000\u012d\u0127\u0001\u0000\u0000\u0000\u012d\u0128"+
		"\u0001\u0000\u0000\u0000\u012d\u0129\u0001\u0000\u0000\u0000\u012e9\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\u0003<\u001e\u0000\u0130\u0131\u00036\u001b"+
		"\u0000\u0131;\u0001\u0000\u0000\u0000\u0132\u0133\u0007\u0002\u0000\u0000"+
		"\u0133=\u0001\u0000\u0000\u0000\u0134\u013d\u0005 \u0000\u0000\u0135\u013d"+
		"\u0003\f\u0006\u0000\u0136\u013d\u0005\n\u0000\u0000\u0137\u013d\u0005"+
		"\u000b\u0000\u0000\u0138\u013d\u0005\r\u0000\u0000\u0139\u013d\u0005!"+
		"\u0000\u0000\u013a\u013d\u0005\"\u0000\u0000\u013b\u013d\u0005\f\u0000"+
		"\u0000\u013c\u0134\u0001\u0000\u0000\u0000\u013c\u0135\u0001\u0000\u0000"+
		"\u0000\u013c\u0136\u0001\u0000\u0000\u0000\u013c\u0137\u0001\u0000\u0000"+
		"\u0000\u013c\u0138\u0001\u0000\u0000\u0000\u013c\u0139\u0001\u0000\u0000"+
		"\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013b\u0001\u0000\u0000"+
		"\u0000\u013d?\u0001\u0000\u0000\u0000\u013e\u013f\u0007\u0003\u0000\u0000"+
		"\u013fA\u0001\u0000\u0000\u0000 CHRTZcmuz\u0082\u0085\u008c\u008e\u0097"+
		"\u00a8\u00b0\u00b5\u00b9\u00d0\u00d7\u00dd\u00e0\u00e7\u00ef\u00f9\u010b"+
		"\u010e\u0115\u0118\u0123\u012d\u013c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}