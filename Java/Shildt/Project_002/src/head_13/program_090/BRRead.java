package head_13.program_090;

import java.io.*;

public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in, System.console().charset()));
        System.out.println("Enter characters; for escape enter q.");
        // Read symbols
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
