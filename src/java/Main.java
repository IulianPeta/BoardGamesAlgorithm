import cluedo.Guests;

public class Main {

    private Dice createDiceObject() {
        return new Dice();
    }
    private Guests createGuestsObject() {
        return new Guests();
    }

    public Main(){
        System.out.println("Board games");
        System.out.println("----------------------");

        Dice dice = createDiceObject();
        Guests guests = createGuestsObject();

        Dice.firstDiceNumber = dice.rollDice();
        Dice.secondDiceNumber = dice.rollDice();

        System.out.println("First dice number: "+ Dice.firstDiceNumber);
        System.out.println("Second dice number: " + Dice.secondDiceNumber);

        System.out.println( "The sum for both dices is: " + dice.sumForBothDices());
        System.out.println("----------------------");

        guests.printGuestsList();
        guests.printMissingGuestsList();
    }

    public static void main(String[] args) {
        new Main();
    }
}
