package pets_amok;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class OrganicTest {
    @Test
    public void shouldCreateOrganicClass() {
        Organic underTest = new Organic("", "");
    }
    @Test
    public void shouldHaveDefaultHunger() {
        Organic underTest = new Organic("", "");
        int result = underTest.getHunger();
        assertEquals(result, 5);
    }
    @Test
    public void shouldHaveDefaultThirst() {
        Organic underTest = new Organic("", "");
        int result = underTest.getThirst();
        assertEquals(result, 5);
    }
    @Test
    public void playWithPetShouldLowerHungerBy4() {
        Organic underTest = new Organic("", "");
        underTest.feedPets();
        int result = underTest.getHunger();
        assertEquals(result, 1);
    }
    @Test
    public void playWithPetShouldLowerThirstBy4() {
        Organic underTest = new Organic("", "");
        underTest.waterPets();
        int result = underTest.getThirst();
        assertEquals(result, 1);
    }
    @Test
    public void tickShouldIncreaseHungerBy1() {
        Organic underTest = new Organic("", "");
        underTest.tick();
        int result = underTest.getHunger();
        assertEquals(result, 6);
    }

}
