package Expressions;

/**
 * Konstanten wie z.B.: 42; 'a'; false
 */
public record ConstExpression(Object value) implements IExpression
{
}
