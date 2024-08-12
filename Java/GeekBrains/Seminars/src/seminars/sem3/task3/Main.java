package seminars.sem3.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * @apiNote Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в см)
         * его цвет (красный, желтый, зеленый и тд)
         * и материал (деревянный, металлический, картонный и тд). Найти:
         *  - количество кубиков желтого цвета и их суммарный объем
         *  количество деревянных кубиков с ребром 3 см
         */
        List<Cube> cubeList = new ArrayList<>(Arrays.asList(
                new Cube(4, "red", "wood"),
                new Cube(4, "blue", "metal"),
                new Cube(4, "yellow", "paper"),
                new Cube(3, "red", "wood"),
                new Cube(3, "blue", "metal"),
                new Cube(3, "yellow", "paper"),
                new Cube(5, "red", "wood"),
                new Cube(5, "blue", "metal"),
                new Cube(5, "yellow", "paper"),
                new Cube(15, "black", "plastic")));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the searching any cubes with color: ");
        String searchColor = scanner.nextLine();
        System.out.print("Enter the searching any cubes material: ");
        String searchMaterial = scanner.nextLine();
        System.out.print("Enter the searching " + searchMaterial + " cubes with the side: ");
        Integer searchSide = scanner.nextInt();
        for (Cube cube : cubeList) {
            if (cube.getColor().equals(searchColor)) {
                System.out.println(cube.getSide() + " sm " + cube.getMaterial() + ", volume = " +
                        cube.cubeVolume());
            }
        }
        int countColor = 0;
        int countMaterial = 0;
        int sumVolume = 0;
        for (int i = 0; i < cubeList.size(); i++) {
            if (cubeList.get(i).getColor().equals(searchColor)) {
                countColor++;
                sumVolume += cubeList.get(i).cubeVolume();
            }
            if (cubeList.get(i).getMaterial().equals(searchMaterial)
                    && cubeList.get(i).getSide() == searchSide) {
                countMaterial++;
            }
        }
        System.out.println("count of " + searchColor + " cubes = " + countColor +
                ", Sum of volumes = " + sumVolume);
        System.out.println("count of " + searchMaterial + " cubes  with side = " + searchSide +
                " is " + countMaterial);
        System.out.println("unicumCollection(cubeList) = " + unicumCollection(cubeList));
    }
    private static Collection unicumCollection(List<Cube> cubeList) {
        return new HashSet(cubeList);
    }
}
