package catan;

import catan.polymorphism.PlayerInformation;
import catan.polymorphism.PlayerInterface;

public class PlayerFactory {

    private PlayerColours createPlayerColoursObject() {
        return new PlayerColours();
    }

    private PlayerColours generatePlayers() {
        PlayerColours player = createPlayerColoursObject();

        player.generatePlayersList();
        player.assignPlayerToColour(Colour.BLUE, "Me");
        player.assignPlayerToColour(Colour.WHITE, "Sister");
        player.assignPlayerToColour(Colour.RED, "Brother");
        player.assignPlayerToColour(Colour.ORANGE, "Missing");

        return player;
    }

    public void getInformationForEachPlayer() {
        generatePlayers().showPlayers();

        System.out.println();

        PlayerInterface[] playerInformation = new PlayerInterface[3];
        playerInformation[0] = new PlayerInformation("Me", 3, 4, 0, 5, 7);
        playerInformation[1] = new PlayerInformation("Sister", 10, 10, 4, 7, 7);
        playerInformation[2] = new PlayerInformation("Brother", 5, 5, 5, 5, 5);

        for (PlayerInterface players : playerInformation) {
            players.showResources();
            players.showVictoryPoints();
        }
    }
}
