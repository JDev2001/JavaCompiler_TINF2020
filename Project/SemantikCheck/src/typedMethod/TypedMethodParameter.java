package typedMethod;

import Method.*;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedMethodParameter extends TypedBaseObject {

    public TypedMethodParameter(MethodParameter unTypedMethodParameter, IType objectType){
        super(objectType);
        this.MethodParameter = unTypedMethodParameter;
    }

    MethodParameter MethodParameter;
}
