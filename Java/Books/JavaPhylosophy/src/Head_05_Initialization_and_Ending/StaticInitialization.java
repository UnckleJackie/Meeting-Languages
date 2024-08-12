package Head_05_Initialization_and_Ending;

import static java.lang.System.out;

public class StaticInitialization {
    public static void main(String[] args) {
        out.println("Creation new object Cupboard in main()");
        new Cupboard();
        out.println("Creation new object Cupboard in main()");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
