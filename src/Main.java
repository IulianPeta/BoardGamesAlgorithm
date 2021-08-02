public class Main {

    public static void main(String[] args) {
        System.out.println("Board games");

        Dice dice = new Dice();

        Dice.storeFirstDiceNumber = dice.rollDice();
        Dice.storeSecondDiceNumber = dice.rollDice();

        System.out.println("First dice number: "+ Dice.storeFirstDiceNumber);
        System.out.println("Second dice number: " + Dice.storeSecondDiceNumber);

        System.out.println( "The sum for both dices is: " + dice.sumFotBothDices());
    }
}
