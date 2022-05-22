// Generated from F:/User Folder/Work/ARBURG/DHBW/Dokumente/Compilerbau/JavaCompiler_TINF2020/Project/src/Parser/grammar\antlrGrammar.g4 by ANTLR 4.10.1
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
		RULE_instVar = 19, RULE_assign = 20, RULE_methodCall = 21, RULE_jNew = 22, 
		RULE_methodCallPrefix = 23, RULE_nArguments = 24, RULE_expression = 25, 
		RULE_basicexpressions = 26, RULE_unary = 27, RULE_unaryOperator = 28, 
		RULE_baseType = 29, RULE_operators = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"programm", "jClass", "classBody", "constructor", "methodDeclaration", 
			"fieldDeclaration", "type", "methodType", "nMethodParameters", "methodParameter", 
			"block", "statement", "varDeclaration", "ifelse", "jIf", "jElse", "jWhile", 
			"jReturn", "statementExpressions", "instVar", "assign", "methodCall", 
			"jNew", "methodCallPrefix", "nArguments", "expression", "basicexpressions", 
			"unary", "unaryOperator", "baseType", "operators"
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(62);
				match(Identifier);
				}
			}

			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				jClass();
				}
				}
				setState(68); 
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
			setState(70);
			match(T__0);
			setState(71);
			match(Identifier);
			setState(72);
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
			setState(74);
			match(CurlyLBracket);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << AccessModifier) | (1L << Identifier))) != 0)) {
				{
				setState(78);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(75);
					methodDeclaration();
					}
					break;
				case 2:
					{
					setState(76);
					fieldDeclaration();
					}
					break;
				case 3:
					{
					setState(77);
					constructor();
					}
					break;
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
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
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(85);
				match(AccessModifier);
				}
			}

			setState(88);
			match(Identifier);
			setState(89);
			match(LBracket);
			setState(90);
			nMethodParameters();
			setState(91);
			match(RBracket);
			setState(92);
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
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(94);
				match(AccessModifier);
				}
			}

			setState(97);
			methodType();
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
			type();
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
				expression(0);
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
			setState(122);
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
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__4);
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << Identifier))) != 0)) {
					{
					setState(128);
					methodParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				methodParameter();
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(132);
					match(Comma);
					setState(133);
					methodParameter();
					}
					}
					setState(136); 
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
			setState(140);
			type();
			setState(141);
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
			setState(143);
			match(CurlyLBracket);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << This) | (1L << If) | (1L << CurlyLBracket) | (1L << Identifier))) != 0)) {
				{
				{
				setState(144);
				statement();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
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
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				varDeclaration();
				setState(154);
				match(Semicolon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				ifelse();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				jWhile();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				jReturn();
				setState(159);
				match(Semicolon);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				statementExpressions();
				setState(162);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(antlrGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(antlrGrammarParser.Comma, i);
		}
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
			setState(166);
			type();
			setState(167);
			match(Identifier);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(168);
				match(Comma);
				setState(169);
				match(Identifier);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
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
			setState(177);
			jIf();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(178);
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
			setState(181);
			match(If);
			setState(182);
			match(LBracket);
			setState(183);
			expression(0);
			setState(184);
			match(RBracket);
			setState(185);
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
			setState(187);
			match(Else);
			setState(188);
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
			setState(190);
			match(T__5);
			setState(191);
			match(LBracket);
			setState(192);
			expression(0);
			setState(193);
			match(RBracket);
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
			setState(196);
			match(T__6);
			setState(197);
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
		public InstVarContext instVar() {
			return getRuleContext(InstVarContext.class,0);
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
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
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
				instVar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				methodCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
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
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(205);
				match(This);
				setState(206);
				match(Dot);
				setState(207);
				match(Identifier);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==This) {
					{
					setState(208);
					match(This);
					setState(209);
					match(Dot);
					}
				}

				setState(214); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(212);
						match(Identifier);
						setState(213);
						match(Dot);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(216); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(218);
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
		enterRule(_localctx, 40, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(221);
				instVar();
				}
				break;
			case 2:
				{
				setState(222);
				match(Identifier);
				}
				break;
			}
			setState(225);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << PlusEqual) | (1L << MinusEqual))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(226);
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
		enterRule(_localctx, 42, RULE_methodCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(228);
				methodCallPrefix();
				}
				break;
			}
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					match(Identifier);
					setState(232);
					match(LBracket);
					setState(233);
					nArguments();
					setState(234);
					match(RBracket);
					setState(235);
					match(Dot);
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			{
			setState(242);
			match(Identifier);
			setState(243);
			match(LBracket);
			setState(244);
			nArguments();
			setState(245);
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
		enterRule(_localctx, 44, RULE_jNew);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__7);
			setState(248);
			match(Identifier);
			setState(249);
			match(LBracket);
			setState(250);
			nArguments();
			setState(251);
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
		enterRule(_localctx, 46, RULE_methodCallPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(253);
				instVar();
				}
				break;
			case 2:
				{
				setState(254);
				match(Identifier);
				setState(255);
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
		enterRule(_localctx, 48, RULE_nArguments);
		int _la;
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << JBoolean) | (1L << JNull) | (1L << Super) | (1L << This) | (1L << NotOperator) | (1L << OpIdentifier) | (1L << LBracket) | (1L << Identifier) | (1L << JCharacter) | (1L << Const))) != 0)) {
					{
					setState(258);
					expression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				expression(0);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(262);
					match(Comma);
					setState(263);
					expression(0);
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(273);
			basicexpressions();
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(275);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(276);
					operators();
					setState(277);
					expression(2);
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 52, RULE_basicexpressions);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				baseType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				statementExpressions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				unary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				match(LBracket);
				setState(288);
				expression(0);
				setState(289);
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
		enterRule(_localctx, 54, RULE_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			unaryOperator();
			setState(294);
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
		enterRule(_localctx, 56, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode JBoolean() { return getToken(antlrGrammarParser.JBoolean, 0); }
		public TerminalNode JNull() { return getToken(antlrGrammarParser.JNull, 0); }
		public TerminalNode This() { return getToken(antlrGrammarParser.This, 0); }
		public TerminalNode Identifier() { return getToken(antlrGrammarParser.Identifier, 0); }
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
		enterRule(_localctx, 58, RULE_baseType);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(JBoolean);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				match(JNull);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				match(This);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(303);
				match(JCharacter);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(304);
				match(Const);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(305);
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
		enterRule(_localctx, 60, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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
		case 25:
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
		"\u0004\u0001%\u0137\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0003\u0000@\b\u0000\u0001\u0000\u0004\u0000C\b\u0000\u000b"+
		"\u0000\f\u0000D\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002O\b\u0002\n\u0002"+
		"\f\u0002R\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u0003W\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0003\u0004`\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0003\u0005"+
		"j\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"p\b\u0005\n\u0005\f\u0005s\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"w\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u007f\b\u0007\u0001\b\u0003\b\u0082\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0004\b\u0087\b\b\u000b\b\f\b\u0088\u0003\b\u008b\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u0092\b\n\n\n\f\n\u0095"+
		"\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00a5\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u00ab\b\f\n\f\f\f\u00ae\t\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0003\r\u00b4\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00cc\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00d3\b\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u00d7"+
		"\b\u0013\u000b\u0013\f\u0013\u00d8\u0001\u0013\u0003\u0013\u00dc\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u00e0\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0003\u0015\u00e6\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00ee\b\u0015"+
		"\n\u0015\f\u0015\u00f1\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0101"+
		"\b\u0017\u0001\u0018\u0003\u0018\u0104\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u0109\b\u0018\n\u0018\f\u0018\u010c\t\u0018\u0001"+
		"\u0018\u0003\u0018\u010f\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0118\b\u0019\n"+
		"\u0019\f\u0019\u011b\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0124\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0133\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0000"+
		"\u00012\u001f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<\u0000\u0004\u0002\u0000\u0002"+
		"\u0004  \u0001\u0000\u0010\u0012\u0001\u0000\u0014\u0015\u0002\u0000\u0013"+
		"\u0013\u0016\u0018\u0146\u0000?\u0001\u0000\u0000\u0000\u0002F\u0001\u0000"+
		"\u0000\u0000\u0004J\u0001\u0000\u0000\u0000\u0006V\u0001\u0000\u0000\u0000"+
		"\b_\u0001\u0000\u0000\u0000\ni\u0001\u0000\u0000\u0000\fz\u0001\u0000"+
		"\u0000\u0000\u000e~\u0001\u0000\u0000\u0000\u0010\u008a\u0001\u0000\u0000"+
		"\u0000\u0012\u008c\u0001\u0000\u0000\u0000\u0014\u008f\u0001\u0000\u0000"+
		"\u0000\u0016\u00a4\u0001\u0000\u0000\u0000\u0018\u00a6\u0001\u0000\u0000"+
		"\u0000\u001a\u00b1\u0001\u0000\u0000\u0000\u001c\u00b5\u0001\u0000\u0000"+
		"\u0000\u001e\u00bb\u0001\u0000\u0000\u0000 \u00be\u0001\u0000\u0000\u0000"+
		"\"\u00c4\u0001\u0000\u0000\u0000$\u00cb\u0001\u0000\u0000\u0000&\u00db"+
		"\u0001\u0000\u0000\u0000(\u00df\u0001\u0000\u0000\u0000*\u00e5\u0001\u0000"+
		"\u0000\u0000,\u00f7\u0001\u0000\u0000\u0000.\u0100\u0001\u0000\u0000\u0000"+
		"0\u010e\u0001\u0000\u0000\u00002\u0110\u0001\u0000\u0000\u00004\u0123"+
		"\u0001\u0000\u0000\u00006\u0125\u0001\u0000\u0000\u00008\u0128\u0001\u0000"+
		"\u0000\u0000:\u0132\u0001\u0000\u0000\u0000<\u0134\u0001\u0000\u0000\u0000"+
		">@\u0005 \u0000\u0000?>\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@B\u0001\u0000\u0000\u0000AC\u0003\u0002\u0001\u0000BA\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000E\u0001\u0001\u0000\u0000\u0000FG\u0005\u0001\u0000\u0000"+
		"GH\u0005 \u0000\u0000HI\u0003\u0004\u0002\u0000I\u0003\u0001\u0000\u0000"+
		"\u0000JP\u0005\u001b\u0000\u0000KO\u0003\b\u0004\u0000LO\u0003\n\u0005"+
		"\u0000MO\u0003\u0006\u0003\u0000NK\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000ST\u0005\u001c\u0000\u0000T\u0005\u0001\u0000"+
		"\u0000\u0000UW\u0005\t\u0000\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0005 \u0000\u0000YZ\u0005\u0019"+
		"\u0000\u0000Z[\u0003\u0010\b\u0000[\\\u0005\u001a\u0000\u0000\\]\u0003"+
		"\u0014\n\u0000]\u0007\u0001\u0000\u0000\u0000^`\u0005\t\u0000\u0000_^"+
		"\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000ab\u0003\u000e\u0007\u0000bc\u0005 \u0000\u0000cd\u0005\u0019\u0000"+
		"\u0000de\u0003\u0010\b\u0000ef\u0005\u001a\u0000\u0000fg\u0003\u0014\n"+
		"\u0000g\t\u0001\u0000\u0000\u0000hj\u0005\t\u0000\u0000ih\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0003"+
		"\f\u0006\u0000lq\u0005 \u0000\u0000mn\u0005\u001e\u0000\u0000np\u0005"+
		" \u0000\u0000om\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rv\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000tu\u0005\u0010\u0000\u0000uw\u00032\u0019\u0000"+
		"vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xy\u0005\u001f\u0000\u0000y\u000b\u0001\u0000\u0000\u0000z{\u0007"+
		"\u0000\u0000\u0000{\r\u0001\u0000\u0000\u0000|\u007f\u0005\u0005\u0000"+
		"\u0000}\u007f\u0003\f\u0006\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u000f\u0001\u0000\u0000\u0000\u0080\u0082\u0003\u0012"+
		"\t\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u008b\u0001\u0000\u0000\u0000\u0083\u0086\u0003\u0012\t\u0000"+
		"\u0084\u0085\u0005\u001e\u0000\u0000\u0085\u0087\u0003\u0012\t\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u008b\u0001\u0000\u0000\u0000\u008a\u0081\u0001\u0000\u0000\u0000\u008a"+
		"\u0083\u0001\u0000\u0000\u0000\u008b\u0011\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0003\f\u0006\u0000\u008d\u008e\u0005 \u0000\u0000\u008e\u0013"+
		"\u0001\u0000\u0000\u0000\u008f\u0093\u0005\u001b\u0000\u0000\u0090\u0092"+
		"\u0003\u0016\u000b\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095"+
		"\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u001c\u0000\u0000\u0097\u0015"+
		"\u0001\u0000\u0000\u0000\u0098\u00a5\u0003\u0014\n\u0000\u0099\u009a\u0003"+
		"\u0018\f\u0000\u009a\u009b\u0005\u001f\u0000\u0000\u009b\u00a5\u0001\u0000"+
		"\u0000\u0000\u009c\u00a5\u0003\u001a\r\u0000\u009d\u00a5\u0003 \u0010"+
		"\u0000\u009e\u009f\u0003\"\u0011\u0000\u009f\u00a0\u0005\u001f\u0000\u0000"+
		"\u00a0\u00a5\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003$\u0012\u0000\u00a2"+
		"\u00a3\u0005\u001f\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4"+
		"\u0098\u0001\u0000\u0000\u0000\u00a4\u0099\u0001\u0000\u0000\u0000\u00a4"+
		"\u009c\u0001\u0000\u0000\u0000\u00a4\u009d\u0001\u0000\u0000\u0000\u00a4"+
		"\u009e\u0001\u0000\u0000\u0000\u00a4\u00a1\u0001\u0000\u0000\u0000\u00a5"+
		"\u0017\u0001\u0000\u0000\u0000\u00a6\u00a7\u0003\f\u0006\u0000\u00a7\u00ac"+
		"\u0005 \u0000\u0000\u00a8\u00a9\u0005\u001e\u0000\u0000\u00a9\u00ab\u0005"+
		" \u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u00032\u0019\u0000\u00b0\u0019\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b3\u0003\u001c\u000e\u0000\u00b2\u00b4\u0003\u001e\u000f"+
		"\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b4\u001b\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u000e\u0000"+
		"\u0000\u00b6\u00b7\u0005\u0019\u0000\u0000\u00b7\u00b8\u00032\u0019\u0000"+
		"\u00b8\u00b9\u0005\u001a\u0000\u0000\u00b9\u00ba\u0003\u0014\n\u0000\u00ba"+
		"\u001d\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u000f\u0000\u0000\u00bc"+
		"\u00bd\u0003\u0014\n\u0000\u00bd\u001f\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0005\u0006\u0000\u0000\u00bf\u00c0\u0005\u0019\u0000\u0000\u00c0\u00c1"+
		"\u00032\u0019\u0000\u00c1\u00c2\u0005\u001a\u0000\u0000\u00c2\u00c3\u0003"+
		"\u0014\n\u0000\u00c3!\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u0007"+
		"\u0000\u0000\u00c5\u00c6\u00032\u0019\u0000\u00c6#\u0001\u0000\u0000\u0000"+
		"\u00c7\u00cc\u0003(\u0014\u0000\u00c8\u00cc\u0003&\u0013\u0000\u00c9\u00cc"+
		"\u0003*\u0015\u0000\u00ca\u00cc\u0003,\u0016\u0000\u00cb\u00c7\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc%\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0005\r\u0000\u0000\u00ce\u00cf\u0005\u001d\u0000\u0000"+
		"\u00cf\u00dc\u0005 \u0000\u0000\u00d0\u00d1\u0005\r\u0000\u0000\u00d1"+
		"\u00d3\u0005\u001d\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0005 \u0000\u0000\u00d5\u00d7\u0005\u001d\u0000\u0000\u00d6\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\u00dc\u0005 \u0000\u0000\u00db\u00cd\u0001"+
		"\u0000\u0000\u0000\u00db\u00d2\u0001\u0000\u0000\u0000\u00dc\'\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e0\u0003&\u0013\u0000\u00de\u00e0\u0005 \u0000\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0007\u0001\u0000\u0000"+
		"\u00e2\u00e3\u00032\u0019\u0000\u00e3)\u0001\u0000\u0000\u0000\u00e4\u00e6"+
		"\u0003.\u0017\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e6\u00ef\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005"+
		" \u0000\u0000\u00e8\u00e9\u0005\u0019\u0000\u0000\u00e9\u00ea\u00030\u0018"+
		"\u0000\u00ea\u00eb\u0005\u001a\u0000\u0000\u00eb\u00ec\u0005\u001d\u0000"+
		"\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00e7\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005 \u0000\u0000"+
		"\u00f3\u00f4\u0005\u0019\u0000\u0000\u00f4\u00f5\u00030\u0018\u0000\u00f5"+
		"\u00f6\u0005\u001a\u0000\u0000\u00f6+\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0005\b\u0000\u0000\u00f8\u00f9\u0005 \u0000\u0000\u00f9\u00fa\u0005"+
		"\u0019\u0000\u0000\u00fa\u00fb\u00030\u0018\u0000\u00fb\u00fc\u0005\u001a"+
		"\u0000\u0000\u00fc-\u0001\u0000\u0000\u0000\u00fd\u0101\u0003&\u0013\u0000"+
		"\u00fe\u00ff\u0005 \u0000\u0000\u00ff\u0101\u0005\u001d\u0000\u0000\u0100"+
		"\u00fd\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101"+
		"/\u0001\u0000\u0000\u0000\u0102\u0104\u00032\u0019\u0000\u0103\u0102\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u010f\u0001"+
		"\u0000\u0000\u0000\u0105\u010a\u00032\u0019\u0000\u0106\u0107\u0005\u001e"+
		"\u0000\u0000\u0107\u0109\u00032\u0019\u0000\u0108\u0106\u0001\u0000\u0000"+
		"\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010f\u0001\u0000\u0000"+
		"\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u010f\u0003&\u0013\u0000"+
		"\u010e\u0103\u0001\u0000\u0000\u0000\u010e\u0105\u0001\u0000\u0000\u0000"+
		"\u010e\u010d\u0001\u0000\u0000\u0000\u010f1\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0006\u0019\uffff\uffff\u0000\u0111\u0112\u00034\u001a\u0000\u0112"+
		"\u0119\u0001\u0000\u0000\u0000\u0113\u0114\n\u0001\u0000\u0000\u0114\u0115"+
		"\u0003<\u001e\u0000\u0115\u0116\u00032\u0019\u0002\u0116\u0118\u0001\u0000"+
		"\u0000\u0000\u0117\u0113\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000"+
		"\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000"+
		"\u0000\u0000\u011a3\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000"+
		"\u0000\u011c\u0124\u0003:\u001d\u0000\u011d\u0124\u0003$\u0012\u0000\u011e"+
		"\u0124\u00036\u001b\u0000\u011f\u0120\u0005\u0019\u0000\u0000\u0120\u0121"+
		"\u00032\u0019\u0000\u0121\u0122\u0005\u001a\u0000\u0000\u0122\u0124\u0001"+
		"\u0000\u0000\u0000\u0123\u011c\u0001\u0000\u0000\u0000\u0123\u011d\u0001"+
		"\u0000\u0000\u0000\u0123\u011e\u0001\u0000\u0000\u0000\u0123\u011f\u0001"+
		"\u0000\u0000\u0000\u01245\u0001\u0000\u0000\u0000\u0125\u0126\u00038\u001c"+
		"\u0000\u0126\u0127\u00032\u0019\u0000\u01277\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0007\u0002\u0000\u0000\u01299\u0001\u0000\u0000\u0000\u012a\u0133"+
		"\u0003\f\u0006\u0000\u012b\u0133\u0005\n\u0000\u0000\u012c\u0133\u0005"+
		"\u000b\u0000\u0000\u012d\u0133\u0005\r\u0000\u0000\u012e\u0133\u0005 "+
		"\u0000\u0000\u012f\u0133\u0005!\u0000\u0000\u0130\u0133\u0005\"\u0000"+
		"\u0000\u0131\u0133\u0005\f\u0000\u0000\u0132\u012a\u0001\u0000\u0000\u0000"+
		"\u0132\u012b\u0001\u0000\u0000\u0000\u0132\u012c\u0001\u0000\u0000\u0000"+
		"\u0132\u012d\u0001\u0000\u0000\u0000\u0132\u012e\u0001\u0000\u0000\u0000"+
		"\u0132\u012f\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000"+
		"\u0132\u0131\u0001\u0000\u0000\u0000\u0133;\u0001\u0000\u0000\u0000\u0134"+
		"\u0135\u0007\u0003\u0000\u0000\u0135=\u0001\u0000\u0000\u0000\u001f?D"+
		"NPV_iqv~\u0081\u0088\u008a\u0093\u00a4\u00ac\u00b3\u00cb\u00d2\u00d8\u00db"+
		"\u00df\u00e5\u00ef\u0100\u0103\u010a\u010e\u0119\u0123\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}