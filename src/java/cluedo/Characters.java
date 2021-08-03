package cluedo;

import java.util.Arrays;

public class Characters {

    private String[] charactersList;
    private String[][] missingCharacterList;
    private int missingCharacterListSize = 6;

    private String[] generateCharacterList() {
        charactersList = new String[6];

        charactersList[0] = "Peacock";
        charactersList[1] = "Scarlet";
        charactersList[2] = "Mustard";
        charactersList[3] = "Plum";
        charactersList[4] = "White";
        charactersList[5] = "Green";

        return charactersList;
    }

    private String[][] generateMissingCharacterList() {
        missingCharacterList = new String[6][2];

        for (int i = 0; i < missingCharacterListSize; i++) {
            missingCharacterList[i][0] = charactersList[i];
        }
        return missingCharacterList;
    }

    public void printCharacterList() {
        System.out.println(Arrays.toString(generateCharacterList()));
    }

    public void printMissingCharacterList() {
        System.out.println(Arrays.deepToString(generateMissingCharacterList()));
    }



}
