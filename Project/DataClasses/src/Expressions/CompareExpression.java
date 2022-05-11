package Expressions;

/**
 * expression >= expression
 */
public record CompareExpression(IExpression a, IExpression b, ComapreOperators comapreOperator) implements IExpression
{
    public enum ComapreOperators
    {
        Equals,
        GreaterThan,
        GreaterEquals,
        LesserThan,
        LesserEquals
    }
}
