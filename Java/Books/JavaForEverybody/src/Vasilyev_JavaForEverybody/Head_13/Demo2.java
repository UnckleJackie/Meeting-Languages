package Vasilyev_JavaForEverybody.Head_13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) {
        int a;
        System.out.println("Coping file begins");
        try {
            FileWriter fout = new FileWriter(
                    "C:\\Users\\anech\\OneDrive\\Desktop\\Meeting_Languages\\" +
                            "Java\\Books\\JavaForEverybody\\src\\Vasilyev_JavaForEverybody\\mydata.txt");
            FileReader fin = new FileReader(
                    "C:\\Users\\anech\\OneDrive\\Desktop\\Meeting_Languages\\Java\\" +
                            "Books\\JavaForEverybody\\src\\Vasilyev_JavaForEverybody\\base.txt"
            );
            a = fin.read();
            while (a != -1) {
                if (a == (int) ' ') a = (int) '_';
                fout.write((char) a);
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
