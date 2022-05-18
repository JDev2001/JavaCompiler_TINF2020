package typedExpressions;

import Types.IMethodType;
import Types.IType;

public record TypedTypeExpression(IType type, IMethodType objectType) implements ITypedExpression {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}