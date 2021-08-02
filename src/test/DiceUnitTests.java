import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DiceUnitTests {

    private Dice createDiceObjet() {
        return new Dice();
    }

    @Test
    public void checkThat_RollDice_GetsNumberBetween1and6() {

        final Dice dice = createDiceObjet();
        boolean actual = false;
        Dice.storeFirstDiceNumber = dice.rollDice();

        if (Dice.storeFirstDiceNumber > 0 && Dice.storeFirstDiceNumber < 7) {
            actual = true;
        }

        assertTrue("The dice number should be more than 0 and less then 7 and it was: " + Dice.storeFirstDiceNumber, actual);
    }
}
