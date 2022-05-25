package CodeGenTests;

import CodeGenerator.BytecodeGenerator;
import Helper.ReflectLoader;
import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Types.BoolType;
import Parser.DataClasses.Types.IMethodType;
import Parser.DataClasses.Types.IntType;
import SemanticCheck.TypedDataClasses.typedCommon.TypedBlock;
import SemanticCheck.TypedDataClasses.typedCommon.TypedClass;
import SemanticCheck.TypedDataClasses.typedCommon.TypedProgram;
import SemanticCheck.TypedDataClasses.typedExpressions.ITypedExpression;
import SemanticCheck.TypedDataClasses.typedExpressions.TypedBinaryExpression;
import SemanticCheck.TypedDataClasses.typedExpressions.TypedConstExpression;
import SemanticCheck.TypedDataClasses.typedExpressions.TypedUnaryExpression;
import SemanticCheck.TypedDataClasses.typedMethod.TypedMethod;
import SemanticCheck.TypedDataClasses.typedStatements.TypedReturnStatement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class TestExpressions
{
    @Test
    public void TestGreaterEQExpr() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    {
        String classIdentifier = "TestIdentifier";
        var binaryExpression = new TypedBinaryExpression(new TypedConstExpression(8, new IntType()),
                new TypedConstExpression(8,new IntType()),">=", new BoolType());
        TypedProgram prog = getTypedProgram(classIdentifier, binaryExpression, new BoolType());
        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(prog);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode.get(classIdentifier));
        Class c = loader.findClass(classIdentifier);
        var methods = c.getMethods();
        var c2 = c.getConstructors();
        var obj = c.newInstance();
        var methodInstance = c.getDeclaredMethod("Method");

        var res =(boolean)methodInstance.invoke(obj);

        Assertions.assertEquals(true,res);

    }

    @Test
    public void TestLesserEQExpr() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    {
        String classIdentifier = "TestIdentifier";
        var binaryExpression = new TypedBinaryExpression(new TypedConstExpression(8, new IntType()),
                new TypedConstExpression(8,new IntType()),"<=", new BoolType());
        TypedProgram prog = getTypedProgram(classIdentifier, binaryExpression, new BoolType());
        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(prog);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode.get(classIdentifier));
        Class c = loader.findClass(classIdentifier);
        var methods = c.getMethods();
        var c2 = c.getConstructors();
        var obj = c.newInstance();
        var methodInstance = c.getDeclaredMethod("Method");

        var res =(boolean)methodInstance.invoke(obj);

        Assertions.assertEquals(true,res);

    }
    @Test
    public void TestLesserThanExpr() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    {
        String classIdentifier = "TestIdentifier";
        var binaryExpression = new TypedBinaryExpression(new TypedConstExpression(8, new IntType()),
                new TypedConstExpression(4,new IntType()),"<", new BoolType());
        TypedProgram prog = getTypedProgram(classIdentifier, binaryExpression, new BoolType());
        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(prog);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode.get(classIdentifier));
        Class c = loader.findClass(classIdentifier);
        var methods = c.getMethods();
        var c2 = c.getConstructors();
        var obj = c.newInstance();
        var methodInstance = c.getDeclaredMethod("Method");

        var res =(boolean)methodInstance.invoke(obj);

        Assertions.assertEquals(false,res);

    }
    @Test
    public void TestGreaterExpr() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    {
        String classIdentifier = "TestIdentifier";
        var binaryExpression = new TypedBinaryExpression(new TypedConstExpression(8, new IntType()),
                new TypedConstExpression(4,new IntType()),">", new BoolType());
        TypedProgram prog = getTypedProgram(classIdentifier, binaryExpression, new BoolType());
        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(prog);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode.get(classIdentifier));
        Class c = loader.findClass(classIdentifier);
        var methods = c.getMethods();
        var c2 = c.getConstructors();
        var obj = c.newInstance();
        var methodInstance = c.getDeclaredMethod("Method");

        var res =(boolean)methodInstance.invoke(obj);

        Assertions.assertEquals(true,res);

    }

    @Test
    public void TestSimpleNotExpr() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    {
        String classIdentifier = "TestIdentifier";
        var unaryExpr = new TypedUnaryExpression(new TypedConstExpression(false, new BoolType()),"!", new BoolType());
        TypedProgram prog = getTypedProgram(classIdentifier, unaryExpr, new BoolType());
        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(prog);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode.get(classIdentifier));
        Class c = loader.findClass(classIdentifier);
        var methods = c.getMethods();
        var c2 = c.getConstructors();
        var obj = c.newInstance();
        var methodInstance = c.getDeclaredMethod("Method");

        var res =(boolean)methodInstance.invoke(obj);

        Assertions.assertEquals(true,res);

    }

    @Test
    public void TestSimpleAndExpr() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    {
        String classIdentifier = "TestIdentifier";
        var binaryExpression = new TypedBinaryExpression(new TypedConstExpression(false, new BoolType()), new TypedConstExpression(false,new BoolType()),"&", new BoolType());
        TypedProgram prog = getTypedProgram(classIdentifier, binaryExpression, new BoolType());
        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(prog);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode.get(classIdentifier));
        Class c = loader.findClass(classIdentifier);
        var methods = c.getMethods();
        var c2 = c.getConstructors();
        var obj = c.newInstance();
        var methodInstance = c.getDeclaredMethod("Method");

        var res =(boolean)methodInstance.invoke(obj);

        Assertions.assertEquals(false,res);

    }
    @Test
    public void TestSimpleOrExpr() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    {
        String classIdentifier = "TestIdentifier";
        var binaryExpression = new TypedBinaryExpression(new TypedConstExpression(false, new BoolType()), new TypedConstExpression(true,new BoolType()),"|", new BoolType());
        TypedProgram prog = getTypedProgram(classIdentifier, binaryExpression, new BoolType());
        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(prog);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode.get(classIdentifier));
        Class c = loader.findClass(classIdentifier);
        var methods = c.getMethods();
        var c2 = c.getConstructors();
        var obj = c.newInstance();
        var methodInstance = c.getDeclaredMethod("Method");

        var res =(boolean)methodInstance.invoke(obj);

        Assertions.assertEquals(true,res);

    }


    @Test
    public void TestSimpleDivExpr() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    {
        String classIdentifier = "TestIdentifier";
        var binaryExpression = new TypedBinaryExpression(new TypedConstExpression(8, new IntType()), new TypedConstExpression(4,new IntType()),"/", new IntType());
        TypedProgram prog = getTypedProgram(classIdentifier, binaryExpression, new IntType());
        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(prog);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode.get(classIdentifier));
        Class c = loader.findClass(classIdentifier);
        var methods = c.getMethods();
        var c2 = c.getConstructors();
        var obj = c.newInstance();
        var methodInstance = c.getDeclaredMethod("Method");

        var res =(int)methodInstance.invoke(obj);

        Assertions.assertEquals(2,res);

    }

    @Test
    public void TestSimpleMulExpr() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    {
        String classIdentifier = "TestIdentifier";
        var binaryExpression = new TypedBinaryExpression(new TypedConstExpression(5, new IntType()), new TypedConstExpression(3,new IntType()),"*", new IntType());
        TypedProgram prog = getTypedProgram(classIdentifier, binaryExpression, new IntType());
        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(prog);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode.get(classIdentifier));
        Class c = loader.findClass(classIdentifier);
        var methods = c.getMethods();
        var c2 = c.getConstructors();
        var obj = c.newInstance();
        var methodInstance = c.getDeclaredMethod("Method");

        var res =(int)methodInstance.invoke(obj);

        Assertions.assertEquals(15,res);

    }

    @Test
    public void TestSimpleAddExpr() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    {
        String classIdentifier = "TestIdentifier";
        var binaryExpression = new TypedBinaryExpression(new TypedConstExpression(5, new IntType()), new TypedConstExpression(3,new IntType()),"+", new IntType());
        TypedProgram prog = getTypedProgram(classIdentifier, binaryExpression, new IntType());
        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(prog);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode.get(classIdentifier));
        Class c = loader.findClass(classIdentifier);
        var methods = c.getMethods();
        var c2 = c.getConstructors();
        var obj = c.newInstance();
        var methodInstance = c.getDeclaredMethod("Method");

        var res =(int)methodInstance.invoke(obj);

        Assertions.assertEquals(8,res);

    }
    @Test
    public void TestSimpleMinusExpr() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    {
        String classIdentifier = "TestIdentifier";
        var binaryExpression = new TypedBinaryExpression(new TypedConstExpression(5, new IntType()), new TypedConstExpression(3,new IntType()),"-", new IntType());
        TypedProgram prog = getTypedProgram(classIdentifier, binaryExpression, new IntType());
        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(prog);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode.get(classIdentifier));
        Class c = loader.findClass(classIdentifier);
        var methods = c.getMethods();
        var c2 = c.getConstructors();
        var obj = c.newInstance();
        var methodInstance = c.getDeclaredMethod("Method");

        var res =(int)methodInstance.invoke(obj);

        Assertions.assertEquals(2,res);

    }

    private TypedProgram getTypedProgram(String classIdentifier, ITypedExpression binaryExpression, IMethodType type)
    {
        var block = new TypedBlock(List.of(new TypedReturnStatement(binaryExpression,type)), type);
        var method =  new TypedMethod(AccessModifiers.Public,"Method",new ArrayList<>(),type,block,type);
        var prog = new TypedProgram(List.of(new TypedClass(classIdentifier,  new ArrayList<>(),List.of(method), new ArrayList<>())));
        return prog;
    }
}
