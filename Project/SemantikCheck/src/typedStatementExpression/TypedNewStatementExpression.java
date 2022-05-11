package typedStatementExpression;

import StatementExpression.*;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedNewStatementExpression extends TypedBaseObject {

    public TypedNewStatementExpression(NewStatementExpression unTypedNewStatementExpression, IType objectType){
        super(objectType);
        this.NewStatementExpression = unTypedNewStatementExpression;
    }

    NewStatementExpression NewStatementExpression;
}
