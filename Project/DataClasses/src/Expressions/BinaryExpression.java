package Expressions;

/**
 * expression + expression
 */
public record BinaryExpression(IExpression a, IExpression b, String operator) implements IExpression
{

}