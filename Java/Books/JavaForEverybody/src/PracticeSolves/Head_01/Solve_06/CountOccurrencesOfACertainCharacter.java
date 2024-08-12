package PracticeSolves.Head_01.Solve_06;

public class CountOccurrencesOfACertainCharacter {
    public CountOccurrencesOfACertainCharacter(String str, char ch) {

        System.out.println("This is the constructor!" + str + ch);
        System.out.println(countOccurrencesOfACertainCharacter(str, ch));
        System.out.println(countOccurrencesOfACertainCharacter3(str, ch));
        System.out.println(countOccurrencesOfACertainCharacter4(str, ch));
    }

    public static int countOccurrencesOfACertainCharacter(String str, char ch) {
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }

    public static int countOccurrencesOfACertainCharacter2(String str, String ch) {
        if (ch.codePointCount(0, ch.length()) > 1) {
            return -1;
        }
        int result = str.length() - str.replace(ch, "").length();
        return ch.length() == 2 ? result / 2 : result;
    }

    public static int countOccurrencesOfACertainCharacter3(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static long countOccurrencesOfACertainCharacter4(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}
