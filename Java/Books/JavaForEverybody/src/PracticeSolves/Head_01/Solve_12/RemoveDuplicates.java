package PracticeSolves.Head_01.Solve_12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static String removeDuplicates1(String str) {
        char[] chArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : chArray) {
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String removeDuplicates2(String str) {
        char[] chArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        Set<Character> chHashSet = new HashSet<>();

        for (char c : chArray) {
            if (chHashSet.add(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String removeDuplicates3(String str) {
        return Arrays.asList(str.split("")).stream()
                .distinct()
                .collect(Collectors.joining());
    }
}
