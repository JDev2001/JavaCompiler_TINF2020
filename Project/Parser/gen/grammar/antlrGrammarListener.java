// Generated from C:/Users/Administrator/Desktop/JavaCompiler_TINF2020/Project/Parser/src/grammar\antlrGrammar.g4 by ANTLR 4.10.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link antlrGrammarParser}.
 */
public interface antlrGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#programm}.
	 * @param ctx the parse tree
	 */
	void enterProgramm(antlrGrammarParser.ProgrammContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#programm}.
	 * @param ctx the parse tree
	 */
	void exitProgramm(antlrGrammarParser.ProgrammContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#jClass}.
	 * @param ctx the parse tree
	 */
	void enterJClass(antlrGrammarParser.JClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#jClass}.
	 * @param ctx the parse tree
	 */
	void exitJClass(antlrGrammarParser.JClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(antlrGrammarParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(antlrGrammarParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(antlrGrammarParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(antlrGrammarParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(antlrGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(antlrGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(antlrGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(antlrGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(antlrGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(antlrGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(antlrGrammarParser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(antlrGrammarParser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#nMethodParameters}.
	 * @param ctx the parse tree
	 */
	void enterNMethodParameters(antlrGrammarParser.NMethodParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#nMethodParameters}.
	 * @param ctx the parse tree
	 */
	void exitNMethodParameters(antlrGrammarParser.NMethodParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#methodParameter}.
	 * @param ctx the parse tree
	 */
	void enterMethodParameter(antlrGrammarParser.MethodParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#methodParameter}.
	 * @param ctx the parse tree
	 */
	void exitMethodParameter(antlrGrammarParser.MethodParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(antlrGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(antlrGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(antlrGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(antlrGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(antlrGrammarParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(antlrGrammarParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(antlrGrammarParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(antlrGrammarParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#jIf}.
	 * @param ctx the parse tree
	 */
	void enterJIf(antlrGrammarParser.JIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#jIf}.
	 * @param ctx the parse tree
	 */
	void exitJIf(antlrGrammarParser.JIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#jElseIf}.
	 * @param ctx the parse tree
	 */
	void enterJElseIf(antlrGrammarParser.JElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#jElseIf}.
	 * @param ctx the parse tree
	 */
	void exitJElseIf(antlrGrammarParser.JElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#jElse}.
	 * @param ctx the parse tree
	 */
	void enterJElse(antlrGrammarParser.JElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#jElse}.
	 * @param ctx the parse tree
	 */
	void exitJElse(antlrGrammarParser.JElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#jWhile}.
	 * @param ctx the parse tree
	 */
	void enterJWhile(antlrGrammarParser.JWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#jWhile}.
	 * @param ctx the parse tree
	 */
	void exitJWhile(antlrGrammarParser.JWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#jReturn}.
	 * @param ctx the parse tree
	 */
	void enterJReturn(antlrGrammarParser.JReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#jReturn}.
	 * @param ctx the parse tree
	 */
	void exitJReturn(antlrGrammarParser.JReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#statementExpressions}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressions(antlrGrammarParser.StatementExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#statementExpressions}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressions(antlrGrammarParser.StatementExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(antlrGrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(antlrGrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(antlrGrammarParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(antlrGrammarParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#jNew}.
	 * @param ctx the parse tree
	 */
	void enterJNew(antlrGrammarParser.JNewContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#jNew}.
	 * @param ctx the parse tree
	 */
	void exitJNew(antlrGrammarParser.JNewContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#methodCallPrefix}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallPrefix(antlrGrammarParser.MethodCallPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#methodCallPrefix}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallPrefix(antlrGrammarParser.MethodCallPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#nArguments}.
	 * @param ctx the parse tree
	 */
	void enterNArguments(antlrGrammarParser.NArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#nArguments}.
	 * @param ctx the parse tree
	 */
	void exitNArguments(antlrGrammarParser.NArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(antlrGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(antlrGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(antlrGrammarParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(antlrGrammarParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#basicexpressions}.
	 * @param ctx the parse tree
	 */
	void enterBasicexpressions(antlrGrammarParser.BasicexpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#basicexpressions}.
	 * @param ctx the parse tree
	 */
	void exitBasicexpressions(antlrGrammarParser.BasicexpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#instVar}.
	 * @param ctx the parse tree
	 */
	void enterInstVar(antlrGrammarParser.InstVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#instVar}.
	 * @param ctx the parse tree
	 */
	void exitInstVar(antlrGrammarParser.InstVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(antlrGrammarParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(antlrGrammarParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(antlrGrammarParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(antlrGrammarParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#operators}.
	 * @param ctx the parse tree
	 */
	void enterOperators(antlrGrammarParser.OperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#operators}.
	 * @param ctx the parse tree
	 */
	void exitOperators(antlrGrammarParser.OperatorsContext ctx);
}