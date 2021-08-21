package catan.polymorphism;

import catan.PlayerResources;

public class WhitePlayer implements PlayerInterface{

    private final String playerName;

    private PlayerResources createPlayerResourcesObject() {
        return new PlayerResources();
    }

    public WhitePlayer(String playerName) {
        this.playerName = playerName;
    }

    private PlayerResources generatePlayersResources() {
        PlayerResources playerResources = createPlayerResourcesObject();

        playerResources.setBrick(10);
        playerResources.setGrain(10);
        playerResources.setLumber(7);
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
}