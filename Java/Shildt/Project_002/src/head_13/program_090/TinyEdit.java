package head_13.program_090;
import java.io.*;
public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in, System.console().charset()));
        String[] str = new String[100];
        System.out.println("Enter the strings of text.");
        System.out.println("For escape enter stop.");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("stop")) break;
        }
        System.out.println("\nYou entered: ");
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
    }
}
