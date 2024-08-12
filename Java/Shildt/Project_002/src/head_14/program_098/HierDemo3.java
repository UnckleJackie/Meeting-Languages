package head_14.program_098;

public class HierDemo3 {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen6<Integer> iOb2 = new Gen6<Integer>(99);
        Gen6<String> strOb2 = new Gen6<String>("Generics Test");
        if (iOb2 instanceof Gen6<?>)
            System.out.println("iob2 is item of Class Gen6");
        if (iOb2 instanceof Gen<?>)
            System.out.println("iOb2 is item of Class Gen");
        System.out.println();

        if (strOb2 instanceof Gen6<?>)
            System.out.println("strOb2 is item of Class Gen6");
        if (strOb2 instanceof Gen<?>)
            System.out.println("strOb is item of Class Gen");
        System.out.println();

        if (iOb instanceof Gen6<?>)
            System.out.println("iOb is item of Class Gen6");
        if (iOb instanceof Gen<?>)
            System.out.println("iOb is item of Class Gen");
    }
}
