package Parser.DataClasses.StatementExpression;

import Parser.DataClasses.Expressions.IExpression;

/**
 * x = Expression
 * z.B. x = new ABC();
 * oder x = 5;
 */

public record AssignStatementExpression(IExpression expressionA, IExpression expressionB) implements IStatementExpression
{
}
