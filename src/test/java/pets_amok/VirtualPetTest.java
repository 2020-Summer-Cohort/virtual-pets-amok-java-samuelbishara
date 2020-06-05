package pets_amok;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class VirtualPetTest {

    private VirtualPet underTest;

    @BeforeEach
    void setUp() {
        underTest = new VirtualPet("");
    }

    @Test
    public void shouldHaveNameOnCreation(){
        String name = underTest.getName();
        assertEquals(name, name);
    }
    public void shouldHaveDefaultHealth(){
        int health = underTest.getHealth();
            assertEquals(5, health);
    }
    @Test
    public void shouldHaveDefaultHunger() {
        int hunger = underTest.getHunger();
        assertEquals(5, hunger);
    }

    @Test
    public void shouldHaveDefaultThirst(){
        int thirst = underTest.getThirst();
        assertEquals(5, thirst);

    }
    @Test
    public void shouldHaveDefaultBoredom(){
        int boredom = underTest.getBoredom();
        assertEquals(5, boredom);
    }
    @Test
    public void feedPetShouldLowerHungerBy3(){
        underTest.feedPets();
        int hunger = underTest.getHunger();
        assertEquals(2, hunger);
    }
    @Test
    public void waterPetShouldLowerThirstBy3(){
        underTest.waterPets();
        int thirst = underTest.getThirst();
        assertEquals(2, thirst);
    }
    @Test
    public void playWithPetShouldLowerBoredomBy3(){
        underTest.playWithPet();
        int boredom = underTest.getBoredom();
        assertEquals(2, boredom);
    }
    @Test
    public void tick1ShouldIncreaseHungerBy1(){
        underTest.tick1();
        int hunger = underTest.getHunger();
        assertEquals(6, hunger);
    }

}
