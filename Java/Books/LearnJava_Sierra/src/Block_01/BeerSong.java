package Block_01;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle";
            }
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one.");
            System.out.println("Get around.");
            beerNum--;
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
                System.out.println();
            } else {
                System.out.println("There are no bottles on the wall!");
            }
        }
    }
}
