package typedExpressions;

import Expressions.*;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedJNullExpression extends TypedBaseObject {

    public TypedJNullExpression(JNullExpression unTypedJNullExpression, IType objectType){
        super(objectType);
        this.JNullExpression = unTypedJNullExpression;
    }

    JNullExpression JNullExpression;
}