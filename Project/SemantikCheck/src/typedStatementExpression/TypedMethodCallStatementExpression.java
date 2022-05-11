package typedStatementExpression;

import StatementExpression.*;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedMethodCallStatementExpression extends TypedBaseObject {

    public TypedMethodCallStatementExpression(MethodCallStatementExpression unTypedMethodCallStatementExpression, IType objectType){
        super(objectType);
        this.MethodCallStatementExpression = unTypedMethodCallStatementExpression;
    }

    MethodCallStatementExpression MethodCallStatementExpression;
}
