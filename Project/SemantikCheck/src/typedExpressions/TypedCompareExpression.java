package typedExpressions;

import Expressions.*;
import Types.IType;

public record TypedCompareExpression(CompareExpression unTypedCompareExpression, IType objectType) implements  ITypedExpression {


}