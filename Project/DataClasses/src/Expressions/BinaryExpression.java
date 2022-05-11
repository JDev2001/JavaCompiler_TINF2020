package Expressions;

/**
 * expression + expression
 */
public class BinaryExpression implements IExpression
{
    private final IExpression a;
    private final IExpression b;
    private final String operator;

    public BinaryExpression(IExpression a, IExpression b, String operator)
    {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    public String getOperator()
    {
        return operator;
    }

    public IExpression getA()
    {
        return a;
    }

    public IExpression getB()
    {
        return b;
    }
}
