package Statements;

import Types.IType;

public record VarDeclarationStatement(String name, IType type) implements IStatement
{
}
