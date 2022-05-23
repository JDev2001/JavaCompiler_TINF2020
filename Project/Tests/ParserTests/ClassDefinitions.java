package ParserTests;

import Parser.DataClasses.Common.AccessModifiers;
import Parser.DataClasses.Common.Program;
import Parser.DataClasses.Field.Field;
import Parser.DataClasses.Types.BoolType;
import Parser.DataClasses.Types.CharType;
import Parser.DataClasses.Types.CustomType;
import Parser.DataClasses.Types.IntType;
import Parser.Factory.SyntaxTreeGenerator;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Parser.DataClasses.Common.Class;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ClassDefinitions
{

    @Test
    public void EmptyClass() throws IOException
    {

        String src = "class Empty {}";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));
        var emptyClass = syntaxTree.classes().get(0);

        Assertions.assertEquals(emptyClass, new Class("Empty",new ArrayList<>(),new ArrayList<>(),new ArrayList<>()));
    }

    @Test
    public void ClassWithMixedAttributes() throws IOException {

        String src = "class MyClass { private int i; public boolean j; public Object k; protected char c; }";
        Program syntaxTree = new SyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(src));

        Program expected = new Program(List.of(new Class("MyClass",new ArrayList<>(),new ArrayList<>(),
                List.of(new Field("i", new IntType(), AccessModifiers.Private),
                        new Field("j", new BoolType(), AccessModifiers.Public),
                        new Field("k", new CustomType("Object"), AccessModifiers.Public),
                        new Field("c", new CharType(), AccessModifiers.Protected)
                ))));


        Assertions.assertEquals(syntaxTree, expected);
    }
}
