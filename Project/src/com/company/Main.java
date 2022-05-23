package com.company;

import Parser.DataClasses.Common.Program;
import SemanticCheck.TypedDataClasses.typedCommon.TypedProgram;
import com.company.common.Factory.Factory;
import org.antlr.v4.runtime.CharStreams;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    //Global Debuging Flas -> For more/less debugging infos turn true/false
    public static boolean debugFlag = true;

    /**
     * Main method of the application
     *
     * @param args path of the input java file (./EmptyClass.java)
     * @throws IOException IO errror if the file does not exist
     */
    public static void main(String[] args) throws Exception {

        //Der Pfad der Input Datei (./EmptyClass.java) wird als startparameter mitgegeben
        //Ändern unter "Edit Configurations ..."->"Program arguments"

        if (args.length != 1) {
            System.out.println("Falsche Eingabeparameter!");
            return;
        }

        /*
        //Für mehrere Files in den args
        //Itterates over the input files an create an inputstream for each
        var inputFiles = new ArrayList<FileInputStream>() {{
            for (var filePath : args) {
                add(new FileInputStream(filePath));
            }
        }};
         */

        //Generates the syntax tree
        System.out.println("Generating the syntax tree!");
        Program syntaxTree = Factory.getFactory().getSyntaxTreeGenerator().getSyntaxTree(CharStreams.fromStream(new FileInputStream(args[0])));

        //Generates Semantik check
        System.out.println("Generating the typed syntax tree!");
        TypedProgram typedSyntaxTree = Factory.getFactory().getSemantikCheck().semantikCheckStart(syntaxTree);

        //Generates Byte code
        System.out.println("Generating the bytecode");
        HashMap<String, byte[]> res = Factory.getFactory().getCodeGenerator().getCode(typedSyntaxTree);

        //Writes Bytecode to File
        for(Map.Entry<String, byte[]> entry : res.entrySet()) {
            String key = entry.getKey();
            byte[] value = entry.getValue();

            //Generate output File
            try {
                File outputFile = new File(TransformFilename(args[0]));
                if(debugFlag) {
                    if (outputFile.createNewFile()) {
                        System.out.println("File created: " + outputFile.getName());
                    } else {

                        System.out.println("File already exists.");
                    }
                }

                //Write Bytecode to File
                FileOutputStream outputStream = new FileOutputStream(outputFile);
                outputStream.write(value);

            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

            //Debugging output
            if(debugFlag) {
                System.out.println("Key: \n" + key);
                System.out.println("Value: \n" + Arrays.toString(value));
            }
        }

        System.out.println("Finished! Outputfile path: " + TransformFilename(args[0]));
    }

    //TestClass.java -> TestClass.class
    public static String TransformFilename(String input){
        return input.substring(0, input.length() - 5) + ".class";
    }
}

