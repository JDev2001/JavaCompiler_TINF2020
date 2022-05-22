package Parser.adapter.Expressions;

import Parser.DataClasses.Expressions.BinaryExpression;
import Parser.DataClasses.Expressions.IExpression;
import generated.antlrGrammarParser;

public class BinaryExpressionAdapter {

    public static IExpression generate(antlrGrammarParser.ExpressionContext ctx) {
        return new BinaryExpression(ExpressionAdapter.generate(ctx.expression(0)),
                ExpressionAdapter.generate(ctx.expression(1)),
                ctx.operators().getText());
    }
}
