package head_12.program_081;
// Автоупаковка.автораспаковка выполняется в отношении пар-в и возвр-го зн-я метода
public class AutoBox2 {
    static int m(Integer v) {
        return v;   // autounbox to int
    }

    public static void main(String[] args) {
        Integer iOb = m(100);
        System.out.println(iOb);
    }
}
