package TypedDataClasses.typedStatementExpression;


import DataClasses.Types.IMethodType;
import TypedDataClasses.typedExpressions.ITypedExpression;

public record TypedAssignStatementExpression(ITypedExpression expressionA, ITypedExpression expressionB, IMethodType objectType) implements ITypedStatementExpression {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
