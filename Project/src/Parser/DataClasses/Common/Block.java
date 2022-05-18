package Parser.DataClasses.Common;

import Parser.DataClasses.Statements.IStatement;

import java.util.List;

public record Block (List<IStatement> statements) implements IStatement
{
}
