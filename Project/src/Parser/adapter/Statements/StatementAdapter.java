package Parser.adapter.Statements;

import Parser.DataClasses.Statements.IStatement;
import Parser.adapter.GeneralAdapter.BlockAdapter;
import Parser.adapter.StatementExpression.StatementExpressionAdapter;
import generated.antlrGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class StatementAdapter {

    public static List<IStatement> generate(antlrGrammarParser.StatementContext ctx){

        //returns a list cause vardecls can be more than one -> int a,b,c,d,e;

        List<IStatement> retList = new ArrayList<>();

        if(ctx.block() != null){
            retList.add(BlockAdapter.generate(ctx.block()));
            return retList;
        }
        else if(ctx.varDeclaration() != null){
            retList.addAll(VarDeclarationAdapter.generate(ctx.varDeclaration()));
            return retList;
        }
        else if(ctx.ifelse() != null){
            retList.add(IfElseAdapter.generate(ctx.ifelse()));
            return retList;
        }
        else if(ctx.jWhile() != null){
            retList.add(WhileAdapter.generate(ctx.jWhile()));
            return retList;
        }
        else if(ctx.jReturn() != null){
            retList.add(ReturnAdapter.generate(ctx.jReturn()));
            return retList;
        }
        else if(ctx.statementExpressions() != null){
            retList.add(StatementExpressionAdapter.generate(ctx.statementExpressions()));
            return retList;
        }
        else {
            System.out.println("Missmatch -> in Statement Adapter!");
            return null;
        }
    }
}
