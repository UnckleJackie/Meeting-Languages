package Block_04.Listing_01;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom2> dotCom2List = new ArrayList<DotCom2>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom2 one = new DotCom2();
        one.setName("Pets.com");
        DotCom2 two = new DotCom2();
        two.setName("eToys.com");
        DotCom2 three = new DotCom2();
        three.setName("Go2.com");
        dotCom2List.add(one);
        dotCom2List.add(two);
        dotCom2List.add(three);

        System.out.println("Your target - to kill three \"sites\".");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to kill them for minimum tries");

        for (DotCom2 dotComToSet : dotCom2List) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotCom2List.isEmpty()) {
            String userGuess = helper.getUserInput("Make try");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "No! ha-ha";
        for (DotCom2 dotComToTest : dotCom2List) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Got it!")) {
                break;
            }
            if (result.equals("Killed!")) {
                dotCom2List.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All of the sites are killed!");
        if (numOfGuesses <= 18) {
            System.out.println("You did it for " + numOfGuesses + " tries");
            System.out.println("That's so fucking great!");
        } else {
            System.out.println("You did it for too much time and " + numOfGuesses + " tries");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
