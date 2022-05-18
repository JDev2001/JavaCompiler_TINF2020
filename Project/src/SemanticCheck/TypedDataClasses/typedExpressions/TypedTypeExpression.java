package SemanticCheck.TypedDataClasses.typedExpressions;


import Parser.DataClasses.Types.IMethodType;
import Parser.DataClasses.Types.IType;

public record TypedTypeExpression(IType type, IMethodType objectType) implements ITypedExpression {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}