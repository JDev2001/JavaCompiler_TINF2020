package typedStatements;

import Statements.*;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedReturnStatement extends TypedBaseObject {

    public TypedReturnStatement(ReturnStatement unTypedReturnStatement, IType objectType) {
        super(objectType);
        this.ReturnStatement = unTypedReturnStatement;
    }

    ReturnStatement ReturnStatement;
}
