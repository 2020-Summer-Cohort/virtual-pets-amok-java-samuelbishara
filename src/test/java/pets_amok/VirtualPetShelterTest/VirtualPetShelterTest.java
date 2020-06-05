package pets_amok.VirtualPetShelterTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pets_amok.VirtualPet;
import pets_amok.VirtualPetShelter;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetShelterTest {
    @Test
    public void shouldBeAbleToAddPet() {
        VirtualPet testPet = new VirtualPet("","");
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitPet(testPet);
        Collection<VirtualPet> pets = underTest.retrieveAllPets();
        assertThat(pets).containsOnlyOnce(testPet);
    }
    @Test
    public void shouldBeAbleToFeedAllPetsInShelter() {
        VirtualPet testPet = new VirtualPet("","");
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitPet(testPet);
        underTest.feedPets();
        assertEquals(2, testPet.getHunger());
    }

    @Test
    public void shouldBeAbleToWaterAllPetsInShelter() {
        VirtualPet testPet = new VirtualPet("","");
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitPet(testPet);
        underTest.waterPets();
        assertEquals(2, testPet.getThirst());
    }
    @Test
    public void shouldBeAbleToPlayWithAPet(){
        VirtualPet testPet = new VirtualPet("","");
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitPet(testPet);
        underTest.playWithPet("");
        assertEquals(2, testPet.getBoredom());
    }

}
