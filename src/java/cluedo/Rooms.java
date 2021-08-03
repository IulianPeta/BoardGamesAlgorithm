package cluedo;

public class Rooms {

    private String[] roomsList;
    private String[][] missingRoomsList;
    private final int ROOMS_LIST_SIZE = 9;

    public String[] generateRoomsList() {
        roomsList = new String[ROOMS_LIST_SIZE];

        roomsList[0] = "Hall";
        roomsList[1] = "Dinning Room";
        roomsList[2] = "Kitchen";
        roomsList[3] = "Patio";
        roomsList[4] = "Observatory";
        roomsList[5] = "Theater";
        roomsList[6] = "Living Room";
        roomsList[7] = "Spa";
        roomsList[8] = "Guest House";

        return roomsList;
    }

    public String[][] generateMissingRoomsList() {
        missingRoomsList = new String[ROOMS_LIST_SIZE][2];

        for (int i = 0; i < ROOMS_LIST_SIZE; i++) {
            missingRoomsList[i][0] = roomsList[i];

            if (missingRoomsList[i][1] == null) {
                missingRoomsList[i][1] = "Missing";
            }
        }

        return missingRoomsList;
    }

    public String[][] fillMissingRoomsList() {

        missingRoomsList[0][1] = "Mine";
        missingRoomsList[1][1] = "Wife";
        missingRoomsList[2][1] = "Mine";
        missingRoomsList[5][1] = "Sister";
        missingRoomsList[7][1] = "Found";

        return missingRoomsList;
    }

    public void showPotentialRoom() {
        System.out.println("The potential room where the crime happened is: ");
        for (int i = 0; i < ROOMS_LIST_SIZE; i++) {
            if (missingRoomsList[i][1].equals("Found")) {
                System.out.print(" | " + missingRoomsList[i][0] + " | ");
                break;
            } else if  (missingRoomsList[i][1].equals("Missing")) {
                System.out.print(" | " + missingRoomsList[i][0] + " | ");
            }
        }
        System.out.println(" ");
    }
}
