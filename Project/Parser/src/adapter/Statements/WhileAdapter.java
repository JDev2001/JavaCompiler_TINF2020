package adapter.Statements;

import Statements.IStatement;
import Statements.WhileStatement;
import adapter.Expressions.ExpressionAdapter;
import adapter.GeneralAdapter.BlockAdapter;
import generated.antlrGrammarParser;

public class WhileAdapter {

    public static IStatement generate(antlrGrammarParser.JWhileContext ctx) {

        return new WhileStatement(ExpressionAdapter.generate(ctx.expression()),
                BlockAdapter.generate(ctx.block()));
    }
}
