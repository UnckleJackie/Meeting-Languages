package PracticeSolves.Head_01.Solve_02_FirstNonRepeatedCharacter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    private static final int EXTENDED_ASCII_CODES = 256;

    public static char firstNonRepeatedCharacter(String str) {
        int[] flags = new int[EXTENDED_ASCII_CODES];
        for (int i = 0; i < flags.length; i++) {
            flags[i] = -1;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (flags[ch] == -1) {
                flags[ch] = i;
            } else {
                flags[ch] = -2;
            }
        }
        int position = Integer.MAX_VALUE;

        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            if (flags[i] >= 0) {
                position = Math.min(position, flags[i]);
            }
        }
        return position == Integer.MAX_VALUE ? Character.MIN_VALUE : str.charAt(position);
    }

    public static char firstNonRepeatedCharacter2(String str) {
        Map<Character, Integer> chars = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            ch = str.charAt(ch);
            chars.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return Character.MIN_VALUE;
    }

    public static String firstNonRepeatedCharacter3(String str) {
        Map<Integer, Long> chs = str.codePoints()
                .mapToObj(cp -> cp)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));
        int cp = chs.entrySet().stream()
                .filter(e -> e.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(Integer.valueOf(Character.MIN_VALUE));
        return String.valueOf(Character.toChars(cp));
    }

    public static void main(String[] args) {
        String str = "Buffalo Mozarella!";
        System.out.println(firstNonRepeatedCharacter(str));
        System.out.println(firstNonRepeatedCharacter2(str));
        System.out.println(firstNonRepeatedCharacter3(str));
    }
}
