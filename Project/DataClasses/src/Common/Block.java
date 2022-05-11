package Common;

import StatementExpression.IStatementExpression;
import Statements.IStatement;

import java.util.List;

public record Block (List<IStatement> statements) implements IStatement
{
}
