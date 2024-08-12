package Head_05_Initialization_and_Ending;

import static java.lang.System.out;

public class Table {
    static Bowl bowl1 = new Bowl(1);
    Table() {
        out.println("Table()");
        bowl2.f1(1);
    }
    void f2(int marker) {
        out.println("f2(" + marker + ")");
    }
    static Bowl bowl2 = new Bowl(2);
}
