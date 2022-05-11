package typedStatementExpression;

import StatementExpression.*;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedInstVarStatementExpression extends TypedBaseObject {

    public TypedInstVarStatementExpression(InstVarStatementExpression unTypedInstVarStatementExpression, IType objectType){
        super(objectType);
        this.InstVarStatementExpression = unTypedInstVarStatementExpression;
    }

    InstVarStatementExpression InstVarStatementExpression;
}
