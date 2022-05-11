package typedCommon;

import Common.AccessModifiers;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedAccessModifiers extends TypedBaseObject {

    public TypedAccessModifiers(AccessModifiers unTypedAccessModifiers, IType objectType){
        super(objectType);
        this.AccessModifiers = unTypedAccessModifiers;
    }

    AccessModifiers AccessModifiers;
}
