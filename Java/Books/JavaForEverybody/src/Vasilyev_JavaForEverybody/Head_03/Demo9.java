package Vasilyev_JavaForEverybody.Head_03;

import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Text for coding: ");
        String text = input.nextLine();
        char[] symbs = text.toCharArray();
        for (int k = 0; k < symbs.length; k++) {
            symbs[k] = (char)(symbs[k] + k + 1);
        }
        text = new String(symbs);
        System.out.println("After coding: ");
        System.out.println(text);
        symbs = text.toCharArray();
        for (int k = 0; k < symbs.length; k++) {
            symbs[k] = (char)(symbs[k] - k - 1);
        }
        text = new String(symbs);
        System.out.println("After decoding: ");
        System.out.println(text);
    }
}
