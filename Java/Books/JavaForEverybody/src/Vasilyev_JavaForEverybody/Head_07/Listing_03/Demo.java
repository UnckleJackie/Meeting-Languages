package Vasilyev_JavaForEverybody.Head_07.Listing_03;

public class Demo {
    public static void main(String[] args) {
        Alpha A;
        Bravo B;
        MyClass obj = new MyClass();
        A = obj;
        B = obj;
        A.apply(100);
        B.set(200);
        obj.show();
    }
}
