package program_014;

class OpelMokka {
    Color color;
    EngineType engineType;
    static int gears;

    public static void makeMokka(Color color, EngineType engineType, int gears) {
        System.out.println("\nColor: " + color +
                "\nEngine: " + engineType +
                "\nGears: " + gears);
    }
}

public class Opel {
    public static void main(String[] args) {
        OpelMokka mokkaX = new OpelMokka();
        mokkaX.makeMokka(mokkaX.color.BLUE, mokkaX.engineType.PETROL, 5);

        OpelMokka mokkaZ = new OpelMokka();
        OpelMokka.makeMokka(mokkaZ.color.WHITE, mokkaZ.engineType.DIESEL, 4);
    }
}
