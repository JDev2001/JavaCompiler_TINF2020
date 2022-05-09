package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {


        if (args.length != 1) {
            System.out.println("Falsche Eingabeparameter!");
            return;
        }
        var mainInput = new ArrayList<FileInputStream>()
        {{
            for (var fileName : args) {
                add(new FileInputStream(fileName));
            }
        }};

        try (var files = new SequenceInputStream(Collections.enumeration(mainInput))) {
            System.out.println("Starting generation of Syntax Tree.");
            //Hier folgt die Implementierung der einzelen Schritte
        }
        }
 }

