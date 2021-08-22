package catan.polymorphism;

import catan.PlayerResources;
import catan.VictoryPointsCards;

public class RedPlayer implements PlayerInterface {

    private final String playerName;
    private final int brick;
    private final int grain;
    private final int lumber;
    private final int ore;
    private final int wool;

    private PlayerResources createPlayerResourcesObject() {
        return new PlayerResources();
    }

    public RedPlayer(String playerName, int brick, int grain, int lumber, int ore, int wool) {
        this.playerName = playerName;
        this.brick = brick;
        this.grain = grain;
        this.lumber = lumber;
        this.ore = ore;
        this.wool = wool;
    }

    private PlayerResources generatePlayersResources() {
        PlayerResources playerResources = createPlayerResourcesObject();

        playerResources.setBrick(brick);
        playerResources.setGrain(grain);
        playerResources.setLumber(lumber);
        playerResources.setOre(ore);
        playerResources.setWool(wool);

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
