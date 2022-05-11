package typedTypes;

import Types.*;
import typedStatements.TypedBaseObject;

public class TypedIntType extends TypedBaseObject {

    public TypedIntType(IntType unTypedIntType, IType objectType) {
        super(objectType);
        this.IntType = unTypedIntType;
    }

    IntType IntType;
}
