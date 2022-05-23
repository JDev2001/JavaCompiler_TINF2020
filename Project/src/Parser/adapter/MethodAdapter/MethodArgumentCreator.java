package Parser.adapter.MethodAdapter;

import Parser.DataClasses.Expressions.IExpression;
import Parser.adapter.Expressions.ExpressionAdapter;
import generated.antlrGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class MethodArgumentCreator {

    public static List<IExpression> generate(antlrGrammarParser.NArgumentsContext ctx) {

        List<IExpression> expressions = new ArrayList<>();

        ctx.expression().forEach(expressionContext -> expressions.add(ExpressionAdapter.generate(expressionContext)));

        return expressions;
    }
}
