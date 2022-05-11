package typedField;

import Field.*;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedField extends TypedBaseObject {

    public TypedField(Field unTypedField, IType objectType){
        super(objectType);
        this.Field = unTypedField;
    }

    Field Field;
}
