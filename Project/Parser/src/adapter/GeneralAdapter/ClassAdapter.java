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
        List<Field> fields = new ArrayList<Field>();

        ctx.classBody().methodDeclaration().forEach(methodDeclarationContext -> methods.add(MethodeAdapter.generate(methodDeclarationContext)));
        ctx.classBody().fieldDeclaration().forEach(fieldDeclarationContext -> fields.add(FieldAdapter.generate(fieldDeclarationContext)));

        return new Class(ctx.Identifier().getText(), methods, fields);
    }




}
