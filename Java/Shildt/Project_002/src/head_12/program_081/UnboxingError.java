package head_12.program_081;
// Error using handling unboxing
public class UnboxingError {
    public static void main(String[] args) {
        Integer iOb = 1000;     // automatically box value 1000
        int i = iOb.byteValue(); // handling unbox as byte!!!
        System.out.println(i);   // output not 1000 !

        // Bad applying auto- boxing / unboxing
        Double a, b, c;
        a = 10.0;
        b = 4.0;
        c = Math.sqrt(a * a + b * b);
        System.out.println("Hypotenuse is " + c);
    }
}
