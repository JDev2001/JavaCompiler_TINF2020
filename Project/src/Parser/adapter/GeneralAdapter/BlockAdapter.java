package Parser.adapter.GeneralAdapter;

import Parser.DataClasses.Common.Block;
import Parser.adapter.Statements.StatementAdapter;
import Parser.DataClasses.Statements.IStatement;
import generated.antlrGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class BlockAdapter {

    public static Block generate(antlrGrammarParser.BlockContext ctx) {


        List<IStatement> statements = new ArrayList<>();

        //Are there any statements?
        if(ctx.statement() != null){
            ctx.statement().forEach(statementContext -> statements.addAll(StatementAdapter.generate(statementContext)));
        }

        return new Block(statements);
    }
}
