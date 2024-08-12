package Vasilyev_JavaForEverybody.Head_04;

public class MyClass2 {
    String name;
    int number;
    void set(String txt, int num) {
        name = txt;
        number = num;
    }
    void show() {
        System.out.println(name + ": " + number);
    }
}
