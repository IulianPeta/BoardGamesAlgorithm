package catan.polymorphism;

import catan.PlayerResources;
import catan.VictoryPointsCards;

public class BluePlayer implements PlayerInterface {

    private final String playerName;

    private PlayerResources createPlayerResourcesObject() {
        return new PlayerResources();
    }

    public BluePlayer(String playerName) {
        this.playerName = playerName;
    }

    private PlayerResources generatePlayersResources() {
        PlayerResources playerResources = createPlayerResourcesObject();

        playerResources.setBrick(6);
        playerResources.setGrain(2);
        playerResources.setLumber(0);
        playerResources.setOre(4);
        playerResources.setWool(7);

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
        return VictoryPointsCards.VILLAGE + VictoryPointsCards.CITY;
    }
}
