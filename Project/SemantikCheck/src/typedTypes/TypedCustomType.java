package typedTypes;

import Types.*;
import typedStatements.TypedBaseObject;

public class TypedCustomType extends TypedBaseObject {

    public TypedCustomType(CustomType unTypedCustomType, IType objectType) {
        super(objectType);
        this.CustomType = unTypedCustomType;
    }

    CustomType CustomType;
}
