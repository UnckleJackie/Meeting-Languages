//package PracticeSolves.Head_01.Solve_05;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//
//public class Vowels {
//    private static final Set<Character> allVowels
//            = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));
//
//    public static Pair<Integer, Integer> countVowelsAndConsonants(String str) {
//        str = str.toLowerCase();
//        int vowels = 0;
//        int consonants = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (allVowels.contains(ch)) {
//                vowels++;
//            } else if ((ch >= 'a') && (ch <= 'z')) {
//                consonants++;
//            }
//        }
//        return Pair.of(vowels, consonants);
//    }
//    public static Pair2<Long, Long> countVowelsAndConsonants(String str) {
//        str = str.toLowerCase();
//
//        long vowels = str.chars()
//                .filter(c -> allVowels.contains((char) c))
//                .count();
//        long consonants = str.chars()
//                .filter(c -> !allVowels.contains((char) c))
//                .filter(ch -> (ch >= 'a' && ch <= 'z'))
//                .count();
//        return Pair2.of(vowels, consonants);
//    }
//}
