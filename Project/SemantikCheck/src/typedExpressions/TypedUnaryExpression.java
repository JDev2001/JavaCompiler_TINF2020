package typedExpressions;

import Expressions.*;
import Types.IType;

public record TypedUnaryExpression(UnaryExpression unTypedUnaryExpression, IType objectType) implements ITypedExpression {


}