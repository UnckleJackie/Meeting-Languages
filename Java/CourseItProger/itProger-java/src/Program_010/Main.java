package Program_010;

public class Main {
    public static void main(String[] args) {
        byte[] nums1 = new byte[] { 5, 6, 8, 17, 3, 9, 18, 9, 12, 4 };
        int sum1 = summaArray(nums1);
        System.out.println("Sum 1: " + sum1);

        byte[] nums2 = new byte[] { 5, 7, 9, 1, 3, 8, 4, 13, 92, 14 };
        int sum2 = summaArray(nums2);
        System.out.println("Sum 2: " + sum2);
    }

    public static int summaArray(byte[] array) {
        int summa = 0;
        for (byte i = 0; i < array.length; i++) {
            summa += array[i];
        }
        return summa;
    }
}
