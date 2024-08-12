package head_13.program_091;
/* Отображение содержимого текстового файла.
* Для использования программы укажите имя файла, который хотите просмотреть.
* Например, чтобы увидеть содержимое файла по имени TEST.TXT,
* введите следующую командную строку:
* java ShowFile TEST.TXT*/
import java.io.*;
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        // Know that file name was show
        if (args.length != 1) {
            System.out.println("Using: ShowFile file-name");
            return;
        }
        // Try to open file
        try {
            fin = new FileInputStream(args[0]);
        } catch(FileNotFoundException e) {
            System.out.println("Can't open file");
            return;
        }
        // File opened and can be read.
        // Next code reads symbols while encounters EOF
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch(IOException e) {
            System.out.println("Error file reading");
        } finally {
            // Close file after try-block exit
            try {
                fin.close();
            } catch(IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}
