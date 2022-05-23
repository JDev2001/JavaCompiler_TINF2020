package Parser.adapter.StatementExpression;

import Parser.DataClasses.Expressions.IExpression;
import Parser.DataClasses.Expressions.LocalOrFieldVar;
import Parser.DataClasses.Expressions.ThisExpression;
import Parser.DataClasses.StatementExpression.IStatementExpression;
import Parser.DataClasses.StatementExpression.InstVarStatementExpression;
import generated.antlrGrammarParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.beans.Expression;
import java.util.List;

public class InstVarStatementExpressionAdapter {

    public static IStatementExpression generate(antlrGrammarParser.InstVarContext ctx) {

        Object generated = generatePreviousInstVar(ctx.Identifier(),null,0);

        if (generated instanceof LocalOrFieldVar){ //this
            return new InstVarStatementExpression(((LocalOrFieldVar) generated).name(), new ThisExpression());
        }
        return (IStatementExpression) generated;
    }

    private static IExpression generatePreviousInstVar(List<TerminalNode> identifiers, IExpression previous, int position){

        if (previous == null){
            previous = new LocalOrFieldVar(identifiers.get(position).getText());
        } else {
            previous = new InstVarStatementExpression(identifiers.get(position).getText(), previous);
        }

        if (position < identifiers.size()-1){
            return InstVarStatementExpressionAdapter.generatePreviousInstVar(identifiers,previous,position+1);
        }
        return previous;
    }

}
