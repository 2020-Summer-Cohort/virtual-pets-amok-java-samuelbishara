package pets_amok;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class OrganicDogTest {
    @Test
    public void shouldCreateOrganicDogClass() {
        OrganicDog underTest = new OrganicDog("", "");
    }
    @Test
    public void shouldHaveDefaultCageFilth() {
        OrganicDog underTest = new OrganicDog("", "");
        int result = underTest.getCageFilth();
        assertEquals(result, 5);
    }
    @Test
    public void walkDogShouldIncreaseHealthBy1() {
        OrganicDog underTest = new OrganicDog("", "");
        underTest.walkDog();
        int result = underTest.getHealth();
        assertEquals(result, 6);
    }
    @Test
    public void cleanDogCageShouldDecreaseCageFilthBy4() {
        OrganicDog underTest = new OrganicDog("", "");
        underTest.cleanDogCage();
        int result = underTest.getCageFilth();
        assertEquals(result, 1);
    }
    @Test
    public void dogTickShouldIncreaseCageFilthBy1() {
        OrganicDog underTest = new OrganicDog("", "");
        underTest.dogTick();
        int result = underTest.getCageFilth();
        assertEquals(result, 6);
    }
}
