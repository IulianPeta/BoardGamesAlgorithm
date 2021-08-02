import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiceUnitTests {

    @Test
    public void checkRollDiceGetsNumberBetween1and6() {

        String  expected = "5";
        String  actual = "4";

        assertEquals(expected, actual);

    }
}
