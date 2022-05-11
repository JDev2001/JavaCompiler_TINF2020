package typedStatements;

import Statements.IfElseStatement;
import Types.IType;

public class TypedIfElseStatement extends TypedBaseObject {

    public TypedIfElseStatement(IfElseStatement unTypedifElseStatement, IType objectType) {
        super(objectType);
        this.ifElseStatement = unTypedifElseStatement;
    }

    IfElseStatement ifElseStatement;

}
