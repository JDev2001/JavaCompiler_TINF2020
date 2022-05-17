package adapter.GeneralAdapter;

import Common.Block;
import Statements.IStatement;
import adapter.Statements.StatementAdapter;
import generated.antlrGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class BlockAdapter {

    public static Block generate(antlrGrammarParser.BlockContext ctx) {


        List<IStatement> statements = new ArrayList<>();

        //Are there any statements?
        if(ctx.statement() != null){
            ctx.statement().forEach(statementContext -> statements.add(StatementAdapter.generate(statementContext)));
        }

        return new Block(statements);
    }
}
