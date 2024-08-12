package PracticeSolves.Head_01.Solve_04;

public class ContainsOnlyDigits {
    public ContainsOnlyDigits(String str) {
        System.out.println("Constructor: " + str);
        System.out.println(containsOnlyDigits(str));
        System.out.println(containsOnlyDigits2(str));
        System.out.println(containsOnlyDigits3(str));
    }

    public ContainsOnlyDigits() {
    }

    public static boolean containsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsOnlyDigits2(String str) {
        return !str.chars().anyMatch(n -> !Character.isDigit(n));
    }

    public static boolean containsOnlyDigits3(String str) {
        return str.matches("[0-9]+");
    }
}
