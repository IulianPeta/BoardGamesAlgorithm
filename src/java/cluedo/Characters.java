package cluedo;

import java.util.Arrays;

public class Characters {

    private String[] charactersList;

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

    public void printCharacterList() {
        System.out.println(Arrays.toString(generateCharacterList()));
    }

}
