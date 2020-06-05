package pets_amok.VirtualPetShelterTest;
import org.junit.jupiter.api.Test;
import pets_amok.OrganicCat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicCatTest {

    @Test
    public void shouldHaveDefaultWaste(){
        OrganicCat underTest = new OrganicCat("","");
        int waste = underTest.getWaste();
        assertEquals(5, waste);
    }
    @Test
    public void shouldLowerWasteBy3(){
        OrganicCat underTest = new OrganicCat("","");
        underTest.letCatOut();
        int waste = underTest.getWaste();
        assertEquals(2, waste);
    }





}
