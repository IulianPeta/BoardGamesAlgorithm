import java.util.Random;

public class Dice {

    public static int firstDiceNumber;
    public static int secondDiceNumber;

    private Random numbers;

    public int rollDice() {
        numbers = new Random();
        int diceNumber = numbers.nextInt(6) + 1;

        return diceNumber ;
    }

    public int sumForBothDices() {
        return firstDiceNumber + secondDiceNumber;
    }
}
