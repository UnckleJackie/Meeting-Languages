package Block_04.Listing_01;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }
    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "No! ha-ha";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Got it!";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "Killed!";
        }
        System.out.println(result);
        return result;
    }
}
