package typedExpressions;

import Expressions.*;
import Types.IMethodType;

public record TypedSuperExpression (String name, IMethodType objectType)  implements ITypedExpression {

    @Override
    public IMethodType getType() {
        return objectType;
    }
}