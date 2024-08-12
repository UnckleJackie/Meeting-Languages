package Block_03;

public class TestArrays2 {
    public static void main(String[] args) {
        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        String[] islands = new String[4];
        islands[0] = "Bermudas";
        islands[1] = "Fidgi";
        islands[2] = "Azorians";
        islands[3] = "Kosumel";
        int y = 0;
        int ref;
        while (y < 4) {
            ref = index[y];
            System.out.print("Islands = ");
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }
}
