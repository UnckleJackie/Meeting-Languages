package head_9.program_058;
// Realization IntStack, using fixed length storage
public class FixedStack implements IntStack {
    private int[] stck;
    private int tos;
    // Разместить in memory and initialize stack
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }
    // Add item to stack
    public void push(int item) {
        if (tos == stck.length - 1) // using member length
            System.out.println("Stack is full");
        else stck[++tos] = item;
    }
    // Extract item from Stack
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else
            return stck[tos--];
    }
}
