package Vasilyev_JavaForEverybody.Head_13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static javax.swing.JOptionPane.showInputDialog;

public class Demo3 {
    public static void main(String[] args) {
        String file = "personal.txt";
        String name;
        String s;
        try {
            BufferedReader br = new BufferedReader(new FileReader(
                    "C:\\Users\\anech\\OneDrive\\Desktop\\Meeting_Languages\\Java\\" +
                            "Books\\JavaForEverybody\\src\\Vasilyev_JavaForEverybody\\" + file));
            name = showInputDialog("Set account name: ");
            if (name == null || name.equals("")) System.exit(0);
            while (true) {
                s = br.readLine();
                try {
                    if (s.equalsIgnoreCase(name)) {
                        System.out.println("Surname: " + s);
                        System.out.println("Name: " + br.readLine());
                        System.out.println("Second name: " + br.readLine());
                        System.out.println("Age: " + br.readLine());
                        System.out.println("Phone number: " + br.readLine());
                        break;
                    }
                } catch (NullPointerException e) {
                    System.out.println("There's no this account!");
                    break;
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Input/Output ERROR!");
        }
    }
}
