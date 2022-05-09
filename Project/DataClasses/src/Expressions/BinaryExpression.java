package Expressions;

/**
 * expression + expression
 */
public class BinaryExpression implements IExpression
{
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

    private IExpression a;
    private IExpression b;
}
