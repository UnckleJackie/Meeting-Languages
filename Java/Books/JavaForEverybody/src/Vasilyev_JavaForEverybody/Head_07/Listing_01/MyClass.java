package Vasilyev_JavaForEverybody.Head_07.Listing_01;

public class MyClass implements Alpha {
    private int code;

    public void set(int n) {
        if (n >= 0) code = n;
        else code = -n;
        System.out.println("Number: " + code);
    }

    public String get() {
        String res = " | ";
        int num = code;
        do {
            res = " | " + (num % NUMBER) + res;
            num /= NUMBER;
        } while (num > 0);
        return res;
    }
}
