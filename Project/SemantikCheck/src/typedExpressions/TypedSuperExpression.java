package typedExpressions;

import Expressions.*;
import Types.IMethodType;

public record TypedSuperExpression (SuperExpression unTypedSuperExpression, IMethodType objectType)  implements ITypedExpression {

    @Override
    public IMethodType getType() {
        return objectType;
    }
}