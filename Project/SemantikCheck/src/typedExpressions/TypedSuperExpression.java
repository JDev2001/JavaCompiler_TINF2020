package typedExpressions;

import Expressions.*;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedSuperExpression extends TypedBaseObject {

    public TypedSuperExpression (SuperExpression unTypedSuperExpression, IType objectType){
        super(objectType);
        this.SuperExpression = unTypedSuperExpression;
    }

    SuperExpression SuperExpression;
}