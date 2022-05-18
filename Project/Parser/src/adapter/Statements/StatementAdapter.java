package adapter.Statements;

import Statements.IStatement;
import adapter.GeneralAdapter.BlockAdapter;
import adapter.StatementExpression.StatementExpressionAdapter;
import generated.antlrGrammarParser;

public class StatementAdapter {

    public static IStatement generate(antlrGrammarParser.StatementContext ctx){

        if(ctx.block() != null){
            return BlockAdapter.generate(ctx.block());
        }
        else if(ctx.varDeclaration() != null){
            return VarDeclarationAdapter.generate(ctx.varDeclaration());
        }
        else if(ctx.ifelse() != null){
            new IfElseAdapter().generate(ctx.ifelse());
        }
        else if(ctx.jWhile() != null){
            return WhileAdapter.generate(ctx.jWhile());
        }
        else if(ctx.jReturn() != null){
            return ReturnAdapter.generate(ctx.jReturn());
        }
        else if(ctx.statementExpressions() != null){
            return StatementExpressionAdapter.generate(ctx.statementExpressions());
        }
        else{
            System.out.println("Missmatch -> in Statement Adapter!");
            return null;
        }
        return null;
    }
}
