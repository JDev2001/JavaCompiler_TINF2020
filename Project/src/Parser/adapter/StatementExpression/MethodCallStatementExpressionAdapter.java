package Parser.adapter.StatementExpression;

import Parser.DataClasses.Expressions.LocalOrFieldVar;
import Parser.DataClasses.Expressions.ThisExpression;
import Parser.DataClasses.StatementExpression.IStatementExpression;
import Parser.DataClasses.StatementExpression.MethodCallStatementExpression;
import Parser.adapter.MethodAdapter.MethodArgumentCreator;
import generated.antlrGrammarParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class MethodCallStatementExpressionAdapter {


    public static IStatementExpression generate(antlrGrammarParser.MethodCallContext ctx) {

        MethodCallStatementExpression methodCallStatementExpression = MethodCallStatementExpressionAdapter.generatePreviousMethodCall(ctx.Identifier(),
                ctx.nArguments(),
                ctx.Identifier().size()-1);

        if(ctx.methodCallPrefix() != null){
            if (ctx.methodCallPrefix().instVar() != null){
                return new MethodCallStatementExpression(methodCallStatementExpression.name(),
                        InstVarStatementExpressionAdapter.generate(ctx.methodCallPrefix().instVar()),
                        methodCallStatementExpression.parameters()
                );
            }
            else{
                return new MethodCallStatementExpression(methodCallStatementExpression.name(),
                        new LocalOrFieldVar(ctx.methodCallPrefix().Identifier().getText()),
                        methodCallStatementExpression.parameters()
                );
            }
        }
        return methodCallStatementExpression;
    }

    public static MethodCallStatementExpression generatePreviousMethodCall(List<TerminalNode> ctxs,
                                                                           List<antlrGrammarParser.NArgumentsContext> arguments,
                                                                           int position){
        if (position > 0){
            return new MethodCallStatementExpression(ctxs.get(position).getText(),
                    generatePreviousMethodCall(ctxs,arguments,position-1),
                    MethodArgumentCreator.generate(arguments.get(position)));
        } else {
            return new MethodCallStatementExpression(ctxs.get(0).getText(),
                    new ThisExpression(),
                    MethodArgumentCreator.generate(arguments.get(0)));
        }
    }
}
