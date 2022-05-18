package typedExpressions;

import Expressions.BinaryExpression;
import Types.IMethodType;

public record TypedBinaryExpression(BinaryExpression unTypedBinaryExpression, IMethodType objectType) implements ITypedExpression  {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}