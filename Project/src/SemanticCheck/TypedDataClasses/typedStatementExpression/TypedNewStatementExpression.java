package SemanticCheck.TypedDataClasses.typedStatementExpression;


import Parser.DataClasses.Types.IMethodType;
import Parser.DataClasses.Types.IType;

public record TypedNewStatementExpression(TypedMethodCallStatementExpression constructorCall, IType type, IMethodType objectType) implements ITypedStatementExpression {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
