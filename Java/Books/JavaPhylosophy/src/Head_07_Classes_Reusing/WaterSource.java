package Head_07_Classes_Reusing;

public class WaterSource {
    private String s;
    WaterSource() {
        System.out.println("WaterSource()");
        s = "constructed!";
    }
    public String toString() {
        return s;
    }
}
