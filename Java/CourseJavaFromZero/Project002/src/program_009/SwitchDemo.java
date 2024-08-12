package program_009;

import java.util.Scanner;

class DayOfTheWeek {
    private static int day;
    private static String DOW;

    static String switchingBetweenTheDays(int day) {
        switch (day) {
            case 1: DOW = "Sunday";
                break;
            case 2: DOW = "Monday";
                break;
            case 3: DOW = "Tuesday";
                break;
            case 4: DOW = "Wednesday";
                break;
            case 5: DOW = "Thursday";
                break;
            case 6: DOW = "Friday";
                break;
            case 7: DOW = "Saturday";
                break;
            default:
                DOW = "Please try again";
        }
        return DOW;
    }
}

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(DayOfTheWeek.switchingBetweenTheDays(scan.nextInt()));
    }
}
