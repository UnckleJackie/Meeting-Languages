package seminars.sem1.task6_Homework;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countNTriangle(n));
    }
    public static int countNTriangle(int n) {
        int result = 0;
        if (n < 1) {
            result = -1;
        } else {
            for (int i = 1; i <= n; i++) {
                result += i;
                System.out.println(result);
            }
        }
        return result;
    }
}
