package Program_012;

public class Person {
    public static int count;
    public int health;
    public Person() {
        count++;
    }
    public static void getCount() {
        System.out.println("Amount: " + count);
        // this.health = 45; // if no "static" - error
    }
}
