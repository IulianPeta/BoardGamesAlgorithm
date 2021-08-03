package cluedo;

import java.util.Arrays;

public class Guests {

    private String[] guestsList;
    private String[][] missingGuestsList;
    private int missingCharacterListSize = 6;

    private String[] generateGuestsList() {
        guestsList = new String[6];

        guestsList[0] = "Mustard";
        guestsList[1] = "Plum";
        guestsList[2] = "Green";
        guestsList[3] = "Peacock";
        guestsList[4] = "Scarlet";
        guestsList[5] = "White";

        return guestsList;
    }

    private String[][] generateMissingGuestsList() {
        missingGuestsList = new String[6][2];

        for (int i = 0; i < missingCharacterListSize; i++) {
            missingGuestsList[i][0] = guestsList[i];

            if (missingGuestsList[i][1] == null) {
                missingGuestsList[i][1] = "Missing";
            }
        }

        return missingGuestsList;
    }

    public void printGuestsList() {
        System.out.println("The guests are: ");
        System.out.println(Arrays.toString(generateGuestsList()));
    }

    public void printMissingGuestsList() {
        System.out.println("The missing guests are: ");
        System.out.println(Arrays.deepToString(generateMissingGuestsList()));
    }
}
