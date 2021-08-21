package catan;

public class Player extends GameObject {

    public final static int BLUE = 0;
    public final static int WHITE = 1;
    public final static int RED = 2;
    public final static int ORANGE = 3;

    private String[] coloursList;
    private String[][] playersList;
    private final int PLAYERS_LIST_SIZE = 4;

    private String[] generateColoursList() {
        coloursList = new String[PLAYERS_LIST_SIZE];

        coloursList[0] = "Blue";
        coloursList[1] = "White";
        coloursList[2] = "Red";
        coloursList[3] = "Orange";

        return coloursList;
    }

    public String[][] generatePlayersList() {
        generateColoursList();
        playersList = new String[PLAYERS_LIST_SIZE][2];

        for (int i = 0; i < PLAYERS_LIST_SIZE; i++) {
            playersList[i][0] = coloursList[i];
        }
        return playersList;
    }

    public String assignPlayerToColour(int colourOrder, String ownerOfColour) {

        return playersList[colourOrder][1] = ownerOfColour;

    }

    public void showPlayers() {
        System.out.println("The persons playing are: ");

        for (int i = 0; i < PLAYERS_LIST_SIZE; i++) {
            if (!playersList[i][1].equals("Missing")) {
                System.out.print(" | " + playersList[i][0] + " is "  + playersList[i][1] + " | ");
                System.out.println(" ");
            }
        }
    }
}
