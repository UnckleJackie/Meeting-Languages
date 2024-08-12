package seminars.sem2.task3;

/**
 * @apiNote Задача на ООП (пригодится для дз и итогового проекта)
 * 1) Проектирование и создание класса, описывающего вектор.
 * Задача: Создайте класс, который описывает вектор (в трехмерном пространстве)
 * У него должны быть:
 *    конструктор с параметрами в виде списка координат x, y, z
 *    метод, вычисляющий длину вектора. (Корень - Math.sqrt()
 *    метод, вычисляющий скалярное произведение (x1x2 + y1y2 + z1z2)
 *    метод, вычисляющий векторное произведение с другим вектором:
 *       (y1z2 - z1y2,z1x2 - x1z2,x1y2 - y1x2)
 *    метод, выч-й угол между векторами (или косинус угла): косинус угла между
 *    векторами равен скалярному пр-ю вектора, дел на пр-е модулей длин векторов:
 *       (a,b)/|a|*|b|
 *    методы для суммы и разности:
 *       (x1 + x2,y1 + y2,z1 + z2); (x1 - x2,y1 - y2,z1 - z2)
 */



public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0, 2.0, 1.0);
        Vector vector2 = new Vector();
        System.out.println("vector1 = " + vector1);
        System.out.println("vector2 = " + vector2);
        System.out.println("length vector1: " + vector1.length());
        System.out.println("length vector2: " + vector2.length());
        System.out.println("Scalar product is " + vector1.scalarProduct(vector2));
        System.out.println("Vector product is: " + vector1.vectorProduct(vector2));
        System.out.println("Sum of vectors is: " + vector1.sumVectors(vector2));
        System.out.println("Difference of vectors is: " + vector1.diffVectors(vector2));
        System.out.println("Angle between vectors is: " +
                vector1.angleVectors(vector2));

    }
}
