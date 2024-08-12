package Vasilyev_JavaForEverybody.Head_13;

public class Demo15 {
    public static void main(String[] args) {
        MyColor3 clr;
        for (int k = 0; k < MyColor3.values().length; k++) {
            clr = MyColor3.values()[k];
            System.out.println("[" + clr.ordinal() + "] " + clr.name() + ": " + clr.getCode());
        }
    }
}
