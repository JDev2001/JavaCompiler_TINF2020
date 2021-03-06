package Parser.adapter.Statements;

import Parser.DataClasses.StatementExpression.AssignStatementExpression;
import Parser.adapter.Expressions.ExpressionAdapter;
import Parser.adapter.StatementExpression.AssignStatementExpressionGenerator;
import Parser.adapter.StatementExpression.StatementExpressionAdapter;
import Parser.adapter.Types.TypeAdapter;
import Parser.DataClasses.Statements.IStatement;
import Parser.DataClasses.Statements.VarDeclarationStatement;
import generated.antlrGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class VarDeclarationAdapter {

    public static List<IStatement> generate(antlrGrammarParser.VarDeclarationContext ctx) {

        List<IStatement> statements = new ArrayList<>();


        ctx.Identifier().forEach(identifier -> statements.add(new VarDeclarationStatement(identifier.getText(),
                TypeAdapter.generate(ctx.type()))));

        //return new VarDeclarationStatement(ctx.Identifier().g, )
        return statements;
    }
}
