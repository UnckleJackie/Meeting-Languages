package Head_04_Managing_Constructions;

import static java.lang.System.out;

public class IfElse2 {
    static int test(int testval, int target) {
        if(testval > target)
            return +1;
        else if(testval < target)
            return -1;
        else
            return 0;
    }
    public static void main(String[] args) {
        out.println(test(10, 5));
        out.println(test(5, 10));
        out.println(test(5, 5));
    }
}
