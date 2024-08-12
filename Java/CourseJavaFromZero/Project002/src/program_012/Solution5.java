package program_012;
class Arithmetic {
    int numOne;
    int numTwo;
    public static int add(int numOne, int numTwo) {
        return numOne + numTwo;
    }
}

class Adder extends Arithmetic {

}
public class Solution5 {
    public static void naum(String[] args) {
        Adder a = new Adder();  // Create a new Adder object
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " +a.add(10, 10) + "\n");
    }
}
