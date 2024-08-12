package Vasilyev_JavaForEverybody.Head_11.Listing_07;

public class Demo {
    public static void main(String[] args) {
        MyClass<Integer> A = new MyClass<>();
        MyClass B = A;
        A.value = 100;
        A.show();
        B.show();
        A.value++;
        A.show();
        B.value = "This is the TEXT!";
        B.show();
        A.show();
    }
}
