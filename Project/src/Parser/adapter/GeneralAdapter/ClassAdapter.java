package Parser.adapter.GeneralAdapter;

import Parser.DataClasses.Common.Class;
import Parser.DataClasses.Field.Field;
import Parser.DataClasses.Method.Method;
import Parser.adapter.FieldAdapter.FieldAdapter;
import Parser.adapter.MethodAdapter.MethodeAdapter;
import Parser.generated.antlrGrammarParser;

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
