package head_12.program_078;
// using enum constructor, variable item and method
enum Apple {
    Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);
    private int price;  // price of each sort apple
    // Constructor
    Apple(int p) { price = p; }
    Apple() { price = -1; } // Overloaded constructor
    int getPrice() { return price; }
}
public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        // Display prices of apples
        System.out.println("\nApples sort Winesap costs " + Apple.Winesap.getPrice() +
                " cents.\n" +
                "GoldenDel apples cost " + Apple.GoldenDel.getPrice() + " cents" +
                "\nCortland apples cost " + Apple.Cortland.getPrice() + " cents\n");
        // Display all of the sorts of apples with pricec
        System.out.println("\nPrices of all of the apple sorts: ");
        for (Apple a : Apple.values())
            System.out.println("Apple sort of " + a + " costs " + a.getPrice() + " cents.");
    }
}
