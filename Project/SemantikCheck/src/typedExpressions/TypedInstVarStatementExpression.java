package typedExpressions;

import Expressions.IExpression;
import Expressions.InstVarStatementExpression;
import Types.IMethodType;

public record TypedInstVarStatementExpression(String varName, ITypedExpression expression, IMethodType objectType) implements ITypedExpression
{


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
