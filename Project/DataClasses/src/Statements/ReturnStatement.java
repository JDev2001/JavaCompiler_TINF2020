package Statements;

import Expressions.IExpression;

public class ReturnStatement implements IStatement
{
    IExpression returnValue;

    public ReturnStatement(IExpression returnValue)
    {
        this.returnValue = returnValue;
    }

    public IExpression getReturnValue()
    {
        return returnValue;
    }
}





