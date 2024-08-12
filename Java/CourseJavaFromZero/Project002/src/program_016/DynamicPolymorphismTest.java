package program_016;

import org.junit.Test;

public class DynamicPolymorphismTest {
    @Test
    public void testDynamicPolymorphism() {
        Mammal mammal = new Caesar();
        mammal.name();
        //mammal.peeInYourShoes();

        Caesar caesar = (Caesar) mammal;
        caesar.peeInYourShoes();
    }
}
