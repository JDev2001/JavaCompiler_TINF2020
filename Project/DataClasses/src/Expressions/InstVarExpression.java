package Expressions;

import java.util.List;

/**
 * Instanzvariable: myObj.x
 */
public class InstVarExpression implements IExpression
{
    String varName;
    IExpression expression;

    public InstVarExpression(String varName, IExpression expression)
    {
        this.varName = varName;
        this.expression = expression;
    }

    public String getVarName()
    {
        return varName;
    }

    public IExpression getExpression()
    {
        return expression;
    }

}
