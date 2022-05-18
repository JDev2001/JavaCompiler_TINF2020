package adapter.Types;

import Types.*;
import generated.antlrGrammarParser;

public class MethodeTypeAdapter {


    public static IMethodType generate(antlrGrammarParser.MethodTypeContext ctx) {

        //'void'|Type

        if(ctx.type() != null){
            new TypeAdapter();
        }
        else if(ctx.getText().equals("void")){
            return new VoidType();
        }
        return null;
    }
}
