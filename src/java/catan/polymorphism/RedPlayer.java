package catan.polymorphism;

import catan.PlayerResources;
import catan.VictoryPointsCards;

public class RedPlayer implements PlayerInterface {

    private final String playerName;

    private PlayerResources createPlayerResourcesObject() {
        return new PlayerResources();
    }

    public RedPlayer(String playerName) {
        this.playerName = playerName;
    }

    private PlayerResources generatePlayersResources() {
        PlayerResources playerResources = createPlayerResourcesObject();

        playerResources.setBrick(0);
        playerResources.setGrain(0);
        playerResources.setLumber(0);
        playerResources.setOre(2);
        playerResources.setWool(3);

        return playerResources;
    }

    @Override
    public void showResources() {
        System.out.println("Player " + playerName + " has " + generatePlayersResources().getBrick() + " bricks");
        System.out.println("Player " + playerName + " has " + generatePlayersResources().getLumber() + " lumber");
        System.out.println("Player " + playerName + " has " + generatePlayersResources().getOre() + " ore");
        System.out.println("Player " + playerName + " has " + generatePlayersResources().getWool() + " wool");
        System.out.println("Player " + playerName + " has " + generatePlayersResources().getGrain() + " grain");
        System.out.println();
    }

    @Override
    public void showVictoryPoints() {
        System.out.println("Player " + playerName + " has " + getSumPoints() + " victory points");
        System.out.println();

    }

    private int getSumPoints() {
        return VictoryPointsCards.VILLAGE + VictoryPointsCards.VILLAGE + VictoryPointsCards.VILLAGE;
    }
}
