package head_14.program_098;

public class OverrideDemo {
    public static void main(String[] args) {
        Gen7<Integer> iOb = new Gen7<Integer>(88);
        Gen8<Integer> iOb2 = new Gen8<Integer>(99);
        Gen8<String> strOb2 = new Gen8<String>("Generics test");
        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb2.getOb());
    }
}
