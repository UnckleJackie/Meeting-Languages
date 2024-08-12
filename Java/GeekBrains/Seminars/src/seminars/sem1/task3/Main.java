package seminars.sem1.task3;

import java.util.Scanner;

// Дана строка. Поменять местами ее половины
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = str.substring(0, str.length() / 3);
        System.out.println(str1);
        String str2 = str.substring((str.length() / 3), str.length() / 3 * 2);
        System.out.println(str2);
        String str3 = str.substring((str.length() / 3 * 2 + 1), str.length());
        System.out.println(str3);
        System.out.println(str3 + str2 + str1);
    }
}
