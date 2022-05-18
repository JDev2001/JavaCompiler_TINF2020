package TypedDataClasses.typedExpressions;


import DataClasses.Types.IMethodType;

public record TypedThisExpression(IMethodType objectType) implements ITypedExpression {

    @Override
    public IMethodType getType() {
        return objectType;
    }
}