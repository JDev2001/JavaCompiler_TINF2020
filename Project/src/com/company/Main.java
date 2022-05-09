package com.company;

import Common.Program;
import com.company.common.Factory.Factory;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

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

        try (var files = new SequenceInputStream(Collections.enumeration(inputFiles))) {

            //Generates the syntax tree
            System.out.println("Generating the syntax tree!");
            Program syntaxTree = Factory.getFactory().getSyntaxTreeGenerator().getSyntaxTree(files);

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
    }
}

