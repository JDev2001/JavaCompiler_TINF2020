package com.company;

import Common.Program;
import com.company.common.Factory.Factory;
import org.antlr.v4.runtime.CharStreams;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    /**
     * Main method of the application
     *
     * @param args path of the input java file (./EmptyClass.java)
     * @throws IOException IO errror if the file does not exist
     */
    public static void main(String[] args) throws IOException {

        //Der Pfad der Input Datei (./EmptyClass.java) wird als startparameter mitgegeben
        //Ändern unter "Edit Configurations ..."->"Program arguments"
        /*
        if (args.length == 0) {
            System.out.println("Falsche Eingabeparameter!");
            return;
        }

        //Itterates over the input files an create an inputstream for each
        var inputFiles = new ArrayList<FileInputStream>() {{
            for (var filePath : args) {
                add(new FileInputStream(filePath));
            }
        }};

         */


        String str = "class Main {}";

        System.out.println("Generating the syntax tree!");
        Program syntaxTree = Factory.getFactory().getSyntaxTreeGenerator().getSyntaxTree(CharStreams.fromString(str));




        /*
        try (var files = new SequenceInputStream(Collections.enumeration(inputFiles))) {

            //Generates the syntax tree
            System.out.println("Generating the syntax tree!");
            Program syntaxTree = Factory.getFactory().getSyntaxTreeGenerator().getSyntaxTree();

            System.out.println("Generating the typed syntax tree!");
            //TODO: typed syntax call

            System.out.println("Generating the bytecode");
            //TODO: Bytecode call

            System.out.println("Finished! Outputfile path: [filepath]");

        } catch (Exception e) {
            System.out.println("Es ist ein Fehler aufgetreten! UEberpruefen sie die Angabe der .java Datei!");
            System.out.println(e);
            System.exit(0);
        }

         */
    }
}

