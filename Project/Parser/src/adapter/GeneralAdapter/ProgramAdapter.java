package adapter.GeneralAdapter;

import Common.Program;
import Common.Class;
import generated.antlrGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class ProgramAdapter {

    /**
     *  generates a new Object of the fitting class
     *
     * @param ctx Antlr context
     * @return new Object
     */
    public Program generate(antlrGrammarParser.ProgrammContext ctx){

        //Seperate the Program in classes
        List<Class> classes = new ArrayList<>();
        ctx.jClass().forEach(classContext -> classes.add(ClassAdapter.generate(classContext)));

        return new Program(classes);
    }


}