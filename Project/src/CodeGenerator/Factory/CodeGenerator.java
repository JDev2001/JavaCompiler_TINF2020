package CodeGenerator.Factory;


import Parser.DataClasses.Common.Program;
import Parser.adapter.GeneralAdapter.ProgramAdapter;
import SemanticCheck.TypedDataClasses.typedCommon.TypedProgram;
import org.antlr.v4.runtime.CommonTokenStream;
import CodeGenerator.BytecodeGenerator;

import java.io.IOException;
import java.util.HashMap;

public class CodeGenerator implements ICodeGenerator
{

    /**
     * Methode to generate a new syntax tree using antlr (Lexer->Tokens->Parser)
     *
     * @return new Program
     * @throws IOException Exception for the IOStream
     */
    @Override
    public HashMap<String, byte[]> getCode(TypedProgram program) throws IOException {

        BytecodeGenerator generator = new BytecodeGenerator(program);

        return generator.genCode();
    }
}
