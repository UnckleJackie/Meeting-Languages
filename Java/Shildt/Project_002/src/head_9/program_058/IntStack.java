package head_9.program_058;
// Define interface for integer stack
interface IntStack {
    void push(int item); // save item
    int pop();          // extract item

    // Because method clear() has standard realization, we don't need
    // to realise it in existing class using IntStack
    default void clear() {
        System.out.println("Method clear() didn't realise");
    }

    // Standard method returning array which contents upstairs n items in stack
    default int[] popNElements(int n) {
        return getElements(n);
    }

    // Standard method returning array which contents next n items in stack
    // after skipping skip items
    default int[] skipAndPopNElements(int skip, int n) {
        getElements(skip);
        return getElements(n);
    }

    // Private method, which returns array contents upstairs n items in stack
    private int[] getElements(int n) {
        int[] elements = new int[n];
        for (int i = 0; i < n; i++) elements[i] = pop();
        return elements;
    }
}

