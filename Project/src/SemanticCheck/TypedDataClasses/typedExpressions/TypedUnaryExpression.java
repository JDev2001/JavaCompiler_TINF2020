package SemanticCheck.TypedDataClasses.typedExpressions;

import Parser.DataClasses.Types.IMethodType;

public record TypedUnaryExpression(ITypedExpression expression, String operator, IMethodType objectType) implements ITypedExpression {

    @Override
    public IMethodType getType() {
        return objectType;
    }
}