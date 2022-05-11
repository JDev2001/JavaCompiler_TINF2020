package typedExpressions;

import Expressions.*;
import Types.IType;

public record TypedTypeExpression(TypeExpression unTypedTypeExpression, IType objectType) implements ITypedExpression {


}