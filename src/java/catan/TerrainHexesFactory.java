package catan;

public class TerrainHexesFactory {

    private TerrainHexes createTerrainHexesObject() {
        return new TerrainHexes();
    }

    public void getInformationForTerrainHexes(int diceSumNumber) {
        TerrainHexes terrainHexes = createTerrainHexesObject();

        terrainHexes.generateColoursList();
        terrainHexes.generateEmptyDiceNumbersList();
        terrainHexes.assignDiceNumberToTerrainHex(0, 5);
        terrainHexes.assignDiceNumberToTerrainHex(1, 9);
        terrainHexes.assignDiceNumberToTerrainHex(2, 10);
        terrainHexes.assignDiceNumberToTerrainHex(3, 11);
        terrainHexes.assignDiceNumberToTerrainHex(4, 6);
        terrainHexes.assignDiceNumberToTerrainHex(5, 2);
        terrainHexes.assignDiceNumberToTerrainHex(6, 4);
        terrainHexes.assignDiceNumberToTerrainHex(7, 11);
        terrainHexes.assignDiceNumberToTerrainHex(8, 3);
        terrainHexes.assignDiceNumberToTerrainHex(9, 12);
        terrainHexes.assignDiceNumberToTerrainHex(10, 5);
        terrainHexes.assignDiceNumberToTerrainHex(11, 8);
        terrainHexes.assignDiceNumberToTerrainHex(12, 6);
        terrainHexes.assignDiceNumberToTerrainHex(13, 9);
        terrainHexes.assignDiceNumberToTerrainHex(14, 10);
        terrainHexes.assignDiceNumberToTerrainHex(15, 4);
        terrainHexes.assignDiceNumberToTerrainHex(16, 8);
        terrainHexes.assignDiceNumberToTerrainHex(17, 3);
        terrainHexes.assignDiceNumberToTerrainHex(18, 7);
        System.out.println("----------------------");
        terrainHexes.showTerrainHexesForDiceNumber(diceSumNumber);
    }
}
