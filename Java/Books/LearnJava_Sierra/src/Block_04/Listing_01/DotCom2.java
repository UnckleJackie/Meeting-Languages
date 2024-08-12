package Block_04.Listing_01;

import java.util.ArrayList;

public class DotCom2 {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }
public void setName(String n) {
        name = n;
}
    public String checkYourself(String userInput) {
        String result = "No! ha-ha";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Killed!";
                System.out.println("Jesus! You killed " + name + " :( ");
            } else {
                result = "Got it!";
            }
        }
        return result;
    }
}
