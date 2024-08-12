//package PracticeSolves.Head_01.Solve_15;
//
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class SortArrayByLength {
//    Arrays.sort():
//
//    public static void sortArrayByLength(String[] strs, Sort direction) {
//        if (direction.equals(Sort.ASC)) {
//            Arrays.sort(strs, (String s1, String s2)
//                    -> Integer.compare(s1.length(), s2.length()));
//        } else {
//            Arrays.sort(strs, (String s1, String s2)
//                    -> (-1) * Integer.compare(s1.length(), s2.length()));
//        }
//    }
//
//    public static void sortArrayByLength2(String[] strs, Sort direction) {
//        if (direction.equals(Sort.ASC)) {
//            Arrays.sort(strs, Comparator.comparingInt(String::length));
//        } else {
//            Arrays.sort(strs, Comparator.comparingInt(String::length).reversed());
//        }
//    }
//
//    public static String[] sortArrayByLength(String[] strs, Sort direction) {
//        if (direction.equals(Sort.ASC)) {
//            return Arrays.stream(strs)
//                    .sorted(Comparator.comparingInt(String::length))
//                    .toArray(String[]::new);
//        } else {
//            return Arrays.stream(strs)
//                    .sorted(Comparator.comparingInt(String::length).reversed())
//                    .toArray(String[]::new);
//        }
//    }
//}
