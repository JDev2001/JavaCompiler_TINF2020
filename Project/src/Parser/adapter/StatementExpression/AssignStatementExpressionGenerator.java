package Parser.adapter.StatementExpression;

import Parser.DataClasses.Expressions.BinaryExpression;
import Parser.DataClasses.Expressions.IntExpression;
import Parser.DataClasses.Expressions.LocalOrFieldVar;
import Parser.DataClasses.StatementExpression.AssignStatementExpression;
import Parser.DataClasses.StatementExpression.IStatementExpression;
import Parser.DataClasses.StatementExpression.InstVarStatementExpression;
import Parser.DataClasses.Statements.IStatement;
import Parser.adapter.Expressions.ExpressionAdapter;
import generated.antlrGrammarParser;

public class AssignStatementExpressionGenerator {

    public static IStatementExpression generate(antlrGrammarParser.AssignContext ctx) {


        if(ctx.assignOperator().getText().equals("=")) {
            if (ctx.instVar() == null) {
                return new AssignStatementExpression(new LocalOrFieldVar(ctx.Identifier().getText()), ExpressionAdapter.generate(ctx.expression()));
            } else {
                return new AssignStatementExpression(InstVarStatementExpressionAdapter.generate(ctx.instVar()), ExpressionAdapter.generate(ctx.expression()));
            }
        }
        else{

            if (ctx.instVar() != null) {

                IStatementExpression instVar = InstVarStatementExpressionAdapter.generate(ctx.instVar());

                return new AssignStatementExpression(instVar, new BinaryExpression(instVar,
                        ExpressionAdapter.generate(ctx.expression()), ctx.assignOperator().getText()));
            } else { //localOrFieldVar
                LocalOrFieldVar localOrFieldVar = new LocalOrFieldVar(ctx.Identifier().getText());
                return new AssignStatementExpression(localOrFieldVar,
                        new BinaryExpression(localOrFieldVar, new IntExpression(1), ctx.assignOperator().getText()));
            }
        }
    }
}
