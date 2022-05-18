package typedExpressions;

import Expressions.BinaryExpression;
import Expressions.IExpression;
import Types.IMethodType;

public record TypedBinaryExpression(ITypedExpression a, ITypedExpression b, String operator, IMethodType objectType) implements ITypedExpression  {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}