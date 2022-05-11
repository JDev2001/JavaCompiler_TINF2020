package typedTypes;

import Types.*;
import typedStatements.TypedBaseObject;

public class TypedCharType extends TypedBaseObject {

    public TypedCharType(CharType unTypedCharType, IType objectType) {
        super(objectType);
        this.CharType = unTypedCharType;
    }

    CharType CharType;
}
