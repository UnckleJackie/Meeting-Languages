package Vasilyev_JavaForEverybody.Head_11.Listing_11;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println(nums);
        System.out.println("Size: " + nums.size());
        nums.add(100);
        nums.add(200);
        nums.add(300);
        System.out.println(nums);
        System.out.println("Size: " + nums.size());
        nums.add(0, -1);
        nums.add(2, 0);
        System.out.println(nums);
        System.out.println("Size: " + nums.size());
        nums.set(1, 123);
        System.out.println(nums);
        nums.remove(2);
        System.out.println(nums);
        System.out.println("Size: " + nums.size());
        nums.clear();
        System.out.println(nums);
        System.out.println("Size: " + nums.size());
        if (nums.isEmpty()) nums.add(321);
        System.out.println(nums);
        System.out.println("Size: " + nums.size());
    }
}
