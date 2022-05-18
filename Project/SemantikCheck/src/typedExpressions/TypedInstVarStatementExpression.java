package typedExpressions;

import Expressions.InstVarStatementExpression;
import Types.IMethodType;

public record TypedInstVarStatementExpression(InstVarStatementExpression unTypedInstVarStatementExpression, IMethodType objectType) implements ITypedExpression
{


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
