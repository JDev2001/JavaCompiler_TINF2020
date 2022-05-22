package Parser.adapter.Expressions;

import Parser.DataClasses.Expressions.IExpression;
import Parser.DataClasses.Expressions.UnaryExpression;
import Parser.adapter.StatementExpression.StatementExpressionAdapter;
import generated.antlrGrammarParser;

public class BaseExpressionAdapter {

    public static IExpression generate(antlrGrammarParser.BasicexpressionsContext ctx) {

        if(ctx.baseType() != null){
            return BaseTypeAdapter.generate(ctx.baseType());
        }
        else if(ctx.statementExpressions() != null){
            return StatementExpressionAdapter.generate(ctx.statementExpressions());
        }
        else if(ctx.unary() != null){
            return new UnaryExpression(ExpressionAdapter.generate(ctx.unary().expression()),
                    ctx.unary().unaryOperator().getText());
        }
        return null;
    }
}
