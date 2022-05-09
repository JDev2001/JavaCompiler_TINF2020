package Statements;

import Expressions.IExpression;

import java.util.List;

/**
 * target.name();
 */
public class MethodCallStatement implements IStatement
{
    private String name;
    private IExpression target;
    private List<IExpression> parameters;

    public MethodCallStatement(String name, IExpression target, List<IExpression> parameters)
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
