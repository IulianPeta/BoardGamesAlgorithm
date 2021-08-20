import cluedo.Guests;
import cluedo.Rooms;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RoomsUnitTests {

    private final String expectedOwnerOfRooms;
    private final String actualOwnerOfRooms;

    public RoomsUnitTests(String expectedOwnerOfRooms, String actualOwnerOfRooms) {
        this.expectedOwnerOfRooms = expectedOwnerOfRooms;
        this.actualOwnerOfRooms = actualOwnerOfRooms;
    }

    private static Rooms createRoomsObject() {
        return new Rooms();
    }

    @Parameterized.Parameters(name = "running test with expected owner of rooms = {0} with actual owner if rooms = {1}")
    public static Collection addOwnersOfRooms() {
        final Rooms rooms = createRoomsObject();

        rooms.generateRoomsList();
        rooms.generateMissingRoomsList();

        rooms.addOwnerToMissingRoomsList(0, "Mine");
        rooms.addOwnerToMissingRoomsList(1, "Wife");

        return Arrays.asList(new Object[][]{
                {"Mine", rooms.getOwnerFromRoomsList(0)},
                {"Wife", rooms.getOwnerFromRoomsList(1)},
        });
    }

    @Test
    public void checkThatAddOwner_ToMissingRoomsList_Works() {

        assertEquals(expectedOwnerOfRooms, actualOwnerOfRooms);
    }
}
