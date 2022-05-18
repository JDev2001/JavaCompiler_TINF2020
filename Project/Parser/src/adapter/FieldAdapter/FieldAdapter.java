package adapter.FieldAdapter;

import Field.Field;
import adapter.GeneralAdapter.AccessModifierAdapter;
import adapter.Types.TypeAdapter;
import generated.antlrGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class FieldAdapter {

    /**
     *  generates a new Object of the fitting class
     *
     * @param ctx Antlr context
     * @return new Object
     */
    public static List<Field> generate(antlrGrammarParser.FieldDeclarationContext ctx) {

        List<Field> allInnerFields = new ArrayList<>();

        ctx.Identifier().forEach(identifiere ->
                allInnerFields.add(
                    new Field(
                            identifiere.getText(),
                            TypeAdapter.generate(ctx.type()),
                            AccessModifierAdapter.generate(ctx.AccessModifier()))));

        return allInnerFields;
    }



}
