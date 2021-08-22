package catan;

import catan.polymorphism.BluePlayer;
import catan.polymorphism.PlayerInterface;
import catan.polymorphism.RedPlayer;
import catan.polymorphism.WhitePlayer;

public class PlayerFactory {

    private Player createPlayerObject() {
        return new Player();
    }

    private Player generatePlayers() {
        Player player = createPlayerObject();

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

        PlayerInterface[] playerResources = new PlayerInterface[3];
        playerResources[0] = new BluePlayer("Me", 3, 4, 0, 5, 7);
        playerResources[1] = new WhitePlayer("Sister", 10, 10, 4, 7, 7);
        playerResources[2] = new RedPlayer("Brother", 5, 5, 5, 5, 5);

        for (PlayerInterface playerResource : playerResources) {
            playerResource.showResources();
            playerResource.showVictoryPoints();
        }
    }
}
