import java.util.Random;

public class Dice {

    public static int storeFirstDiceNumber;
    public static int storeSecondDiceNumber;

    private Random numbers;

    public int rollDice() {
        numbers = new Random();
        int diceNumber = numbers.nextInt(6) + 1;

        return diceNumber ;
    }

    public int sumFotBothDices() {
        return storeFirstDiceNumber + storeSecondDiceNumber;
    }
}
