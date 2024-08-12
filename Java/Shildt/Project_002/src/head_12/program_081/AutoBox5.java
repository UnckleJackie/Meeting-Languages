package head_12.program_081;
// Autoboxing / unboxing objects Boolean and Character
public class AutoBox5 {
    public static void main(String[] args) {
        // Automatically box / unbox value boolean
        Boolean b = true;

        // Below b automatically unboxes used in if
        if(b) System.out.println("b is true");

        // Automatically box / unbox value char
        Character ch = 'x';     // box char
        char ch2 = ch;          // unbox char
        System.out.println("ch2 is " + ch2);
    }
}
