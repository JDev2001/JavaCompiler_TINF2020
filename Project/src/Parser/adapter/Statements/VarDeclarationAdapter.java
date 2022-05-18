package Parser.adapter.Statements;

import Parser.adapter.Types.TypeAdapter;
import DataClasses.Statements.IStatement;
import DataClasses.Statements.VarDeclarationStatement;
import Parser.generated.antlrGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class VarDeclarationAdapter {

    public static IStatement generate(antlrGrammarParser.VarDeclarationContext ctx) {

        List<IStatement> statements = new ArrayList<>();


        ctx.Identifier().forEach(identifier -> statements.add(new VarDeclarationStatement(identifier.getText(), TypeAdapter.generate(ctx.type()))));

        //return new VarDeclarationStatement(ctx.Identifier().g, )
        return null;
    }
}
