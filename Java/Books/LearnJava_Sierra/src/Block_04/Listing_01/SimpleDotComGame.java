package Block_04.Listing_01;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        DotCom2 theDotCom = new DotCom2();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        //theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive == true) {
            String guess = helper.getUserInput("Enter the number: ");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("Killed!")) {
                isAlive = false;
                System.out.println("You needed " + numOfGuesses + " tries");
            }
        }
    }
}
