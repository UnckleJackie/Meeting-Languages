package Program_002_Date_and_Time;
import java.io.*;
import java.math.*;
import  java.security.*;
import java.text.*;
import java.util.*;

class Result {
    public static String findDay(int month, int day, int year) {
        System.out.println("Day of the week");
        return null;
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);
        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
