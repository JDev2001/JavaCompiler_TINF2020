package typedExpressions;

import Expressions.*;
import Types.IType;

public record TypedConstExpression(ConstExpression unTypedConstExpression, IType objectType) implements ITypedExpression {

}