package Parser.adapter.GeneralAdapter;

import Parser.DataClasses.Common.AccessModifiers;
import org.antlr.v4.runtime.tree.TerminalNode;

public class AccessModifierAdapter {

    public static AccessModifiers generate(TerminalNode accessModifier) {

        //get the right accessmodifier -> see Enum AccessModifiers
        if(accessModifier==null||accessModifier.getText()==null) return AccessModifiers.Private;
        return switch (accessModifier.getText())
                {
                    case "public" -> AccessModifiers.Public;
                    case "private" -> AccessModifiers.Private;
                    default -> AccessModifiers.Protected;
                };
    }


}
