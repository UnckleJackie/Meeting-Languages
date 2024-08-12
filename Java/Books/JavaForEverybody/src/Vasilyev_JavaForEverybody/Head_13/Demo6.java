package Vasilyev_JavaForEverybody.Head_13;

public class Demo6 {
    static void show(String txt, int... nums) {
        System.out.print(txt + ":");
        for (int k = 0; k < nums.length; k++) {
            System.out.print(" " + nums[k]);
        }
        System.out.println();
    }

    static void show(int... nums) {
        System.out.print("Argues {");
        for (int k = 0; k < nums.length - 1; k++) {
            System.out.print(nums[k] + ", ");
        }
        System.out.println(nums[nums.length - 1] + "}");
    }

    static void show() {
        System.out.println("No argues");
    }

    static void show(int a) {
        System.out.println("One argument: " + a);
    }

    static void show(int a, int b) {
        System.out.println("Arguments " + a + " and " + b);
    }

    public static void main(String[] args) {
        show();
        show(100);
        show(10, 20);
        show(1, 2, 3);
        show("Numbers", 1, 2, 3, 4);
    }
}
