package typedStatementExpression;

import StatementExpression.*;
import Types.IMethodType;

public record TypedAssignStatementExpression(AssignStatementExpression unTypedAssignStatementExpression, IMethodType objectType) implements ITypedStatementExpression {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
