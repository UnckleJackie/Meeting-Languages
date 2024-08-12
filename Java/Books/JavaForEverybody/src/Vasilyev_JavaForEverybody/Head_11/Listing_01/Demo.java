package Vasilyev_JavaForEverybody.Head_11.Listing_01;

public class Demo {
    static <T> void show(T[] a) {
        for (int k = 0; k < a.length; k++) {
            System.out.print("|" + a[k]);
        }
        System.out.println("|");
    }

    static <T> String getText(T a, int n) {
        String res = n + ": ";
        res += a;
        return res;
    }

    static <T, U> T getArg(T x, T y, U z) {
        int val = z.toString().length();
        if (val % 2 == 0) return x;
        else return y;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 3, 5, 7, 9, 11, 13};
        Character[] symbs = {'A', 'B', 'C', 'D'};
        String[] txt = {"Alpha", "Bravo", "Charlie"};
        show(nums);
        show(symbs);
        show(txt);
        System.out.println(getText('A', 1));
        System.out.println(getText("Alpha", 2));
        System.out.println(getText(100, 3));
        MyClass obj = new MyClass(200);
        System.out.println(getText(obj, 4));
        String A = getArg("Alpha", "Bravo", obj);
        MyClass B = getArg(new MyClass(300), new MyClass(400), 1234);
        Integer C = getArg(123, 321, "Hello");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
    }
}
