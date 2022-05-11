package typedExpressions;

import Expressions.*;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedTypeExpression extends TypedBaseObject {

    public TypedTypeExpression(TypeExpression unTypedTypeExpression, IType objectType){
        super(objectType);
        this.TypeExpression = unTypedTypeExpression;
    }

    TypeExpression TypeExpression;
}