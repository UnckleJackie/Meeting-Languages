package Head_07_Classes_Reusing.Names_Hiding;

public class Hide {
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.f);
        b.doh(new MilHouse());
    }
}
