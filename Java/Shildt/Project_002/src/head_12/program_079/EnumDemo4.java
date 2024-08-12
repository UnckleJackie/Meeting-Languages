package head_12.program_079;
// demonstration of using ordinal(), compareTo() and equals()
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
public class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;
        // Get all ordinary numbers
        System.out.println("\nAll constants of enum Apple with ordinal numbers:\n ");
        for (Apple a : Apple.values())
            System.out.println(a + "  \t" + a.ordinal());

        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;
        System.out.println();

        if (ap.compareTo(ap2) < 0)
            System.out.println(ap + " is before " + ap2);
        if (ap.compareTo(ap3) == 0)
            System.out.println(ap2 + " is before " + ap);
        if (ap.compareTo(ap3) == 0)
            System.out.println(ap + " equals to " + ap3);
        System.out.println();

        if (ap.equals(ap2))
            System.out.println("Error!");
        if (ap.equals(ap3))
            System.out.println(ap + " equals " + ap3);
        if (ap == ap3)
            System.out.println(ap + " == " + ap3);
    }
}
