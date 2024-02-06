package org.example.camelwriter;


public class Main {

    public static void main(String[] args) {
        CamelWriter cw = new CamelWriter("C:\\Users\\Rico\\Downloads\\CamelWriterExercise\\DryLips.txt");
        System.out.println();
        cw.readLines();
    }
}