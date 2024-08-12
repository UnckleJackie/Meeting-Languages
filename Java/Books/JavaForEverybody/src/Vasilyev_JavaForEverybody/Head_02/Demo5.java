package Vasilyev_JavaForEverybody.Head_02;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, txt;
        System.out.print("Enter name: ");
        name = input.nextLine();
        switch (name) {
            case "Matroskin":
            case "Barsik":
                txt = "This is the cat " + name + "!";
                break;
            case "Ball":
            case "Tuzik":
            case "Bobby":
                txt = "This is the dog " + name + "!";
                break;
            case "Fedor":
            case "Vasily":
                txt = "This is Uncle " + name + "!";
                break;
            default:
                txt = "We don't know who da fuck is this!";
        }
        System.out.println(txt);
    }
}
