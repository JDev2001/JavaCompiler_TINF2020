package Parser.adapter.StatementExpression;

import Parser.DataClasses.Expressions.*;
import Parser.DataClasses.StatementExpression.*;
import Parser.DataClasses.Statements.IStatement;
import Parser.adapter.Expressions.ExpressionAdapter;
import Parser.adapter.Types.TypeAdapter;
import generated.antlrGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class StatementExpressionAdapter {

    public static IStatementExpression generate(antlrGrammarParser.StatementExpressionsContext ctx) {

        if(ctx.assign() != null){
            return AssignStatementExpressionGenerator.generate(ctx.assign());
        }
        else if(ctx.methodCall() != null){
            return MethodCallStatementExpressionAdapter.generate(ctx.methodCall());
        }
        else if(ctx.jNew() != null){
            return new NewStatementExpression(MethodCallStatementExpressionAdapter.generateWithNew(ctx.jNew()));
        }
        return null;

    }
}
