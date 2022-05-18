package typedExpressions;

import Expressions.*;
import Types.IMethodType;
import Types.IType;

public record TypedJNullExpression(JNullExpression unTypedJNullExpression, IMethodType objectType) implements ITypedExpression {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}