package head_13.program_090;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in, System.console().charset()));

        String str;
        System.out.println("Enter the strings of text");
        System.out.println("For escape enter stop");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
