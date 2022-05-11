package typedTypes;

import Types.*;
import typedStatements.TypedBaseObject;

public class TypedBoolType extends TypedBaseObject {

    public TypedBoolType(BoolType unTypedBoolType, IType objectType) {
        super(objectType);
        this.BoolType = unTypedBoolType;
    }

    BoolType BoolType;
}
