package Expressions;

import Types.IType;

/**
 * int; char; MyType
 */
public class TypeExpression implements IExpression
{
    IType type;

    public TypeExpression(IType type)
    {
        this.type = type;
    }

    public IType getType()
    {
        return type;
    }
}
