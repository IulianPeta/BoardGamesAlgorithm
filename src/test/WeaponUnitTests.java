import cluedo.Weapons;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class WeaponUnitTests {

    private final String expectedOwnerOfWeapon;
    private final String actualOwnerOfWeapon;

    public WeaponUnitTests(String expectedOwnerOfWeapon, String actualOwnerOfWeapon) {
        this.expectedOwnerOfWeapon = expectedOwnerOfWeapon;
        this.actualOwnerOfWeapon = actualOwnerOfWeapon;
    }

    private static Weapons createWeaponsObject() {
        return new Weapons();
    }

    @Parameterized.Parameters(name = "running test with expected owner of weapon = {0} with actual owner if weapon = {1}")
    public static Collection addOwnersOfWeapons() {
        final Weapons weapons = createWeaponsObject();

        weapons.generateWeaponsList();
        weapons.generateMissingWeaponsList();

        weapons.addOwnerToMissingWeaponsList(0, "Mine");
        weapons.addOwnerToMissingWeaponsList(1, "Wife");

        return Arrays.asList(new Object[][]{
                {"Mine", weapons.getOwnerFromWeaponsList(0)},
                {"Wife", weapons.getOwnerFromWeaponsList(1)},
        });
    }

    @Test
    public void checkThatAddOwner_ToMissingRoomsList_Works() {

        assertEquals(expectedOwnerOfWeapon, actualOwnerOfWeapon);
    }
}
