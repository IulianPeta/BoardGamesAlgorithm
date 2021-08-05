import cluedo.Guests;
import cluedo.Rooms;
import cluedo.Weapons;

import java.util.Arrays;

public class Main {

    private Dice createDiceObject() {
        return new Dice();
    }
    private Guests createGuestsObject() {
        return new Guests();
    }
    private Weapons createWeaponsObject() {
        return new Weapons();
    }
    private Rooms createRoomsObject() {
        return new Rooms();
    }

    public Main(){
        System.out.println("Board games");
        System.out.println("----------------------");

        Dice dice = createDiceObject();
        Guests guests = createGuestsObject();
        Weapons weapons = createWeaponsObject();
        Rooms rooms = createRoomsObject();

        Dice.firstDiceNumber = dice.rollDice();
        Dice.secondDiceNumber = dice.rollDice();

        System.out.println("First dice number: "+ Dice.firstDiceNumber);
        System.out.println("Second dice number: " + Dice.secondDiceNumber);

        if (Dice.secondDiceNumber == 1) {
            System.out.println("Second dice is |?|");
        }

        System.out.println( "The sum for both dices is: " + dice.sumForBothDices());
        System.out.println("----------------------");

        for(int i = 0; i < 7; i++) {
            System.out.println(" ");
        }

        guests.generateGuestsList();
        guests.generateMissingGuestsList();

        guests.addOwnerToMissingGuestList(0, "Mine");
        guests.addOwnerToMissingGuestList(1, "Wife");
        guests.addOwnerToMissingGuestList(4, "Found");

        guests.showMissingGuestList();
        guests.showPotentialCriminal();
        System.out.println("----------------------");

        weapons.generateWeaponsList();
        weapons.generateMissingWeaponsList();
        System.out.println(Arrays.deepToString(weapons.fillMissingWeaponsList()));
        weapons.showPotentialCriminalWeapon();
        System.out.println("----------------------");

        rooms.generateRoomsList();
        rooms.generateMissingRoomsList();
        System.out.println(Arrays.deepToString(rooms.fillMissingRoomsList()));
        rooms.showPotentialRoom();
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        new Main();
    }
}
