package IntegrationTest;

import CodeGenerator.BytecodeGenerator;
import Helper.ReflectLoader;
import Parser.DataClasses.Common.Program;
import Parser.Factory.SyntaxTreeGenerator;
import SemanticCheck.Factory.SemantikCheckImpl;
import SemanticCheck.TypedDataClasses.typedCommon.TypedProgram;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ParseExpression
{
    @org.junit.jupiter.api.Test
    public void Test() throws Exception
    {
        String myClass = "";
        String src = "class Empty { public int Method() { return 5;} }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        TypedProgram typedProgram = new SemantikCheckImpl().semantikCheckStart(syntaxTree);

        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(typedProgram);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode.get("Empty"));
        Class c = loader.findClass("Empty");
        var methods = c.getMethods();
        var c2 = c.getConstructors();
        var obj = c.newInstance();
        var methodInstance = c.getDeclaredMethod("Method");

        var res =(int)methodInstance.invoke(obj);

        System.out.println(res);

        Assertions.assertEquals(5,res);
    }
}
