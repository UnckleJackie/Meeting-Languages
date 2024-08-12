package seminars.sem2.task3;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
        this.x = 1.0;
        this.y = 1.0;
        this.z = 1.0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector { x = " + x + ", y = " + y + ", z = " + z + " }";
    }

    /**
     * @return length result
     * @apiNote method length vector calculating
     */
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @return result
     * @apiNote метод, вычисляющий скалярное произведение (x1x2 + y1y2 + z1z2)
     */
    public double scalarProduct(Vector vector2) {
        return x * vector2.getX() +
                y * vector2.getY() +
                z * vector2.getZ();
    }

    /**
     * @param vector2
     * @return result
     * @apiNote метод, вычисляющий векторное произведение с другим вектором:
     * (y1z2 - z1y2,z1x2 - x1z2,x1y2 - y1x2)
     */
    public String vectorProduct(Vector vector2) {
        return "{ x = " + (y * vector2.getZ() - z * vector2.getY()) + ", y = " +
                (z * vector2.getX() - x * vector2.getZ()) + ", z = " +
                (x * vector2.getY() - y * vector2.getX()) + " }";
    }

    /**
     * @param vector2
     * @return
     * @apiNote методы для вычисления суммы векторов
     * (x1 + x2,y1 + y2,z1 + z2);
     */
    public String sumVectors(Vector vector2) {
        return "{ x = " + (x + vector2.getX()) + ", y = " + (y + vector2.getY() +
                ", z = " + (z + vector2.getZ()) + " }");
    }

    /**
     * @param vector2
     * @return
     * @apiNote метод для вычисления разности векторов (x1 - x2,y1 - y2,z1 - z2)
     */
    public String diffVectors(Vector vector2) {
        return "{ x = " + (x - vector2.getX() + ", y = " + (y - vector2.getY()) +
                ", z = " + (z - vector2.getZ()) + " }");
    }

    /**
     * @param v
     * @param length
     * @param length1
     * @return
     * @apiNote метод, выч-й угол между векторами (или косинус угла): косинус угла между
     * векторами равен скалярному пр-ю вектора, дел на пр-е модулей длин векторов:
     * (a,b)/|a|*|b|
     */
    public double angleVectors(Vector vector2) {
        return scalarProduct(vector2) / (length() * vector2.length());
    }
}
