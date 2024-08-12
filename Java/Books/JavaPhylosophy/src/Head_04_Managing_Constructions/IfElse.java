package Head_04_Managing_Constructions;

import static java.lang.System.out;

public class IfElse {
    static int result = 0;
    static void test(int testval, int target) {
        if(testval > target)
            result = +1;
        else if(testval < target)
            result = -1;
        else result = 0;
    }
    public static void main(String[] args) {
        test(10, 5);
        out.println(result);
        test(4, 10);
        out.println(result);
        test(5, 5);
        out.println(result);
    }
}
