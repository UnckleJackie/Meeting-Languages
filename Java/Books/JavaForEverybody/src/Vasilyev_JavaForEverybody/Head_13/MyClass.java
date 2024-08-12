package Vasilyev_JavaForEverybody.Head_13;

public class MyClass {
    int num;

    MyClass(int n) {
        num = n;
    }

    int factorial() {
        if (num < 1) return 1;
        else return new MyClass(num - 1).factorial() * num;
    }
}
