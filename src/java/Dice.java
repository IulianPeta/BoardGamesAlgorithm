import java.util.Random;

public class Dice {

    public static int firstDiceNumber;
    public static int secondDiceNumber;

    public int rollDice() {
        Random numbers = new Random();

        return numbers.nextInt(6) + 1;
    }

    public int sumForBothDices() {
        return firstDiceNumber + secondDiceNumber;
    }
}
