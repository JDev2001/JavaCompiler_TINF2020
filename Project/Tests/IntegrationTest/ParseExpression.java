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
    public void Test2() throws Exception
    {
        String myClass = "";
        String src = "class Empty { private int A() { return 5; } public int Method(int x, int y, int z) { return x+y+z+A();} }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        TypedProgram typedProgram = new SemantikCheckImpl().semantikCheckStart(syntaxTree);

        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(typedProgram);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode.get("Empty"));
        Class c = loader.findClass("Empty");
        var methods = c.getMethods();
        var c2 = c.getConstructors();
        var obj = c.newInstance();
        var methodInstance = c.getDeclaredMethod("Method",int.class ,int.class,int.class);

        var res =(int)methodInstance.invoke(obj,5,10,11);

        System.out.println(res);

        Assertions.assertEquals(31,res);
    }
    @org.junit.jupiter.api.Test
    public void Test() throws Exception
    {
        String myClass = "";
        String src = "class Empty { public int Method(int x, int y, int z) { return x+y+z;} }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        TypedProgram typedProgram = new SemantikCheckImpl().semantikCheckStart(syntaxTree);

        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(typedProgram);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode.get("Empty"));
        Class c = loader.findClass("Empty");
        var methods = c.getMethods();
        var c2 = c.getConstructors();
        var obj = c.newInstance();
        var methodInstance = c.getDeclaredMethod("Method",int.class ,int.class,int.class);

        var res =(int)methodInstance.invoke(obj,5,10,11);

        System.out.println(res);

        Assertions.assertEquals(26,res);
    }
}
