package head_12.program_077;
// using integral enum methods
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("All of the enum constants Apple: ");
        // using values()
        Apple[] allapples = Apple.values();
        for (Apple a : allapples)
            System.out.println(a);
        System.out.println();

        // using valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("ap contents " + ap);
    }
}
