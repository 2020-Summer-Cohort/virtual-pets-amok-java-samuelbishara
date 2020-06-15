package pets_amok;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {


    @Test
    public void createVirtualPetClass(){
        VirtualPet underTest = new VirtualPet("", "");
    }
    @Test
    public void feedPetsShouldLowerBoredomBy5() {
        VirtualPet underTest = new VirtualPet("", "");
        underTest.playWithPet();
        int result = underTest.getBoredom();
        assertEquals(result, 0);
    }
    @Test
    public void shouldHaveDefaultBoredom() {
        VirtualPet underTest = new VirtualPet("", "");
        int result = underTest.getBoredom();
        assertEquals(result, 5);
    }
    @Test
    public void shouldHaveDefaultHealth() {
        VirtualPet underTest = new VirtualPet("", "");
        int result = underTest.getHealth();
        assertEquals(result, 5);
    }
    @Test
    public void shouldHaveDefaultHappiness() {
        VirtualPet underTest = new VirtualPet("", "");
        int result = underTest.getHappiness();
        assertEquals(result, 5);
    }


}
