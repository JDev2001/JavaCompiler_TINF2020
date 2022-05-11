package typedExpressions;

import Expressions.*;
import Types.IType;
import typedStatements.TypedBaseObject;

public class TypedCompareExpression extends TypedBaseObject {

    public TypedCompareExpression(CompareExpression unTypedCompareExpression, IType objectType){
        super(objectType);
        this.CompareExpression = unTypedCompareExpression;
    }

    CompareExpression CompareExpression;
}