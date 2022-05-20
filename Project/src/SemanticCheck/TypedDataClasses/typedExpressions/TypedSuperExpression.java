package SemanticCheck.TypedDataClasses.typedExpressions;


import Parser.DataClasses.Types.IMethodType;

public record TypedSuperExpression (IMethodType objectType)  implements ITypedExpression {

    @Override
    public IMethodType getType() {
        return objectType;
    }
}