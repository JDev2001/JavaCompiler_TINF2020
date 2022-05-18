package adapter.MethodAdapter;

import Method.Method;
import Method.MethodParameter;
import Types.VoidType;
import adapter.GeneralAdapter.AccessModifierAdapter;
import adapter.GeneralAdapter.BlockAdapter;
import adapter.Types.MethodeTypeAdapter;
import adapter.Types.TypeAdapter;
import generated.antlrGrammarParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MethodeAdapter {

    /**
     * generates a new Object of the fitting class
     *
     * @param ctx Antlr context
     * @return new Object
     */
    public static Method generate(antlrGrammarParser.MethodDeclarationContext ctx) {

        List<MethodParameter> methodParameters = new ArrayList<>();

        //Direct implementation of the method Parameter generation!!!!
        if (ctx.nMethodParameters() != null) {
            //generates method parameter -> parameter gets Identifier and Objecttyp
            ctx.nMethodParameters().methodParameter().forEach(
                    methodParameter -> methodParameters.add(
                            new MethodParameter(methodParameter.Identifier().getText(), TypeAdapter.generate(methodParameter.type()))));
        }

        //Hier muss noch zwischen Main Methoden unterschieden werden -> vgl awesome

        return new Method(AccessModifierAdapter.generate(ctx.AccessModifier()),
                ctx.Identifier().getText(),
                methodParameters,
                MethodeTypeAdapter.generate(ctx.methodType()),
                BlockAdapter.generate(ctx.block()));
    }

    public static Method generateConstructor(String className, antlrGrammarParser.ConstructorContext ctx){

        List<MethodParameter> methodParameters = new ArrayList<>();

        //Direct implementation of the method Parameter generation!!!!
        if (ctx.nMethodParameters() != null) {
            //generates method parameter -> parameter gets Identifier and Objecttyp
            ctx.nMethodParameters().methodParameter().forEach(
                    methodParameter -> methodParameters.add(
                            new MethodParameter(methodParameter.Identifier().getText(), TypeAdapter.generate(methodParameter.type()))));
        }

        if(Objects.equals(className, ctx.Identifier().getText())){
            return new Method(AccessModifierAdapter.generate(ctx.AccessModifier()),
                    className,
                    methodParameters,
                    new VoidType(),
                    BlockAdapter.generate(ctx.block()));
        }

        return null;
    }
}
