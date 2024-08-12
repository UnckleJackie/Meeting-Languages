package Vasilyev_JavaForEverybody.Head_13;

public class Demo13 {
    public static void main(String[] args) {
        MyColor clr = MyColor.RED;
        for (int k = 0; k <= MyColor.values().length; k++) {
            System.out.println((k + 1) + " - " + clr);
            clr = clr.next();
        }
    }
}
