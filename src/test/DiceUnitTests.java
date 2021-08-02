import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DiceUnitTests {

    @Test
    public void checkRollDiceGetsNumberBetween1and6() {

        String  expected = "5";
        String  actual = "4";

        assertEquals(expected, actual);
    }
}
