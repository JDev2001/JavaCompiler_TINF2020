package typedStatementExpression;

import StatementExpression.*;
import Types.IMethodType;

public record TypedMethodCallStatementExpression(MethodCallStatementExpression unTypedMethodCallStatementExpression, IMethodType objectType) implements ITypedStatementExpression  {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
