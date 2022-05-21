package CodeGenerator.Factory;

import Parser.DataClasses.Common.Program;
import org.antlr.v4.runtime.CharStream;

import java.io.IOException;
import java.util.HashMap;

public interface ICodeGenerator
{

    HashMap<String, byte[]> getCode (Program program) throws IOException;

}
