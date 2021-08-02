import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DiceUnitTests {

    private Dice createDiceObjet() {
        return new Dice();
    }

    @Test
    public void checkThat_RollDice_GetsNumberBetween_1_and_6() {

        final Dice dice = createDiceObjet();
        boolean actual = false;
        Dice.firstDiceNumber = dice.rollDice();

        if (Dice.firstDiceNumber > 0 && Dice.firstDiceNumber < 7) {
            actual = true;
        }

        assertTrue("The dice number should be more than 0 and less then 7 and it was: " + Dice.firstDiceNumber, actual);
    }

    @Test
    public void checkThat_TheSumForTwoDiceNumbers_Works(){
        final Dice dice = createDiceObjet();

        Dice.firstDiceNumber = dice.rollDice();
        Dice.secondDiceNumber = dice.rollDice();

        int actual = dice.sumForBothDices();
        int expected = Dice.firstDiceNumber + Dice.secondDiceNumber;

        assertEquals(expected, actual);
    }
}
