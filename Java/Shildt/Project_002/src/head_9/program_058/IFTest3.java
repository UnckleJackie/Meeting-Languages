package head_9.program_058;
// Create variable of link to interface and make access to stacks by it
public class IFTest3 {
    public static void main(String[] args) {
        IntStack mystack; // create variable of lint to interface
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);
        mystack = ds;  // load to dynamic sized stack

        // push some numbers to stacks
        for (int i = 0; i < 12; i++) mystack.push(i);
        mystack = fs; // load to fix sized stack
        for (int i = 0; i < 8; i++) mystack.push(i);

        mystack = ds;
        System.out.println("\nValues in dynamic sized stack: ");
        for (int i = 0; i < 12; i++)
            System.out.print(mystack.pop() + " ");

        mystack = fs;
        System.out.println("\nValuse in fix sized stack: ");
        for (int i = 0; i < 8; i++)
            System.out.print(mystack.pop() + " ");
    }
}
