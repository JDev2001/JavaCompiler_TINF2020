package adapter.MethodAdapter;

import Common.AccessModifiers;
import Method.Method;
import generated.antlrGrammarParser;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

public class MethodeAdapter {

    /**
     *  generates a new Object of the fitting class
     *
     * @param ctx Antlr context
     * @return new Object
     */
    public static Method generate(antlrGrammarParser.MethodDeclarationContext ctx) {

        List<AccessModifiers> accessModfier = new ArrayList<>();
        List<Parameter> parameters = new ArrayList<>();


        //return new Method(ctx.Identifier().getText(), parameters, );
        return null;
    }


}
