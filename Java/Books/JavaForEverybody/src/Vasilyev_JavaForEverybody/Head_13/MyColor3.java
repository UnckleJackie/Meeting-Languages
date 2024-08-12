package Vasilyev_JavaForEverybody.Head_13;

public enum MyColor3 {
    RED(100), GREEN(200), BLUE(300);
    private int code;

    MyColor3(int n) {
        code = n;
    }

    int getCode() {
        return code;
    }
}
