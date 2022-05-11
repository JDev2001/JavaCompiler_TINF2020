package typedExpressions;

import Expressions.*;
import Types.IType;

public record TypedThisExpression(ThisExpression unTypedThisExpression, IType objectType) implements ITypedExpression {

}