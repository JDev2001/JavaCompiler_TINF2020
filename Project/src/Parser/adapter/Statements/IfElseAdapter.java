package Parser.adapter.Statements;

import Parser.adapter.GeneralAdapter.BlockAdapter;
import Parser.DataClasses.Statements.IStatement;
import Parser.DataClasses.Statements.IfElseStatement;
import Parser.adapter.Expressions.ExpressionAdapter;
import generated.antlrGrammarParser;

public class IfElseAdapter {

    public static IStatement generate(antlrGrammarParser.IfelseContext ctx) {

        //Hier noch JElseIf ergönzen

        return new IfElseStatement(ExpressionAdapter.generate(ctx.jIf().expression()),
                BlockAdapter.generate(ctx.jIf().block()),
                null);
    }
}
