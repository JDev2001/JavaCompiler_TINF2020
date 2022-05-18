package typedExpressions;

import Expressions.*;
import Types.IMethodType;

public record TypedUnaryExpression(UnaryExpression unTypedUnaryExpression, IMethodType objectType) implements ITypedExpression {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}