package Expressions;

import Types.IType;

/**
 * int; char; MyType
 */
public record TypeExpression(IType type) implements IExpression
{
}
