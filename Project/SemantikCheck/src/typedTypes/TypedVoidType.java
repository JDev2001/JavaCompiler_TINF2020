package typedTypes;

import Types.*;
import typedStatements.TypedBaseObject;

public class TypedVoidType extends TypedBaseObject {

    public TypedVoidType(VoidType unTypedVoidType, IType objectType) {
        super(objectType);
        this.VoidType = unTypedVoidType;
    }

    VoidType VoidType;
}
