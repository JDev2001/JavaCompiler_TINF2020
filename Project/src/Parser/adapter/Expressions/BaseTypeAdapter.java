package Parser.adapter.Expressions;

import Parser.DataClasses.Expressions.*;
import Parser.adapter.StatementExpression.StatementExpressionAdapter;
import Parser.adapter.Types.TypeAdapter;
import generated.antlrGrammarParser;

public class BaseTypeAdapter {

    public static IExpression generate(antlrGrammarParser.BaseTypeContext ctx) {

        if(ctx.JBoolean() != null){
            return new BooleanExpression((ctx.JBoolean().getText().equals("true")));
        }
        else if(ctx.JNull()!= null){
            return new JNullExpression();
        }
        else if(ctx.This() != null){
            return new ThisExpression();
        }
        else if(ctx.type() != null){
            return new TypeExpression(TypeAdapter.generate(ctx.type()));
        }
        else if(ctx.JCharacter() != null){
            //'a' -> charAt(1) = a
            return new CharacterExpression(ctx.JCharacter().getText().charAt(1));
        }
        else if(ctx.Const() != null){
            //So Richtig??
            return new ConstExpression(ctx.Const().getText());
        }
        else if(ctx.Super() != null){
            return new SuperExpression();
        }
        else if(ctx.Identifier() != null){
            return new LocalOrFieldVar(ctx.Identifier().getText());
        }
        return null;
    }
}
