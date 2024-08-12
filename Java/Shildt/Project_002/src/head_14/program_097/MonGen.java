package head_14.program_097;

public class MonGen {
    Object ob;
    MonGen(Object o) {
        ob = 0;
    }
    Object getOb() {
        return ob;
    }
    void showType() {
        System.out.println("Type ob is " + ob.getClass().getName());
    }
}
