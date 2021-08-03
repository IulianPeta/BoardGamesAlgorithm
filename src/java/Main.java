import cluedo.Guests;
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

    public Main(){
        System.out.println("Board games");
        System.out.println("----------------------");

        Dice dice = createDiceObject();
        Guests guests = createGuestsObject();
        Weapons weapons = createWeaponsObject();

        Dice.firstDiceNumber = dice.rollDice();
        Dice.secondDiceNumber = dice.rollDice();

        System.out.println("First dice number: "+ Dice.firstDiceNumber);
        System.out.println("Second dice number: " + Dice.secondDiceNumber);

        if (Dice.secondDiceNumber == 1) {
            System.out.println("Second dice is |?|");
        }

        System.out.println( "The sum for both dices is: " + dice.sumForBothDices());
        System.out.println("----------------------");

        guests.generateGuestsList();
        guests.generateMissingGuestsList();
        System.out.println(Arrays.deepToString(guests.fillMissingGuestsList()));
        guests.showPotentialCriminal();
        System.out.println("----------------------");

        weapons.generateWeaponsList();
        weapons.generateMissingWeaponsList();
        System.out.println(Arrays.deepToString(weapons.fillMissingWeaponsList()));
        weapons.showPotentialCriminalWeapon();
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        new Main();
    }
}
