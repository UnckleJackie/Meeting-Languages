package seminars.sem3.task3;

import java.util.Objects;

public class Cube {
    private Integer side;
    private String color;
    private String material;
    public Cube(int side, String color, String material) {
        this.side = side;
        this.color = color;
        this.material = material;
    }
    public Cube() { }
    public int getSide() {
        return side;
    }
    public void setSide(Integer side) {
        this.side = side;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public int cubeVolume() {
        return (int)Math.pow(side, 3);
    }
    public String toString() {
        return "Cube {" + "side = " + side + ", color = " + color + '\'' + ", material = " +
                material + '\'' + ", volume = " + cubeVolume() + '\'' + "}";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != getClass()) return false;
        Cube cube = (Cube) o;
        return Objects.equals(side, cube.side) && Objects.equals(color, cube.color) && Objects.equals(material, cube.material);
    }
    @Override
    public int hashCode() {
        return Objects.hash(side, color, material);
    }
}
