package Expressions;

/**
 * Konstanten wie z.B.: 42; 'a'; false
 */
public class ConstExpression implements IExpression
{
    private final Object value;

    public ConstExpression(Object value)
    {
        this.value = value;
    }

    public Object getValue()
    {
        return value;
    }
}
