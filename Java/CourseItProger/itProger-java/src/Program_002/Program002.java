package Program_002;

import java.util.Scanner;
public class Program002 {

    public static void main (String[] args) {

        System.out.println("\n=====Getting Data from users!=======\n" +
                "\nFor getting data from user we need method Scanner(), but before we shoud import java.util.Scanner;\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("\tEnter your name: ");
        String username = scan.nextLine();
        System.out.println("Hi, chap! Okey! Your name is " + username);
        //scan.nextLine();

        System.out.print("\tHow old are you, dude: ");
        byte age = scan.nextByte();
        System.out.println(username + "! Homie! Are you really " + age + " years old? Christ!!!");

        System.out.print("\tHow much money you have: ");
        int usermoney = scan.nextInt();
        System.out.println("Man! It's too low. I need much, much more money... But I'm appreciated to you!");

        System.out.print("\tWell... " + username + ", can you give me this money: ");
        boolean givemoney = scan.nextBoolean();
        System.out.print("Great!..");

    }
}
