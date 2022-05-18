package Parser.adapter.Statements;

import Parser.adapter.GeneralAdapter.BlockAdapter;
import DataClasses.Statements.IStatement;
import DataClasses.Statements.WhileStatement;
import Parser.adapter.Expressions.ExpressionAdapter;
import Parser.generated.antlrGrammarParser;

public class WhileAdapter {

    public static IStatement generate(antlrGrammarParser.JWhileContext ctx) {

        return new WhileStatement(ExpressionAdapter.generate(ctx.expression()),
                BlockAdapter.generate(ctx.block()));
    }
}
