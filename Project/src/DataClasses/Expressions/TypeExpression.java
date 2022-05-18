package DataClasses.Expressions;

import DataClasses.Types.IType;

/**
 * int; char; MyType
 */
public record TypeExpression(IType type) implements IExpression
{
}
