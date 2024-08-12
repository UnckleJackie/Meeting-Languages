package Head_07_Classes_Reusing.Final;

public class Beetle extends Insect {
    private int k = printInit("Field Beetle.k initialized");
    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInit("Field static Beetle.x2 initialized");
    public static void main(String[] args) {
        System.out.println("Constructor Beetle");
        Beetle b = new Beetle();
    }
}
