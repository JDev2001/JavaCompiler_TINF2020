package Parser.SyntaxTreeGenerator;

import Parser.DataClasses.Common.Program;
import org.antlr.v4.runtime.CharStream;

import java.io.IOException;

public interface ISyntaxTreeGenerator
{

    Program getSyntaxTree(CharStream inputstream) throws IOException;

}
