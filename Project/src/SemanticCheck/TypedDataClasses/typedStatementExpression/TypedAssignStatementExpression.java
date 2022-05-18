package SemanticCheck.TypedDataClasses.typedStatementExpression;


import Parser.DataClasses.Types.IMethodType;
import SemanticCheck.TypedDataClasses.typedExpressions.ITypedExpression;

public record TypedAssignStatementExpression(ITypedExpression expressionA, ITypedExpression expressionB, IMethodType objectType) implements ITypedStatementExpression {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
