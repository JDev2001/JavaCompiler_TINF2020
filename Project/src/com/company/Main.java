package com.company;

import Common.Program;
import com.company.common.Factory.Factory;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    /**
     * Main method of the application
     *
     * @param args path of the input java file (./TestFile.java)
     * @throws IOException IO errror if the file does not exist
     */
    public static void main(String[] args) throws IOException {

        //Der Pfad der Input Datei (./TestFile.java) wird als startparameter mitgegeben
        //Ändern unter "Edit Configurations ..."->"Program arguments"

        //Checks if theres only one input argument
        if (args.length != 1) {
            System.out.println("Falsche Eingabeparameter!");
            return;
        }

        //Open input file
        try {
            FileInputStream inputStream = new FileInputStream(args[0]);
        } catch (IOException e) {
            System.out.println("Es ist ein Fehler aufgetreten! Die angegebene Datei kann nicht gefunden werden!");
            System.exit(0);
        }

        //Generates the syntax tree
        System.out.println("Generating the syntax tree!");
        Program syntaxTree = Factory.getFactory().getSyntaxTreeGenerator().getSyntaxTree(new FileInputStream(args[0]));

        System.out.println("Generating the typed syntax tree!");
        //TODO: typed syntax call

        System.out.println("Generating the bytecode");
        //TODO: Bytecode call

        System.out.println("Finished! Outputfile path: [filepath]");
    }
}

