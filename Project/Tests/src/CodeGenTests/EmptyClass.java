package CodeGenTests;

import BytecodeGenerator.BytecodeGenerator;
import Common.Program;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class EmptyClass
{
    @Test
    public void Test()
    {
        var prog = new Program(new ArrayList<>());
        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(prog);
    }
}
