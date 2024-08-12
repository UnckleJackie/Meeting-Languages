package StructuresAndAlgoritmes_Lafore.Head_04.Stack;

import StructuresAndAlgoritmes_Lafore.Head_04.Stack.BracketChecker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketsApp {
    public static void main(String[] args) throws IOException {
        String input;
        while (true) {
            System.out.println("Enter string containing delimiters: ");
            System.out.flush();
            input = getString();
            if (input.equals(""))
                break;
            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check();
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
