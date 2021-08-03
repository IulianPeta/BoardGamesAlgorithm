package cluedo;

public class Guests {

    private String[] guestsList;
    private String[][] missingGuestsList;
    private final int CHARACTER_LIST_SIZE = 6;

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
        missingGuestsList = new String[CHARACTER_LIST_SIZE][2];

        for (int i = 0; i < CHARACTER_LIST_SIZE; i++) {
            missingGuestsList[i][0] = guestsList[i];

            if (missingGuestsList[i][1] == null) {
                missingGuestsList[i][1] = "Missing";
            }
        }

        return missingGuestsList;
    }

    public String[][] fillMissingGuestsList() {

        missingGuestsList[0][1] = "Mine";
        missingGuestsList[1][1] = "Wife";
        missingGuestsList[5][1] = "Sister";

        return missingGuestsList;
    }

    public void showPotentialCriminal() {
        System.out.println("The potential criminal is: ");
        for (int i = 0; i < CHARACTER_LIST_SIZE; i++) {
            if (missingGuestsList[i][1].equals("Missing")) {
                System.out.print(" | " + missingGuestsList[i][0] + " | ");
            }
        }
        System.out.println(" ");
    }
}