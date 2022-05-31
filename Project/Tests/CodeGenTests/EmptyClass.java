package CodeGenTests;


import CodeGenerator.BytecodeGenerator;

import Helper.ReflectLoader;
import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Types.VoidType;
import SemanticCheck.TypedDataClasses.typedCommon.TypedBlock;
import SemanticCheck.TypedDataClasses.typedCommon.TypedClass;
import SemanticCheck.TypedDataClasses.typedCommon.TypedProgram;
import SemanticCheck.TypedDataClasses.typedMethod.TypedMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmptyClass
{
    @Test
    public void Test2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    {
        String identifier = "TestIdentifier";
        var prog = new TypedProgram(List.of(new TypedClass(identifier, List.of(new TypedMethod(AccessModifiers.Public,identifier,new ArrayList<>(),new VoidType(),new TypedBlock(new ArrayList<>(), new VoidType()),new VoidType())),new ArrayList<>(),new ArrayList<>())));
        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(prog);
        var byteCode = bytecodeGenerator.genCode();


        ReflectLoader loader = new ReflectLoader(byteCode.get(identifier));

        java.lang.Class c = loader.findClass(identifier);
        var name = c.getName();
        var constructor = Arrays.stream(c.getConstructors()).findFirst().get();
        var constructorParameterCount = constructor.getParameterCount();
        Assertions.assertEquals(identifier,name);
        Assertions.assertEquals(0,constructorParameterCount);


    }
    @Test
    public void Test() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    {
        String identifier = "TestIdentifier";
        var prog = new TypedProgram(List.of(new TypedClass(identifier, new ArrayList<>(),new ArrayList<>(),new ArrayList<>())));
        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(prog);
        var byteCode = bytecodeGenerator.genCode();


        ReflectLoader loader = new ReflectLoader(byteCode.get(identifier));

        java.lang.Class c = loader.findClass(identifier);
        var name = c.getName();
        var constructor = Arrays.stream(c.getConstructors()).findFirst().get();
        var constructorParameterCount = constructor.getParameterCount();
        Assertions.assertEquals(identifier,name);
        Assertions.assertEquals(0,constructorParameterCount);


    }
}




