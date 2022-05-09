package Expressions;

/**
 * -5; -expression
 */
public class UnaryExpression implements IExpression
{
    private IExpression expression;
    private String operator;

    public UnaryExpression(IExpression expression, String operator)
    {
        this.expression = expression;
        this.operator = operator;
    }

    public IExpression getExpression()
    {
        return expression;
    }

    public String getOperator()
    {
        return operator;
    }
}
