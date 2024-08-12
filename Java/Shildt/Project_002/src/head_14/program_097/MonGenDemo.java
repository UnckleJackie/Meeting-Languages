package head_14.program_097;

public class MonGenDemo {
    public static void main(String[] args) {
        MonGen iOb;
        iOb = new MonGen(88);
        iOb.showType();
        int v = (Integer) iOb.getOb();
        System.out.println("Value: " + v);
        System.out.println();

        MonGen strOb = new MonGen("Test without generics");
        strOb.showType();
        String str = (String) strOb.getOb();
        System.out.println("Value: " + str);
        iOb = strOb;
        v = (Integer) iOb.getOb(); // Error during compilation
    }
}
