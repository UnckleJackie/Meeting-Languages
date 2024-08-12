package head_9.program_058;

public class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        // Add a few numbers to stacks
        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);

        // Extract this numbers from stacks
        System.out.println("Stack in mystack1: ");
        for (int i = 0; i < 5; i++)
            System.out.println("Stack in mystack2: ");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}
