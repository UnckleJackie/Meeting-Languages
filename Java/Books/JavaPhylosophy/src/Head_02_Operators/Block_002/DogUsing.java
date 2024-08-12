package Head_02_Operators.Block_002;

public class DogUsing {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "spot";
        dog1.says = "haf";
        Dog dog2 = new Dog();
        dog2.name = "scruffy";
        dog2.says = "hrrrr";
        System.out.println("Dog " + dog1.name + " says " + dog1.says);
        System.out.println("Dog " + dog2.name + " says " + dog2.says);
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));
        dog1 = dog2;
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));
    }
}
