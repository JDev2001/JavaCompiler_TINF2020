package Parser.adapter.Types;

import Parser.DataClasses.Types.*;
import generated.antlrGrammarParser;

public class TypeAdapter {


    public static IType generate(antlrGrammarParser.TypeContext objectType) {

        //'int'|'char'|'boolean'|Identifier;

        switch (objectType.getText()) {
            case "int":
                return new IntType();
            case "char":
                return new CharType();
            case "boolean":
                return new BoolType();
            default:
                return new CustomType(objectType.getText());
        }
    }
}
