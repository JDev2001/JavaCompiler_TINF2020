package Parser.DataClasses.Expressions;

import Parser.DataClasses.Types.IType;

/**
 * int; char; MyType
 */
public record TypeExpression(IType type) implements IExpression
{
}
