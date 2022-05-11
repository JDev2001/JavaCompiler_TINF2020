package typedExpressions;

import Expressions.*;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedBinaryExpression extends TypedBaseObject {

    public TypedBinaryExpression(BinaryExpression unTypedBinaryExpression, IType objectType){
        super(objectType);
        this.BinaryExpression = unTypedBinaryExpression;
    }

    BinaryExpression BinaryExpression;
}