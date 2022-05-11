package typedStatementExpression;

import StatementExpression.*;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedAssignStatementExpression extends TypedBaseObject {

    public TypedAssignStatementExpression(AssignStatementExpression unTypedAssignStatementExpression, IType objectType){
        super(objectType);
        this.AssignStatementExpression = unTypedAssignStatementExpression;
    }

    AssignStatementExpression AssignStatementExpression;
}
