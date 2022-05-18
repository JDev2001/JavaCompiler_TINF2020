package Parser.adapter.GeneralAdapter;

import Parser.DataClasses.Common.AccessModifiers;
import org.antlr.v4.runtime.tree.TerminalNode;

public class AccessModifierAdapter {

    public static AccessModifiers generate(TerminalNode accessModifier) {

        //get the right accessmodifier -> see Enum AccessModifiers
        switch (accessModifier.getText()){
            case "public":
                return AccessModifiers.Public;
            case "private":
                return AccessModifiers.Private;
            default:
                return AccessModifiers.Protected;
        }
    }


}
