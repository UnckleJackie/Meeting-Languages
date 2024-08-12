package Vasilyev_JavaForEverybody.Head_13;

public class Demo10 {
    public static void main(String[] args) {
        MyClass obj = new MyClass(5);
        System.out.println(obj.num + "! = " + obj.factorial());
        obj.num = 10;
        System.out.println(obj.num + "! = " + obj.factorial());
    }
}
