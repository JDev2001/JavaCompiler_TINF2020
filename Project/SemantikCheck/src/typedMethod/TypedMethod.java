package typedMethod;

import Method.*;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedMethod extends TypedBaseObject {

    public TypedMethod(Method unTypedMethod, IType objectType){
        super(objectType);
        this.Method = unTypedMethod;
    }

    Method Method;
}
