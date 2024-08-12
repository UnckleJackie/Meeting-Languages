package Head_07_Classes_Reusing.Names_Hiding;

public class Villain {
    private String name;
    protected void set(String nm) {
        name = nm;
    }
    public Villain(String name) {
        this.name = name;
    }
    public String toString() {
        return "I'm the object Villain and my name is " + name;
    }
}
