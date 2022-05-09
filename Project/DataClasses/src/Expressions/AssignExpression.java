package Expressions;

/**
 * x = Expression
 */
public class AssignExpression implements IExpression
{
    public AssignExpression(IExpression a, IExpression b)
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
