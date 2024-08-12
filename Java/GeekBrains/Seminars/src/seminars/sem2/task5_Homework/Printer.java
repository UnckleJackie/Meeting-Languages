package seminars.sem2.task5_Homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Printer {
    public static void main(String[] args) {
        int[] arr = {};
        if (args.length == 0) {
            arr = new int[]{9, 4, 8, 3, 1};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.tex"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
