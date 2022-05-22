package Parser.adapter.Statements;

import Parser.DataClasses.Statements.IStatement;
import Parser.DataClasses.Statements.ReturnStatement;
import Parser.adapter.Expressions.ExpressionAdapter;
import generated.antlrGrammarParser;

public class ReturnAdapter {

    public static IStatement generate(antlrGrammarParser.JReturnContext ctx) {
        return new ReturnStatement(ExpressionAdapter.generate(ctx.expression()));
    }
}
