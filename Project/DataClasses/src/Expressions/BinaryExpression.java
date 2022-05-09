package Expressions;

/**
 * expression + expression
 */
public class BinaryExpression implements IExpression
{
    private IExpression a;
    private IExpression b;
    private String operator;

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
