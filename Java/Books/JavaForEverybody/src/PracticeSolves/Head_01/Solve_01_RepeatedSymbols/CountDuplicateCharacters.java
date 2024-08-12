package PracticeSolves.Head_01.Solve_01_RepeatedSymbols;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateCharacters {
    public static Map<Character, Integer> countDuplicateCharacters(String str) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }

    public static Map<Character, Integer> countDuplicateCharacters2(String str) {
        Map<Character, Integer> result = new HashMap<>();
        for (char ch : str.toCharArray()) {
            ch = str.charAt(ch);
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }

    public static Map<Character, Long> countDuplicateCharacters3(String str) {
        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }

    public static Map<String, Integer> countDuplicateCharacters4(String str) {
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int cp = str.codePointAt(i);
            String ch = String.valueOf(Character.toChars(cp));
            if (Character.charCount(cp) == 2) {
                i++;
            }
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }

    public static Map<String, Long> countDuplicateCharacters5(String str) {
        Map<String, Long> result = str.codePoints()
                .mapToObj(c -> String.valueOf(Character.toChars(c)))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }

    public static void main(String[] args) {
        String str = "Buffalo Mozarella";
        // System.out.println(countDuplicateCharacters(str));
        // System.out.println(countDuplicateCharacters2(str));
        // System.out.println(countDuplicateCharacters3(str));
        // System.out.println(countDuplicateCharacters4(str));
        System.out.println(countDuplicateCharacters5(str));
    }
}
