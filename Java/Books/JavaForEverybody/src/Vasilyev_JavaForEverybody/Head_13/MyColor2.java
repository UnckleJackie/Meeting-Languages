package Vasilyev_JavaForEverybody.Head_13;

public enum MyColor2 {
    RED {
        MyColor2 next() {
            return GREEN;
        }
    },
    GREEN {
        MyColor2 next() {
            return BLUE;
        }
    },
    BLUE {
        MyColor2 next() {
            return RED;
        }
    };

    abstract MyColor2 next();
}
