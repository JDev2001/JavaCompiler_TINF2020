package Statements;

import Expressions.IExpression;

/**
 * x = Expression
 * z.B. x = new ABC();
 * oder x = 5;
 */

public class AssignStatement implements IStatement
{
    private IExpression expression;
    private String varName;

    public AssignStatement(IExpression expression, String varName)
    {
        this.expression = expression;
        this.varName = varName;
    }

    public IExpression getExpression()
    {
        return expression;
    }

    public String getVarName()
    {
        return varName;
    }
}
