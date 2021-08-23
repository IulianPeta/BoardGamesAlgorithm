package catan.polymorphism;

import catan.PlayerResources;

public class PlayerInformation implements PlayerInterface {

    private final String playerName;
    private final int brick;
    private final int grain;
    private final int lumber;
    private final int ore;
    private final int wool;
    private final int victoryPoints;


    private PlayerResources createPlayerResourcesObject() {
        return new PlayerResources();
    }

    public PlayerInformation(String playerName, int brick, int grain, int lumber, int ore, int wool, int victoryPoints) {
        this.playerName = playerName;
        this.brick = brick;
        this.grain = grain;
        this.lumber = lumber;
        this.ore = ore;
        this.wool = wool;
        this.victoryPoints = victoryPoints;
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
    public void showVictoryPoints() throws Exception {
        System.out.println("Player " + playerName + " has " + getVictoryPoints(victoryPoints) + " victory points");
        System.out.println();
    }

    private int getVictoryPoints(int victoryPoints) throws Exception {
        if (victoryPoints > 10) {
            throw new Exception("The player can't have more than 10 points and " + playerName + " has " + victoryPoints);
        } else{
            return victoryPoints;
        }
    }
}
