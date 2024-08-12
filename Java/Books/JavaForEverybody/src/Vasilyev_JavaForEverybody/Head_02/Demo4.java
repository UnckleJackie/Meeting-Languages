package Vasilyev_JavaForEverybody.Head_02;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, txt;
        System.out.print("Enter name: ");
        name = input.nextLine();
        switch(name) {
            case "Matroskin":
                txt = "This is the cat " + name + "!";
                break;
            case "Ball":
                txt = "This is the dog " + name + "!";
                break;
            case "Fedor":
                txt = "This is the Uncle " + name + "!";
                break;
            default:
                txt = "This is unknown person!";
        }
        System.out.println(txt);
    }
}
