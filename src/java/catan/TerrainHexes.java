package catan;

public class TerrainHexes {

    private String[] terrainHexesList;
    private int[] diceNumberList;
    private final int TERRAIN_HEXES_LIST_SIZE = 19;

    public void generateColoursList() {
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
            if(i > 11 == i < 15) {
                terrainHexesList[i] = "Mountains (Ore Resource)";
            }
            if(i > 14 == i < 18) {
                terrainHexesList[i] = "Hills (Brick Resource)";
            }
            if(i == 18) {
                terrainHexesList[i] = "Desert (No Resource)";
            }
        }
    }

    public void generateEmptyDiceNumbersList() {
        diceNumberList = new int[TERRAIN_HEXES_LIST_SIZE];
    }

    public void assignDiceNumberToTerrainHex(int terrainHexesOrder, int diceNumber) {
        diceNumberList[terrainHexesOrder] = diceNumber;
    }

    public void showTerrainHexesWithNumbers() {
        System.out.println("The terrain hexes with numbers are: ");

        for (int i = 0; i < TERRAIN_HEXES_LIST_SIZE; i++) {
                System.out.print(" | " + terrainHexesList[i] + " has number "  + diceNumberList[i] + " | ");
                System.out.println(" ");
        }
    }

    public void showTerrainHexesForDiceNumber(int diceNumber) {
        System.out.println("The terrain hexes with the dice number are: ");
        for (int i = 0; i < TERRAIN_HEXES_LIST_SIZE; i++) {
            if(diceNumberList[i] == diceNumber) {
                System.out.print(" | " + terrainHexesList[i] + " has number "  + diceNumberList[i] + " | ");
                System.out.println(" ");
            }
        }
    }
}


