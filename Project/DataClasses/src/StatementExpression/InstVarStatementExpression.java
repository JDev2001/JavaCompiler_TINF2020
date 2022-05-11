package StatementExpression;

import Expressions.IExpression;

/**
 * Instanzvariable: myObj.x
 */
public class InstVarStatementExpression implements IStatementExpression
{
    String varName;
    IExpression expression;

    public InstVarStatementExpression(String varName, IExpression expression)
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
