package typedExpressions;

import Expressions.*;
import Types.IMethodType;

public record TypedThisExpression(IMethodType objectType) implements ITypedExpression {

    @Override
    public IMethodType getType() {
        return objectType;
    }
}