package Tasks_0001_0050.Task_0006_ZigZagConvertion;

public class Solution {
    public static void main(String[] args) {
        String s1 = "PAYPALISSHIRING";
        String s2 = "A";
        convert(s1, 3);
    }
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        String[] rows = new String[numRows]; // create array of strings and fill it empty strings
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }
        int row = 0; // init variables current row and direction
        int direction = 1;
        for (char c : s.toCharArray()) {
            rows[row] += c;
            if (row == 0) {
                direction = 1;
            } else if (row == numRows - 1) {
                direction = -1;
            }
            row += direction;
        }
        String result = "";
        for (String rowString : rows) {
            result += rowString;
            System.out.println(result);
        }
        return result;
    }
}
