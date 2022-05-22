package SemanticCheck.TypedDataClasses.typedExpressions;

import Parser.DataClasses.Types.IMethodType;

public record TypedLocalOrFieldVar(String name, IMethodType objectType) implements ITypedExpression
{
    @Override
    public IMethodType getType() {
        return objectType;
    }
}
