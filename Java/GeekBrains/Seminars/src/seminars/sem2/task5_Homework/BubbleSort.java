package seminars.sem2.task5_Homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {
        int n = mas.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                    swapped = true;
                }
            }
            writeLog(mas);
            if (!swapped)
                break;
        }

    }

    public static void writeLog(int[] mas) {
        File log = new File("log.txt");
        try {
            FileWriter fileWriter = new FileWriter("log.txt", true);
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            String formattedDateTime = now.format(dtf);

            fileWriter.write(formattedDateTime + " " + arrayToString(mas) + "n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String arrayToString(int[] mas) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < mas.length; i++) {
            sb.append(mas[i]);
            if (i != mas.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
