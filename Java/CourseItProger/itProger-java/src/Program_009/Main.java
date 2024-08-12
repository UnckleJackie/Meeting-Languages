package Program_009;

public class Main {
    public static void main(String[] args) {
        // Functions
        info();
        String java = "Java!";
        info1(java);
        info1("Dude!");

        short num = 7;
        summa((short) 5, num);

        short num2 = 8;
        int result = summa2((short) 4, num2);
        info1(String.valueOf(result));
    }

    public static void summa(short a, short b) {
        int res = a + b;
        System.out.println("Result: " + res);
    }

    public static int summa2(short a, short b) {
        int res = a + b;
        String result = "Result: " + res;
        info1(result);
        return res;
    }

    public static void info() {
        System.out.println("Hello");
    }

    public static void info1(String word) {
        System.out.println(word);
    }
}
