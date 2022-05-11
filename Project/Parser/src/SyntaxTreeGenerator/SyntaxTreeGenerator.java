package SyntaxTreeGenerator;



import java.io.IOException;

import Common.Program;
import adapter.GeneralAdapter.ProgramAdapter;
import generated.antlrGrammarLexer;
import generated.antlrGrammarParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;

public class SyntaxTreeGenerator implements ISyntaxTreeGenerator
{

    /**
     * Methode to generate a new syntax tree using antlr (Lexer->Tokens->Parser)
     *
     * @param inputstream input Filestream
     * @return new Program
     * @throws IOException Exception for the IOStream
     */
    @Override
    public Program getSyntaxTree(CharStream inputstream) throws IOException {

        //Call the generated Components from the antlr file (lexer->tokens->parser)
        antlrGrammarLexer lexer = new antlrGrammarLexer(inputstream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        antlrGrammarParser parser = new antlrGrammarParser(tokens);

        return  new ProgramAdapter().generate(parser.programm());
    }
}