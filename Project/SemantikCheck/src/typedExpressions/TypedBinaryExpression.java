package typedExpressions;

import Expressions.BinaryExpression;
import Types.IType;

public record TypedBinaryExpression(BinaryExpression unTypedBinaryExpression, IType objectType) implements ITypedExpression  {


}