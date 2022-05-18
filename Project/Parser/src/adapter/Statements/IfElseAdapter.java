package adapter.Statements;

import Statements.IStatement;
import Statements.IfElseStatement;
import adapter.Expressions.ExpressionAdapter;
import adapter.GeneralAdapter.BlockAdapter;
import generated.antlrGrammarParser;

public class IfElseAdapter {

    public IStatement generate(antlrGrammarParser.IfelseContext ctx) {

        //Hier noch JElseIf ergönzen

        return new IfElseStatement(ExpressionAdapter.generate(ctx.jIf().expression()),
                BlockAdapter.generate(ctx.jIf().block()),
                null);
    }
}
