package catan;

public class TerrainHexes {

    private String[] terrainHexesList;
    private String[][] diceNumberList;
    private final int TERRAIN_HEXES_LIST_SIZE = 19;

    private String[] generateColoursList() {
        terrainHexesList = new String[TERRAIN_HEXES_LIST_SIZE];

        for(int i = 0; i < TERRAIN_HEXES_LIST_SIZE; i++) {
            if(i < 4) {
                terrainHexesList[i] = "Fields (Grain Resource)";
            }

            if(i > 3 == i < 8) {
                terrainHexesList[i] = "Forest (Lumber Resource)";
            }

            if(i > 7 == i < 12) {
                terrainHexesList[i] = "Pasture (Wool Resource)";
            }
        }

        return terrainHexesList;
    }

    public String[][] generateDiceNumbersList() {
        generateColoursList();
        diceNumberList = new String[TERRAIN_HEXES_LIST_SIZE][2];

        for (int i = 0; i < TERRAIN_HEXES_LIST_SIZE; i++) {
            diceNumberList[i][0] = terrainHexesList[i];

            if (diceNumberList[i][1] == null) {
                diceNumberList[i][1] = "Missing";
            }
        }
        return diceNumberList;
    }

    public void showTerrainHexesWithNumbers() {
        System.out.println("The terrain hexes with numbers are: ");

        for (int i = 0; i < TERRAIN_HEXES_LIST_SIZE; i++) {
            if (diceNumberList[i][1].equals("Missing")) {
                System.out.print(" | " + diceNumberList[i][0] + " has number "  + diceNumberList[i][1] + " | ");
                System.out.println(" ");
            }
        }
    }

}
