package head_14.program_098;

public class GenArrays {
    public static void main(String[] args) {
        Integer[] n = { 1, 2, 3, 4, 5 };
        Gen10<Integer> iOb = new Gen10<Integer>(50, n);
        // Gen<Integer>[] gens = new Gen<Integer>[10]; // Error! It's impossible to create
        // array of generic links for definite type
        Gen10<?>[] gens = new Gen10<?>[10];
    }
}
