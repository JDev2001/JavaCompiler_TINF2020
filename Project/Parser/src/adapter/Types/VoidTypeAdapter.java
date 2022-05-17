package adapter.Types;

import Common.AccessModifiers;
import Types.IType;
import Types.VoidType;
import generated.antlrGrammarParser;

public class VoidTypeAdapter {


    public static VoidType generate() {

            return new VoidType();
        }
}
