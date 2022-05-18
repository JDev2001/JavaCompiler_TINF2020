package Parser.adapter.GeneralAdapter;

import Parser.DataClasses.Common.Block;
import Parser.adapter.Statements.StatementAdapter;
import Parser.DataClasses.Statements.IStatement;
import Parser.generated.antlrGrammarParser;

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
