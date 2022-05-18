package DataClasses.Common;

import DataClasses.Statements.IStatement;

import java.util.List;

public record Block (List<IStatement> statements) implements IStatement
{
}
