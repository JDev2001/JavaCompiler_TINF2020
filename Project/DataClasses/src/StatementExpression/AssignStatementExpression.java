package StatementExpression;

import Expressions.IExpression;

/**
 * x = Expression
 * z.B. x = new ABC();
 * oder x = 5;
 */

public class AssignStatementExpression implements IStatementExpression
{
    private final IExpression expressionA;
    private final IExpression expressionB;

    public AssignStatementExpression(IExpression expressionA, IExpression expressionB)
    {
        this.expressionA = expressionA;
        this.expressionB = expressionB;
    }

    public IExpression getExpressionA()
    {
        return expressionA;
    }

    public IExpression getExpressionB()
    {
        return expressionB;
    }
}
