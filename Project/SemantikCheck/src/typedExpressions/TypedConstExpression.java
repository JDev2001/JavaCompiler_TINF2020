package typedExpressions;

import Expressions.*;
import Types.IMethodType;

public record TypedConstExpression(ConstExpression unTypedConstExpression, IMethodType objectType) implements ITypedExpression {

    @Override
    public IMethodType getType() {
        return objectType;
    }
}