package head_12.program_081;
// Auto / un -boxing proceeds inside expressions
public class AutoBox3 {
    public static void main(String[] args) {
        Integer iOb, iOb2;
        int i;
        iOb = 100;
        System.out.println("Initial value iOb: " + iOb);

        // iOb automatically unboxes, increments and result boxes to iOb
        ++iOb;
        System.out.println("After ++iOb: " + iOb);

        // here iOb unboxes, expression counts, result boxes and names iOb2
        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 after counting expression: " + iOb2);

        // counts same expression, result doesn't box again
        i = iOb + (iOb / 3);
        System.out.println("i after counting expression: " + i);
    }
}
