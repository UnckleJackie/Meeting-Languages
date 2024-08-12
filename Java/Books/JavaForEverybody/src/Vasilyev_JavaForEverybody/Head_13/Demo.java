package Vasilyev_JavaForEverybody.Head_13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        int a;
        System.out.println("Graphics file coping");
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\anech\\OneDrive\\Pictures\\red_panda.jpg");
            FileInputStream fin = new FileInputStream("C:\\Users\\anech\\OneDrive\\Pictures\\animal.jpg");
            a = fin.read();
            while (a != -1) {
                fout.write(a);
                a = fin.read();
            }
            fout.close();
            fin.close();
            System.out.println("File copied");
        } catch (IOException e) {
            System.out.println("Input/Output ERROR!" + e);
        }
    }
}
