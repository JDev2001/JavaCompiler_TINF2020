package typedStatements;

import Statements.*;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedVarDeclarationStatement extends TypedBaseObject {

    public TypedVarDeclarationStatement(VarDeclarationStatement unTypedVarDeclarationStatement, IType objectType) {
        super(objectType);
        this.VarDeclarationStatement = unTypedVarDeclarationStatement;
    }

    VarDeclarationStatement VarDeclarationStatement;
}
