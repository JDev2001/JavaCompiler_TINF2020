package typedExpressions;

import Expressions.*;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedUnaryExpression extends TypedBaseObject {

    public TypedUnaryExpression(UnaryExpression unTypedUnaryExpression, IType objectType){
        super(objectType);
        this.UnaryExpression = unTypedUnaryExpression;
    }

    UnaryExpression UnaryExpression;
}