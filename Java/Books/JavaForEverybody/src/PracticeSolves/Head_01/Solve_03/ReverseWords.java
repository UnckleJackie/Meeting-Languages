package PracticeSolves.Head_01.Solve_03;

public class ReverseWords {
    public static final String WHITESPACE = " ";

    public static String reverseWords(String str) {
        String[] words = str.split(WHITESPACE);
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
            }
            reversedString.append(reverseWord).append(WHITESPACE);
        }
        return reversedString.toString();
    }

    public static void main(String[] args) {
        String str = "Buffalo Mozarella viva Mafia Gelendgik!";
        System.out.println(reverseWords(str));
    }
}

