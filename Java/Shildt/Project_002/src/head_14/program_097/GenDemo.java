package head_14.program_097;

/**
 * @apiNote
 * Generic class demonstration.
 * Create object Gen for type Integer objects
 * Create object Gen<Integer> and give link on it to variable iOb. Attention to using
 * autopackage for incapsulation value 88 inside the object Integer.
 * Show data type, using by variable iOb
 * Get value iOb. Приведение не требуется!!!
 * Create type String object, show type, get value strOb. Attention!!!
 */
public class GenDemo {
    public static void main(String[] args) {
        Gen<Double> doubOb = new Gen<Double>(3919.30);
        doubOb.showType();
        Double d = doubOb.getOb();
        System.out.println("Value d: " + d);
        System.out.println();

        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Value: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<String> ("Text with generics");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Value: " + str);
    }
}
