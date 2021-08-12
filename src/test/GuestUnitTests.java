import cluedo.Guests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GuestUnitTests {

    private final String expectedOwnerOfGuests;
    private final String actualOwnerOfGuests;

    public GuestUnitTests(String expectedOwnerOfGuests, String actualOwnerOfGuests) {
        this.expectedOwnerOfGuests = expectedOwnerOfGuests;
        this.actualOwnerOfGuests = actualOwnerOfGuests;
    }

    private static Guests createGuestsObject() {
        return new Guests();
    }

    @Parameterized.Parameters(name = "running test with expected owner of guests = {0} with actual owner if guests = {1}")
    public static Collection addOwnersOfGuests() {
        final Guests guest = createGuestsObject();

        guest.generateGuestsList();
        guest.generateMissingGuestsList();

        guest.addOwnerToMissingGuestList(0, "Mine");
        guest.addOwnerToMissingGuestList(1, "Wife");

        return Arrays.asList(new Object[][]{
                {"Mine", guest.getOwnerFromGuestList(0)},
                {"Wife", guest.getOwnerFromGuestList(1)},
        });
    }

    @Test
    public void checkThatAddOwner_ToMissingGuestList_Works() {

        assertEquals(expectedOwnerOfGuests, actualOwnerOfGuests);
    }
}
