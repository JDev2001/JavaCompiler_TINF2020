package Parser.adapter.Types;

import Parser.DataClasses.Types.*;
import generated.antlrGrammarParser;

public class MethodeTypeAdapter {


    public static IMethodType generate(antlrGrammarParser.MethodTypeContext ctx) {

        //'void'|Type

        if(ctx.type() != null){
            switch (ctx.type().getText()) {
                case "int":
                    return new IntType();
                case "char":
                    return new CharType();
                case "bool":
                case "boolean":
                    return new BoolType();
                default:
                    return new CustomType(ctx.type().getText());
            }
        }
        else{
            return new VoidType();
        }
    }
}
