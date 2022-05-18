package typedStatementExpression;

import StatementExpression.*;
import Types.IMethodType;

public record TypedNewStatementExpression(NewStatementExpression unTypedNewStatementExpression, IMethodType objectType) implements ITypedStatementExpression {


    @Override
    public IMethodType getType() {
        return objectType;
    }
}
