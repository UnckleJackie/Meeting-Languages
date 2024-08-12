package Vasilyev_JavaForEverybody.Head_05.Listing_05;

public class Demo {
    static MyClass create(int n) {
        MyClass tmp = new MyClass(n);
        return tmp;
    }
    public static void main(String[] args) {
        MyClass A = new MyClass(100);
        MyClass B = new MyClass(A);
        MyClass C = create(200);
        MyClass D = A.get(C);
        A.code--;
        A.show();
        B.show();
        C.show();
        D.show();
    }
}
