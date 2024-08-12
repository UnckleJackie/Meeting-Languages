package Block_02;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "How to fail in shares";
        one.genre = "Tragedy";
        one.rating = -2;
        one.playIt();
        Movie two = new Movie();
        two.title = "Lost in the office";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.title = "Byte-club";
        three.genre = "Tragedy, but funny mostly";
        three.rating = 127;
        three.playIt();
    }
}
