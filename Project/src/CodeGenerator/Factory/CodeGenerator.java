package CodeGenerator.Factory;


import Parser.DataClasses.Common.Program;
import Parser.adapter.GeneralAdapter.ProgramAdapter;
import Parser.generated.antlrGrammarLexer;
import Parser.generated.antlrGrammarParser;
import org.antlr.v4.runtime.CommonTokenStream;
import CodeGenerator.BytecodeGenerator;

import java.io.IOException;
import java.util.HashMap;

public class CodeGenerator implements ICodeGenerator
{

    /**
     * Methode to generate a new syntax tree using antlr (Lexer->Tokens->Parser)
     *
     * @param inputstream input Filestream
     * @return new Program
     * @throws IOException Exception for the IOStream
     */
    @Override
    public HashMap<String, byte[]> getCode(Program program) throws IOException {

        BytecodeGenerator generator = new BytecodeGenerator(program);

        return generator.genCode();
    }
}
