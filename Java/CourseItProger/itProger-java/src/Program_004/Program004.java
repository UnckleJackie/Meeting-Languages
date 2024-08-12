package Program_004;

import java.util.*;
public class Program004 {
    public static void main (String[] args) {
        System.out.println("\n============IF ELSE============\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your role: ");

        String role = scanner.nextLine();
        System.out.print("Password: ");
        String pass = scanner.nextLine();

        if (role.equals("Admin") && pass.equals("12345")) {
            System.out.print("All users\n");

        } else {
            System.out.print("Hey, bro! What's your name: ");
            String name = scanner.nextLine();
            System.out.println("Ok, " + name + ", sit to that coach, please...");
        }
    }
}
