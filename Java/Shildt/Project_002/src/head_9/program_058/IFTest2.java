package head_9.program_058;

public class IFTest2 {
    public static void main(String[] args) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);

        // These loops rise every stack
        for (int i = 0; i < 12; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);

        System.out.println("\nStack in mystack1: ");
        for (int i = 0; i < 12; i++)
            System.out.print(mystack1.pop() + " ");
        System.out.println("\nStack in mystack2: ");
        for (int i = 0; i < 20; i++)
            System.out.print(mystack2.pop() + " ");
    }
}
