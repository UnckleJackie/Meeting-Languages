package head_13.program_092;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        if (args.length != 1) {
            System.out.println("Using: ShowFile name-file");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
        } catch(FileNotFoundException e) {
            System.out.println("Cannot open file");
            return;
        }
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch(IOException e) {
            System.out.println("Reading file ERROR");
        }
        try {
            fin.close();
        } catch(IOException e) {
            System.out.println("Closing file ERROR");
        }
    }
}
