package Expressions;

/**
 * expression >= expression
 */
public class CompareExpression implements IExpression
{
    private IExpression a;

    public CompareExpression(IExpression a, IExpression b, ComapreOperators comapreOperator)
    {
        this.a = a;
        this.b = b;
        this.comapreOperator = comapreOperator;
    }

    public IExpression getA()
    {
        return a;
    }

    public IExpression getB()
    {
        return b;
    }

    public ComapreOperators getComapreOperator()
    {
        return comapreOperator;
    }

    private IExpression b;
    private ComapreOperators comapreOperator;

    public enum ComapreOperators
    {
        Equals,
        GreaterThan,
        GreaterEquals,
        LesserThan,
        LesserEquals
    }
}
