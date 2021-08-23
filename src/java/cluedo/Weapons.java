package cluedo;

import java.util.Arrays;

public class Weapons {

    private String[] weaponsList;
    private String[][] missingWeaponsList;
    private final int WEAPONS_LIST_SIZE = 9;

    public String[] generateWeaponsList() {
        weaponsList = new String[WEAPONS_LIST_SIZE];

        weaponsList[0] = "Knife";
        weaponsList[1] = "Candlestick";
        weaponsList[2] = "Pistol";
        weaponsList[3] = "Poison";
        weaponsList[4] = "Trophy";
        weaponsList[5] = "Rope";
        weaponsList[6] = "Bat";
        weaponsList[7] = "Axe";
        weaponsList[8] = "Dumbbell";

        return weaponsList;
    }

    public String[][] generateMissingWeaponsList() {
        missingWeaponsList = new String[WEAPONS_LIST_SIZE][2];

        for (int i = 0; i < WEAPONS_LIST_SIZE; i++) {
            missingWeaponsList[i][0] = weaponsList[i];

            if (missingWeaponsList[i][1] == null) {
                missingWeaponsList[i][1] = "Missing";
            }
        }

        return missingWeaponsList;
    }

    public String getOwnerFromWeaponsList(int guestOrder) {

        return missingWeaponsList[guestOrder][1];
    }

    public String[][] addOwnerToMissingWeaponsList(int weaponOrder, String ownerOfGuest) {

        missingWeaponsList[weaponOrder][1] = ownerOfGuest;

        return missingWeaponsList;
    }

    public void showMissingWeaponsList() {
        System.out.println(Arrays.deepToString(missingWeaponsList));
    }

    public void showPotentialCriminalWeapon() {
        System.out.println("The potential criminal weapon is: ");

        for (int i = 0; i < WEAPONS_LIST_SIZE; i++) {
            if (missingWeaponsList[i][1].equals("Found")) {
                System.out.print(" | " + missingWeaponsList[i][0] + " | ");
                System.out.println(" ");
                return;
            }
        }

        for (int i = 0; i < WEAPONS_LIST_SIZE; i++) {
            if (missingWeaponsList[i][1].equals("Missing")) {
                System.out.print(" | " + missingWeaponsList[i][0] + " | ");
            }
        }
        System.out.println(" ");
    }
}
