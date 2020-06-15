package pets_amok;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class OrganicCatTest {
    @Test
    public void shouldCreateOrganicCatClass() {
        OrganicCat underTest = new OrganicCat("", "");
    }
    @Test
    public void letCatOutShouldIncreaseHealthBy3() {
        OrganicCat underTest = new OrganicCat("", "");
        underTest.letCatOut();
        int result = underTest.getHealth();
        assertEquals(result, 8);
    }
}
