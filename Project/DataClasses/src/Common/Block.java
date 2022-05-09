package Common;

import Statements.IStatement;

import java.util.List;

public class Block
{
    private List<IStatement> statements;

    private List<Block> childBlocks;

    public Block(List<IStatement> statements, List<Block> childBlocks)
    {
        this.statements = statements;
        this.childBlocks = childBlocks;
    }
    public List<IStatement> getStatements()
    {
        return statements;
    }

    public List<Block> getChildBlocks()
    {
        return childBlocks;
    }
}
