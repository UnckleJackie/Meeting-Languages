package Vasilyev_JavaForEverybody.Head_11.Listing_16;

import java.util.HashSet;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n = 12;
        HashSet<Integer> nums = new HashSet<>();
        while (nums.size() < n) {
            nums.add(rnd.nextInt(20) + 1);
        }
        System.out.println(nums);
    }
}
