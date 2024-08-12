package Vasilyev_JavaForEverybody.Head_04;

public class MyClass6 {
    int number = 0;
    MyClass6 next = this;
    void create(int n) {
        int i;
        MyClass6 A = this;
        MyClass6 B;
        for (i = 1; i <= n; i++) {
            B = new MyClass6();
            A.next = B;
            B.number = A.number + 1;
            A = B;
        }
        A.next = this;
    }
    int get(int k) {
        int i;
        MyClass6 obj = this;
        for (i = 1; i <= k; i++) {
            obj = obj.next;
        }
        return obj.number;
    }
}
