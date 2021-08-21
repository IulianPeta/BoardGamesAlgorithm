package catan;

public class PlayerFactory {

    private Player createPlayerObject() {
        return new Player();
    }
    private PlayerResources createPlayerResourcesObject() {
        return new PlayerResources();
    }

    private Player generatePlayers() {
        Player player = createPlayerObject();

        player.generatePlayersList();
        player.assignPlayerToColour(Colour.BLUE,"Me");
        player.assignPlayerToColour(Colour.WHITE,"Sister");
        player.assignPlayerToColour(Colour.RED,"Brother");
        player.assignPlayerToColour(Colour.ORANGE,"Missing");

        return player;
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


    public void getResourcesForEachPlayer() {
        generatePlayers().showPlayers();

        System.out.println();

        System.out.println(generatePlayersResources().getBrick() + " bricks");
        System.out.println(generatePlayersResources().getLumber() + " lumber");
        System.out.println(generatePlayersResources().getOre() + " ore");
        System.out.println(generatePlayersResources().getWool() + " wool");
        System.out.println(generatePlayersResources().getGrain() + " grain");
    }
}
