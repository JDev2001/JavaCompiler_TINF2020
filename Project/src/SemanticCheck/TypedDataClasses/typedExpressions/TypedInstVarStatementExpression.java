package SemanticCheck.TypedDataClasses.typedExpressions;


import Parser.DataClasses.Types.IMethodType;

public record TypedInstVarStatementExpression(String varName, ITypedExpression expression, IMethodType objectType) implements ITypedExpression
{


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
