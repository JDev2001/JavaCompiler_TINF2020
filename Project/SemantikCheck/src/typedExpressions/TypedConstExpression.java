package typedExpressions;

import Expressions.*;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedConstExpression extends TypedBaseObject {

    public TypedConstExpression(ConstExpression unTypedConstExpression, IType objectType){
        super(objectType);
        this.ConstExpression = unTypedConstExpression;
    }

    ConstExpression ConstExpression;
}