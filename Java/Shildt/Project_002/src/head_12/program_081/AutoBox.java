package head_12.program_081;
// Demonstration of work autobox and autounbox
public class AutoBox {
    public static void main(String[] args) {
        Integer iOb = 100;  // autobox value int
        int i = iOb;        // autounbox
        System.out.println(i + "\t" + iOb);
    }
}
