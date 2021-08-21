import catan.PlayerFactory;
import catan.TerrainHexes;
import cluedo.Guests;
import cluedo.Rooms;
import cluedo.Weapons;

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

    private TerrainHexes createTerrainHexesObject() {
        return new TerrainHexes();
    }

    private PlayerFactory createPlayerFactoryObject() {
        return new PlayerFactory();
    }


    public Main(String gameName) {

        if (gameName.equals("Cluedo")) {
            System.out.println("Board game: " + gameName);
            System.out.println("----------------------");

            Dice dice = createDiceObject();
            Guests guests = createGuestsObject();
            Weapons weapons = createWeaponsObject();
            Rooms rooms = createRoomsObject();

            Dice.firstDiceNumber = dice.rollDice();
            Dice.secondDiceNumber = dice.rollDice();

            System.out.println("First dice number: " + Dice.firstDiceNumber);
            System.out.println("Second dice number: " + Dice.secondDiceNumber);

            if (Dice.secondDiceNumber == 1) {
                System.out.println("Second dice is |?|");
            }

            System.out.println("The sum for both dices is: " + dice.sumForBothDices());
            System.out.println("----------------------");

            for (int i = 0; i < 7; i++) {
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

            weapons.addOwnerToMissingWeaponsList(0, "Wife");
            weapons.addOwnerToMissingWeaponsList(5, "Mine");
            weapons.addOwnerToMissingWeaponsList(3, "Found");

            weapons.showMissingWeaponsList();
            weapons.showPotentialCriminalWeapon();
            System.out.println("----------------------");

            rooms.generateRoomsList();
            rooms.generateMissingRoomsList();

            rooms.addOwnerToMissingRoomsList(0, "Mine");
            rooms.addOwnerToMissingRoomsList(2, "Wife");

            rooms.showMissingRoomsList();
            rooms.showPotentialRoom();
            System.out.println("----------------------");
        }

        if (gameName.equals("Catan")) {
            System.out.println("Board game: " + gameName);
            System.out.println("----------------------");

            Dice dice = createDiceObject();
            TerrainHexes terrainHexes = createTerrainHexesObject();
            PlayerFactory playerFactory = createPlayerFactoryObject();

            Dice.firstDiceNumber = dice.rollDice();
            Dice.secondDiceNumber = dice.rollDice();

            System.out.println("First dice number is: " + Dice.firstDiceNumber);
            System.out.println("Second dice number is: " + Dice.secondDiceNumber);

            System.out.println("The sum for both dices is: " + dice.sumForBothDices());
            System.out.println("----------------------");

            for (int i = 0; i < 7; i++) {
                System.out.println(" ");
            }

            System.out.println("----------------------");

            playerFactory.getInformationForEachPlayer();

            System.out.println("----------------------");

            terrainHexes.generateColoursList();
            terrainHexes.generateEmptyDiceNumbersList();
            terrainHexes.assignDiceNumberToTerrainHex(0, 12);
            terrainHexes.assignDiceNumberToTerrainHex(1, 10);
            terrainHexes.assignDiceNumberToTerrainHex(2, 10);
            terrainHexes.assignDiceNumberToTerrainHex(18, 7);
            terrainHexes.showTerrainHexesWithNumbers();
            System.out.println("----------------------");
            terrainHexes.showTerrainHexesForDiceNumber(dice.sumForBothDices());
        }
    }

    public static void main(String[] args) {
        new Main("Catan");
    }
}
