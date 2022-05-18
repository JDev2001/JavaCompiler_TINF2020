package TypedDataClasses.typedExpressions;


import DataClasses.Types.IMethodType;
import DataClasses.Types.IType;

public record TypedTypeExpression(IType type, IMethodType objectType) implements ITypedExpression {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}