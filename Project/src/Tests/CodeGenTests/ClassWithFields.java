package CodeGenTests;


import Helper.ReflectLoader;
import CodeGenerator.BytecodeGenerator;
import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Class;
import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Field.Field;
import Parser.DataClasses.Types.BoolType;
import Parser.DataClasses.Types.IntType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class ClassWithFields
{
    @Test
    public void Test() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException
    {
        String identifier = "TestIdentifier";
        var prog = new Program(List.of(new Class(identifier, new ArrayList<>(),new ArrayList<>(),
                List.of(new Field("i", new IntType(), AccessModifiers.Public),new Field("j", new BoolType(), AccessModifiers.Private)))));
        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(prog);
        var byteCode = bytecodeGenerator.genCode();
        ReflectLoader loader = new ReflectLoader(byteCode.get(identifier));
        java.lang.Class c = loader.findClass(identifier);
        var name = c.getName();
        var fieldI = c.getDeclaredField("i");
        var fieldJ = c.getDeclaredField("j");
        Assertions.assertEquals(identifier,name);
        Assertions.assertEquals(int.class,fieldI.getType());
        Assertions.assertEquals(boolean.class,fieldJ.getType());
    }
}



