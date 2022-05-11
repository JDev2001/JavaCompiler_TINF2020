package Expressions;

/**
 * expression >= expression
 */
public class CompareExpression implements IExpression
{
    private final IExpression a;
    private final IExpression b;
    private final ComapreOperators comapreOperator;

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

    public enum ComapreOperators
    {
        Equals,
        GreaterThan,
        GreaterEquals,
        LesserThan,
        LesserEquals
    }
}
