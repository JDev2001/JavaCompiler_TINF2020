package Expressions;

/**
 * expression + expression
 */
public class BinaryExpression implements IExpression
{
    private IExpression a;
    private IExpression b;

    public BinaryExpression(IExpression a, IExpression b)
    {
        this.a = a;
        this.b = b;
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
