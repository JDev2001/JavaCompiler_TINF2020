package Parser.adapter.Types;

import Parser.DataClasses.Types.IMethodType;
import Parser.DataClasses.Types.VoidType;
import Parser.generated.antlrGrammarParser;

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
