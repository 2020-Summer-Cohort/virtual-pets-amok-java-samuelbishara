package pets_amok;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboticDogTest {


    @Test
    public void shouldHaveDefaultMaintenance() {
        RoboticDog underTest = new RoboticDog("");
        int maintenance = underTest.getMaintenance();
        assertEquals(5, maintenance);
    }
    @Test
    public void shouldHaveDefaultRust() {
        RoboticDog underTest = new RoboticDog("");
        int rust = underTest.getRust();
        assertEquals(5, rust);
    }
    @Test
    public void shouldHaveDefaultBatteryLevel(){
        RoboticDog underTest = new RoboticDog("");
        int batteryLevel = underTest.getBatteryLevel();
        assertEquals(5, batteryLevel);
    }
    @Test
    public void playWithPetShouldLowerMaintenanceBy3(){
        RoboticDog underTest = new RoboticDog("");
        underTest.performRepairs();
        int maintenance = underTest.getMaintenance();
        assertEquals(2, maintenance);
    }
    @Test
    public void playWithPetShouldRaiseBatteryLevelBy3() {
        RoboticDog underTest = new RoboticDog("");
        underTest.chargePets();
        int batteryLevel = underTest.getBatteryLevel();
        assertEquals(8, batteryLevel);
    }
    @Test
    public void playWithPetShouldLowerRustBy3() {
        RoboticDog underTest = new RoboticDog("");
        underTest.oilPets();
        int rust = underTest.getRust();
        assertEquals(2, rust);
    }





}
