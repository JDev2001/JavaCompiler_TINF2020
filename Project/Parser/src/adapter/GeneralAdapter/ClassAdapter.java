package adapter.GeneralAdapter;

import Common.Class;
import Field.Field;
import Method.Method;
import adapter.FieldAdapter.FieldAdapter;
import adapter.MethodAdapter.MethodeAdapter;
import generated.antlrGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class ClassAdapter {


    /**
     *  generates a new Object of the fitting class
     *
     * @param ctx Antlr context
     * @return new Object
     */
    public static Class generate(antlrGrammarParser.JClassContext ctx) {

        List<Method> methods = new ArrayList<Method>();
        List<Method> constructors = new ArrayList<Method>();
        List<Field> fields = new ArrayList<Field>();

        ctx.classBody().fieldDeclaration().forEach(fieldDeclarationContext -> fields.addAll(FieldAdapter.generate(fieldDeclarationContext)));

        //Differentiate constructor and normal methode
        ctx.classBody().constructor().forEach(constructorContext -> constructors.add(MethodeAdapter.generateConstructor(ctx.Identifier().getText(), constructorContext)));
        ctx.classBody().methodDeclaration().forEach(methodDeclarationContext -> methods.add(MethodeAdapter.generate(methodDeclarationContext)));

        return new Class(ctx.Identifier().getText(), constructors, methods, fields);
    }




}
