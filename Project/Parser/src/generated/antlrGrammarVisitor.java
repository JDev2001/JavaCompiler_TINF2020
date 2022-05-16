// Generated from F:/User Folder/Work/ARBURG/DHBW/Dokumente/Compilerbau/JavaCompiler_TINF2020/Project/Parser/src/grammar\antlrGrammar.g4 by ANTLR 4.10.1
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link antlrGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface antlrGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#programm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramm(antlrGrammarParser.ProgrammContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#jClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJClass(antlrGrammarParser.JClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(antlrGrammarParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(antlrGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(antlrGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(antlrGrammarParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(antlrGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#methodType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodType(antlrGrammarParser.MethodTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#nMethodParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNMethodParameters(antlrGrammarParser.NMethodParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#methodParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParameter(antlrGrammarParser.MethodParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(antlrGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#nArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNArguments(antlrGrammarParser.NArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(antlrGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#basicexpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicexpressions(antlrGrammarParser.BasicexpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#instVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstVar(antlrGrammarParser.InstVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#statementExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressions(antlrGrammarParser.StatementExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(antlrGrammarParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#localVarDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVarDeclaration(antlrGrammarParser.LocalVarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#jNew}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJNew(antlrGrammarParser.JNewContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(antlrGrammarParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#methodCallPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallPrefix(antlrGrammarParser.MethodCallPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(antlrGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#ifelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(antlrGrammarParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#jIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJIf(antlrGrammarParser.JIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#jElseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJElseIf(antlrGrammarParser.JElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#jElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJElse(antlrGrammarParser.JElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#jWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJWhile(antlrGrammarParser.JWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#jReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJReturn(antlrGrammarParser.JReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(antlrGrammarParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(antlrGrammarParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(antlrGrammarParser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperators(antlrGrammarParser.OperatorsContext ctx);
}