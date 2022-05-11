package typedExpressions;

import Expressions.*;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedThisExpression extends TypedBaseObject {

    public TypedThisExpression(ThisExpression unTypedThisExpression, IType objectType){
        super(objectType);
        this.ThisExpression = unTypedThisExpression;
    }

    ThisExpression ThisExpression;
}