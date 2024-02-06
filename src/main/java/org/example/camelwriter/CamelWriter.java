package org.example.camelwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

public class CamelWriter {

    private final File inFile;

    public CamelWriter(String fName) {
        this.inFile = new File(fName);
    }

    public void readLines() {
        Scanner scan = null;
        try {
            scan = new Scanner(inFile);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                convert2camel(line);
            }

            scan.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found:" + ex.getMessage());
        }
    }

    private void convert2camel(String line) {
        line = line.toLowerCase();
        String[] words = line.split(" ");

        StringBuilder camelLine = Optional.ofNullable(words[0]).map(StringBuilder::new).orElse(null);
        for (int i = 1; i < words.length; i++) {
            camelLine = (camelLine == null ? new StringBuilder("null") : camelLine).append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1));
        }
        System.out.println(camelLine);
        printToFile(camelLine == null ? null : camelLine.toString());
    }

    private void printToFile(String line) {
        File f = new File("CamelOut.txt");
        try (FileWriter fw = new FileWriter(f, true)) {
            fw.append(line);
            fw.append("\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}