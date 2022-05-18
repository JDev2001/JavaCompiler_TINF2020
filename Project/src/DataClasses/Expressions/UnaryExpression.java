package DataClasses.Expressions;

/**
 * -5; -expression
 */
public record UnaryExpression(IExpression expression, String operator) implements IExpression
{
}
