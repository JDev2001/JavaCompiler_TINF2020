package typedCommon;

import Common.Class;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedClass extends TypedBaseObject {

    public TypedClass(Class unTypedClass, IType objectType){
        super(objectType);
        this.Class = unTypedClass;
    }

    Class Class;

}
