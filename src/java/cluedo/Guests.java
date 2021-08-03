package cluedo;

import java.util.Arrays;

public class Guests {

    private String[] guestsList;
    private String[][] missingGuestsList;
    private int missingCharacterListSize = 6;

    public String[] generateGuestsList() {
        guestsList = new String[6];

        guestsList[0] = "Mustard";
        guestsList[1] = "Plum";
        guestsList[2] = "Green";
        guestsList[3] = "Peacock";
        guestsList[4] = "Scarlet";
        guestsList[5] = "White";

        return guestsList;
    }

    public String[][] generateMissingGuestsList() {
        missingGuestsList = new String[6][2];

        for (int i = 0; i < missingCharacterListSize; i++) {
            missingGuestsList[i][0] = guestsList[i];

            if (missingGuestsList[i][1] == null) {
                missingGuestsList[i][1] = "Missing";
            }
        }

        return missingGuestsList;
    }

    public String[][] fillMissingGuestsList() {

        missingGuestsList[0][1] = "Mine";
        missingGuestsList[1][1] = "Cristina";
        missingGuestsList[5][1] = "Octavia";

        return missingGuestsList;
    }

    public void showPotentialCriminal() {
        System.out.println("The potential criminal is: ");
        for (int i = 0; i < missingCharacterListSize; i++) {
            if (missingGuestsList[i][1] == "Missing") {
                System.out.print(" | " + missingGuestsList[i][0] + " | ");
            }
        }
        System.out.println("");
    }
}
