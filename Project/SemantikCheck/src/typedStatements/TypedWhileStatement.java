package typedStatements;

import Statements.*;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedWhileStatement extends TypedBaseObject {

    public TypedWhileStatement(WhileStatement unTypedWhileStatement, IType objectType) {
        super(objectType);
        this.WhileStatement = unTypedWhileStatement;
    }

    WhileStatement WhileStatement;
}
