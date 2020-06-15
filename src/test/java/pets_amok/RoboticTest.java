package pets_amok;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class RoboticTest {
    @Test
    public void shouldCreateRoboticClass() {
        Robotic underTest = new Robotic("", "");
    }
    @Test
    public void shouldHaveDefaultOilLevel() {
        Robotic underTest = new Robotic("", "");
        int result = underTest.getOilLevel();
        assertEquals(result, 5);
    }
    @Test
    public void shouldHaveDefaultMaintenance() {
        Robotic underTest = new Robotic("", "");
        int result = underTest.getMaintenance();
        assertEquals(result, 5);
    }
    @Test
    public void oilPetsShouldIncreaseOilBy4() {
        Robotic underTest = new Robotic("", "");
        underTest.oilPets();
        int result = underTest.getOilLevel();
        assertEquals(result, 9);
    }
    @Test
    public void performMaintenanceShouldIncreaseMaintenanceBy4() {
        Robotic underTest = new Robotic("", "");
        underTest.performMaintenance();
        int result = underTest.getMaintenance();
        assertEquals(result, 9);
    }
    @Test
    public void tickShouldDecreaseOilBy1() {
        Robotic underTest = new Robotic("", "");
        underTest.tick();
        int result = underTest.getOilLevel();
        assertEquals(result, 4);
    }
}
