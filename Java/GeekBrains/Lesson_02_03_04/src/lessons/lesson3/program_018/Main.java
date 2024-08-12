package lessons.lesson3.program_018;

import lessons.Methods;

public class Main {
    public static void main(String[] args) {
        Object o = 1;
        Methods.GetType(o);
        o = 1.2;
        Methods.GetType(o);

        System.out.println("\n" + Methods.Sum(1,2) +
                "\n" + Methods.Sum(1.0, 2) +
                "\n" + Methods.Sum(1, 2.0) +
                "\n" + Methods.Sum(1.2, 2.1) + "\n");

    }
}
