package Vasilyev_JavaForEverybody.Head_08;

public class Demo {
    public static void main(String[] args) {
        char[] symbs = {'L', 'a', 'n', 'g', 'u', 'a', 'g', 'e', 'J', 'a', 'v', 'a'};
        String A = new String(symbs);
        System.out.println(A);
        String B = new String(symbs, 5, 4);
        System.out.println(B);
        String C = new String(A);
        System.out.println(C);
        byte[] nums = {65, 66, 67, 68, 69, 70};
        String D = new String(nums);
        System.out.println(D);
        String E = new String(nums, 2, 3);
        System.out.println(E);
    }
}
