package typedStatements;

import Types.IType;

public class TypedBaseObject {

    public IType getObjectType() {
        return objectType;
    }

    public TypedBaseObject(IType objectType) {
        this.objectType = objectType;
    }

    private IType objectType;
}
