package DataClasses.Statements;

import DataClasses.Types.IType;

public record VarDeclarationStatement(String name, IType type) implements IStatement
{

}
