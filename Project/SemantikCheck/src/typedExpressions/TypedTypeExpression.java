package typedExpressions;

import Expressions.*;
import Types.IMethodType;

public record TypedTypeExpression(TypeExpression unTypedTypeExpression, IMethodType objectType) implements ITypedExpression {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}