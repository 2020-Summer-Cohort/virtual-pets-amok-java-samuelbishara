package pets_amok.VirtualPetShelterTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pets_amok.OrganicDog;
import pets_amok.VirtualPet;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OrganicDogTest {


        @Test
        public void shouldHaveDefaultCageCleanliness() {
            OrganicDog underTest = new OrganicDog("");
            int cageCleanliness = underTest.getCageCleanliness();
            assertEquals(5, cageCleanliness);
        }
        @Test
        public void shouldHaveDefaultWaste(){
            OrganicDog underTest = new OrganicDog("");
            int waste = underTest.getWaste();
            assertEquals(5, waste);
        }
        @Test
        public void shouldLowerWasteBy3(){
            OrganicDog underTest = new OrganicDog("");
            underTest.walkDog();
            int waste = underTest.getWaste();
            assertEquals(2, waste);
         }



}
