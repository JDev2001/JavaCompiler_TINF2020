package CodeGenerator.Factory;

import Parser.DataClasses.Common.Program;
import SemanticCheck.TypedDataClasses.typedCommon.TypedProgram;
import org.antlr.v4.runtime.CharStream;

import java.io.IOException;
import java.util.HashMap;

public interface ICodeGenerator
{

    HashMap<String, byte[]> getCode (TypedProgram program) throws IOException;

}
