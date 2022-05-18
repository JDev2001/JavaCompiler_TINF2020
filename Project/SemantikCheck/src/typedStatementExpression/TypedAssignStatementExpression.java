package typedStatementExpression;

import Expressions.IExpression;
import StatementExpression.*;
import Types.IMethodType;
import typedExpressions.ITypedExpression;

public record TypedAssignStatementExpression(ITypedExpression expressionA, ITypedExpression expressionB, IMethodType objectType) implements ITypedStatementExpression {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
