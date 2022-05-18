package TypedDataClasses.typedExpressions;

import DataClasses.Types.IMethodType;

public record TypedBinaryExpression(ITypedExpression a, ITypedExpression b, String operator, IMethodType objectType) implements ITypedExpression  {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}