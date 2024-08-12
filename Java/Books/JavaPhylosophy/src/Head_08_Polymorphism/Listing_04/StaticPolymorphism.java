package Head_08_Polymorphism.Listing_04;

public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub();
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }
}
