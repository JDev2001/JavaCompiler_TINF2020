package IntegrationTest;

import CodeGenerator.BytecodeGenerator;
import Helper.ReflectLoader;
import Parser.DataClasses.Common.Program;
import Parser.Factory.SyntaxTreeGenerator;
import SemanticCheck.Factory.SemantikCheckImpl;
import SemanticCheck.TypedDataClasses.typedCommon.TypedProgram;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Assertions;

public class IntegrationTests
{
    @org.junit.jupiter.api.Test
    public void IfElse() throws Exception
    {
        String src = "class Empty { public boolean Method() { if(4>9) { return false;} else { return true;}  } }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        TypedProgram typedProgram = new SemantikCheckImpl().semantikCheckStart(syntaxTree);

        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(typedProgram);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode);
        Class c = loader.findClass("Empty");
        var methods = c.getMethods();
        var c2 = c.getConstructors();
        var obj = c.newInstance();
        var methodInstance = c.getDeclaredMethod("Method");

        var res =(boolean)methodInstance.invoke(obj);

        System.out.println(res);

        Assertions.assertEquals(true,res);
    }
    @org.junit.jupiter.api.Test
    public void AssignLocalVar() throws Exception
    {
        String src = "class Empty { public int Method() { int i; i=50; return i;} }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        TypedProgram typedProgram = new SemantikCheckImpl().semantikCheckStart(syntaxTree);

        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(typedProgram);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode);
        Class c = loader.findClass("Empty");
        var methods = c.getMethods();
        var c2 = c.getConstructors();
        var obj = c.newInstance();
        var methodInstance = c.getDeclaredMethod("Method");

        var res = (int)methodInstance.invoke(obj);

        Assertions.assertEquals(50,res);

    }
    @org.junit.jupiter.api.Test
    public void AssignAttribute() throws Exception
    {
        String src = "class Empty { public int i; public void Method() { i=50;} }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        TypedProgram typedProgram = new SemantikCheckImpl().semantikCheckStart(syntaxTree);

        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(typedProgram);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode);
        Class c = loader.findClass("Empty");
        var methods = c.getMethods();
        var c2 = c.getConstructors();
        var obj = c.newInstance();
        var methodInstance = c.getDeclaredMethod("Method");

        methodInstance.invoke(obj);

        Assertions.assertEquals(50,c.getDeclaredField("i").getInt(obj));

    }
    @org.junit.jupiter.api.Test
    public void AccessObjectMethod() throws Exception
    {
        String src = "class Empty { public int Method() { A a; a = new A(); return a.Foo(); } } class A{ public A() {} public int Foo(){return 4;}}}";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        TypedProgram typedProgram = new SemantikCheckImpl().semantikCheckStart(syntaxTree);

        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(typedProgram);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode);
        Class c = loader.findClass("Empty");
        var methods = c.getMethods();
        var c2 = c.getConstructors();
        var obj = c.newInstance();
        var methodInstance = c.getDeclaredMethod("Method");

        var res =(int)methodInstance.invoke(obj);

        Assertions.assertEquals(4,res);
    }

    @org.junit.jupiter.api.Test
    public void InstantiateClass() throws Exception
    {
       String src = "class Empty { public A Method() { return new A(); } }class A{ public A() {}}";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        TypedProgram typedProgram = new SemantikCheckImpl().semantikCheckStart(syntaxTree);

        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(typedProgram);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode);
        Class c = loader.findClass("Empty");
        var methods = c.getMethods();
        var c2 = c.getConstructors();
        var obj = c.newInstance();
        var methodInstance = c.getDeclaredMethod("Method");

        var res =methodInstance.invoke(obj);

        Assertions.assertEquals("A",res.getClass().getName());
    }

    @org.junit.jupiter.api.Test
    public void NestedExpression() throws Exception
    {
        String src = "class Empty { public int A() { return 5; } public int Method(int x, int y, int z) { return x+y+z+A();} }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        TypedProgram typedProgram = new SemantikCheckImpl().semantikCheckStart(syntaxTree);

        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(typedProgram);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode);
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
    public void SimpleExpression() throws Exception
    {
        String src = "class Empty { public int Method(int x, int y, int z) { return x+y+z;} }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        TypedProgram typedProgram = new SemantikCheckImpl().semantikCheckStart(syntaxTree);

        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(typedProgram);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode);
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
