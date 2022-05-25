package CodeGenTests;

import CodeGenerator.BytecodeGenerator;
import Helper.ReflectLoader;
import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Block;
import Parser.DataClasses.Field.Field;
import Parser.DataClasses.Types.BoolType;
import Parser.DataClasses.Types.IntType;
import Parser.DataClasses.Types.VoidType;
import SemanticCheck.TypedDataClasses.typedCommon.TypedBlock;
import SemanticCheck.TypedDataClasses.typedCommon.TypedClass;
import SemanticCheck.TypedDataClasses.typedCommon.TypedProgram;
import SemanticCheck.TypedDataClasses.typedMethod.TypedMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class ClassWithMethods
{
    @Test
    public void Test() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException
    {
        String identifier = "TestIdentifier";
        var methods = List.of(
          new TypedMethod(AccessModifiers.Public, "A",new ArrayList<>(), new VoidType(), new TypedBlock(new ArrayList<>(), new VoidType()), new VoidType())
      //  ,  new TypedMethod(AccessModifiers.Public, "B",new ArrayList<>(), new VoidType(), new TypedBlock(new ArrayList<>(), new VoidType()), new VoidType()),
      //    new TypedMethod(AccessModifiers.Public, "C",new ArrayList<>(), new VoidType(), new TypedBlock(new ArrayList<>(), new VoidType()), new VoidType())
        );
        var prog = new TypedProgram(List.of(new TypedClass(identifier, new ArrayList<>(), methods, new ArrayList<>())));
        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(prog);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode.get(identifier));
        Class c = loader.findClass(identifier);
        var reflcMethods = c.getMethods();

    }
}
