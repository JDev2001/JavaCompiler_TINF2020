package Statements;

import Types.IType;

public class VarDeclarationStatement implements IStatement
{
    String name;
    IType type;

    public VarDeclarationStatement(String name, IType type)
    {
        this.name = name;
        this.type = type;
    }

    public String getName()
    {
        return name;
    }

    public IType getType()
    {
        return type;
    }
}
