package typedExpressions;

import Expressions.*;
import Types.IType;

public record TypedBinaryExpression(BinaryExpression unTypedBinaryExpression, IType objectType) implements ITypedExpression  {


}