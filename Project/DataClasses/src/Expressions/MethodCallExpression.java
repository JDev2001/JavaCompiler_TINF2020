package Expressions;

import java.util.List;

/**
 * abc(5,12,'c');
 */
public class MethodCallExpression implements IExpression
{
    private String identifier;
    private List<IExpression> parameters;

    public MethodCallExpression(String identifier, List<IExpression> parameters)
    {
        this.identifier = identifier;
        this.parameters = parameters;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public List<IExpression> getParameters()
    {
        return parameters;
    }
}
