package Parser.adapter.Expressions;

import Parser.DataClasses.Expressions.BinaryExpression;
import Parser.DataClasses.Expressions.IExpression;
import generated.antlrGrammarParser;

public class ExpressionAdapter {

    public static IExpression generate(antlrGrammarParser.ExpressionContext ctx) {

        if (ctx.basicexpressions() != null) {
            return BaseExpressionAdapter.generate(ctx.basicexpressions());
        } else { //binary
            return BinaryExpressionAdapter.generate(ctx);
        }
    }
}
