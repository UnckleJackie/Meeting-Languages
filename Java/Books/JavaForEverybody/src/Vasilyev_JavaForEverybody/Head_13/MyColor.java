package Vasilyev_JavaForEverybody.Head_13;

public enum MyColor {
    RED, GREEN, BLUE;

    MyColor next() {
        if (this == RED) return GREEN;
        else if (this == GREEN) return BLUE;
        else return RED;
    }
}
