package SemanticCheck.TypedDataClasses.typedStatementExpression;


import Parser.DataClasses.Types.IMethodType;

public record TypedNewStatementExpression(TypedMethodCallStatementExpression constructorCall, IMethodType objectType) implements ITypedStatementExpression {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}