package Parser.DataClasses.Statements;

import Parser.DataClasses.Types.IType;

public record VarDeclarationStatement(String name, IType type) implements IStatement
{

}
