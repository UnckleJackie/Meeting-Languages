package Vasilyev_JavaForEverybody.Head_04;

public class Demo9 {
    public static void main(String[] args) {
        MyClass6 obj = new MyClass6();
        obj.create(3);
        System.out.println("Check field value number");
        System.out.println("Second after initial: " + obj.get(2));
        System.out.println("4-th after initial: " + obj.get(4));
        System.out.println("Second object after first: " + obj.next.get(2));
    }
}
