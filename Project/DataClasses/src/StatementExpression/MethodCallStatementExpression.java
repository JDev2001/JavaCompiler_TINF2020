package StatementExpression;

import Expressions.IExpression;

import java.util.List;

/**
 * target.name();
 */
public class MethodCallStatementExpression implements IStatementExpression
{
    private final String name;
    private final IExpression target;
    private final List<IExpression> parameters;

    public MethodCallStatementExpression(String name, IExpression target, List<IExpression> parameters)
    {
        this.name = name;
        this.target = target;
        this.parameters = parameters;
    }

    public List<IExpression> getParameters()
    {
        return parameters;
    }

    public String getName()
    {
        return name;
    }

    public IExpression getTarget()
    {
        return target;
    }
}
