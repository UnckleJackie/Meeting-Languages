package head_13.program_094;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        if (args.length != 2) {
            System.out.println("Using: CopyFile resource-file target-file");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch(IOException e) {
            System.out.println("Input-output ERROR: " + e);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch(IOException e2) {
                System.out.println("Closing resource-file ERROR");
            }
            try {
                if (fout != null) fout.close();
            } catch(IOException e2) {
                System.out.println("Closing target-file ERROR");
            }
        }
    }
}
