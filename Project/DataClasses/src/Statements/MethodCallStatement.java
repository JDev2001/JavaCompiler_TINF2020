package Statements;

import Expressions.IExpression;

/**
 * target.name();
 */
public class MethodCallStatement implements IStatement
{
    private String name;
    private IExpression target;

    public MethodCallStatement(String name, IExpression target)
    {
        this.name = name;
        this.target = target;
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
