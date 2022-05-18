package Expressions;

import Expressions.IExpression;
import StatementExpression.IStatementExpression;
import Statements.IStatement;

/**
 * expression + expression
 */
public record BinaryExpression(IExpression a, IExpression b, String operator) implements IExpression
{

}