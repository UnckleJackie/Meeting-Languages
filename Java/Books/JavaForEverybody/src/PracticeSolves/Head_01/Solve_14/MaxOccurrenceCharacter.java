package PracticeSolves.Head_01.Solve_14;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class MaxOccurrenceCharacter {
    /*
    Довольно простой вариант решения опирается на коллекцию HashМap и состоит из
трех шагов:
1. Во-первых, перебрать символы заданной строки в цикле и поместить пары
"ключ-значение" в коллекцию наshМар, где ключ - это текущий символ, а значение - текущее число появлений.
2. Во-вторых, вычислить максимальное значение в коллекции HashМap (например,
используя Collections . max () ), представляющий максимальное число появлений.
3. Наконец, получить символ, который имеет максимальное число появлений,
обойдя в цикле множество элементов коллекции наshМар.
     */
    public static Map<Character, Integer> maxOccurrenceCharacter(String str) {
        Map<Character, Integer> counter = new HashMap<>();
        char[] chStr = str.toCharArray();
        for (int i = 0; i < chStr.length; i++) {
            char currentCh = chStr[i];
            if (!Character.isWhitespace(currentCh)) {
                Integer noCh = counter.get(currentCh);
                if (noCh == null) {
                    counter.put(currentCh, 1);
                } else {
                    counter.put(currentCh, ++noCh);
                }
            }
        }
        int maxOccurrences = Collections.max(counter.values());
        char maxCharacter = Character.MIN_VALUE;

        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == maxOccurrences) {
                maxCharacter = entry.getKey();
            }
        }
        return Map.of(maxCharacter, maxOccurrences);
    }

    private static final int EXTENDED_ASCII_CODES = 256;

    public static Map<Character, Integer> maxOccurrenceCharacter2(String str) {
        int maxOccurrences = -1;
        char maxCharacter = Character.MIN_VALUE;
        char[] chStr = str.toCharArray();
        int[] asciiCodes = new int[EXTENDED_ASCII_CODES];

        for (int i = 0; i < chStr.length; i++) {
            char currentCh = chStr[i];
            if (!Character.isWhitespace(currentCh)) {
                int code = (int) currentCh;
                asciiCodes[code]++;
                if (asciiCodes[code] > maxOccurrences) {
                    maxOccurrences = asciiCodes[code];
                    maxCharacter = currentCh;
                }
            }
        }
        return Map.of(maxCharacter, maxOccurrences);
    }

    public static Map<Character, Long> maxOccurrenceCharacter3(String str) {
        return str.chars()
                .filter(c -> Character.isWhitespace(c) == false)
                .mapToObj(c -> (char) c)
                .collect(groupingBy(c -> c, counting()))
                .entrySet()
                .stream()
                .max(comparingByValue())
                .map(p -> Map.of(p.getKey(), p.getValue()))
                .orElse(Map.of(Character.MIN_VALUE, -1L));
    }
}
