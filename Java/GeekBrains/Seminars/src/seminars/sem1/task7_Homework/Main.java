package seminars.sem1.task7_Homework;

public class Main {
    public static void main(String[] args) {
        printPrimeNums();
    }
    public static void printPrimeNums() {
        int n = 1000;
        boolean b = true;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                //if (i == 2) System.out.println(i);
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(i);
            else b = true;
        }
    }
}
