package head_14.program_098;

public class Gen10<T extends Number> {
    T ob;
    T[] vals;
    Gen10(T o, T[] nums) {
        ob = o;
        // vals = new T[10]; // That's impossible to create array of items T-type
        vals = nums;
    }
}
