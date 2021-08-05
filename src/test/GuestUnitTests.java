import cluedo.Guests;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestUnitTests {

    private Guests createGuestsObject() {
        return new Guests();
    }

    @Test
    public void checkThatAddOwner_ToMissingGuestList_Works() {
        final Guests guest = createGuestsObject();
        String [][] expected = new String[6][2];
        String[][] actual = new String[6][2];

        guest.generateGuestsList();
        guest.generateMissingGuestsList();
        guest.addOwnerToMissingGuestList(0, "Mine");
        guest.addOwnerToMissingGuestList(1, "Wife");

        actual[0][1] = guest.showOwnerFromGuestList(0);
        actual[1][1] = guest.showOwnerFromGuestList(1);

        expected[0][1] = "mine";
        expected[1][1] = "Wife";

        assertEquals(expected[1][1], actual[1][1]);
        assertEquals(expected[0][1], actual[0][1]);
    }
}
