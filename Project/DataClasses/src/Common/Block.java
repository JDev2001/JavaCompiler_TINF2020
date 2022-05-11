package Common;

import StatementExpression.IStatementExpression;
import Statements.IStatement;

import java.util.List;

public class Block implements IStatement
{
    private final List<IStatement> statements;

    public Block(List<IStatement> statements)
    {
        this.statements = statements;
    }
    public List<IStatement> getStatements()
    {
        return statements;
    }
}
