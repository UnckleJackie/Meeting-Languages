package Program_012;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
//        Person.count = 5;
//        System.out.println(Person.count);

        final int amount = 10;
        //amount++;

        Person obj1 = new Person();
        Person obj2 = new Person();
        Person.getCount();
        Person obj3 = new Person();
        Person obj4 = new Person();
        Person.getCount();

        info();
        info("bambarbia");
    }
    public static void info() {
        System.out.println("Hello");
    }
    public static void info(String word) {
        System.out.println(word);
    }
}
