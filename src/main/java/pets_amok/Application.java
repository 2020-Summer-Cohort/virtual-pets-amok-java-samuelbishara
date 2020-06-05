package pets_amok;

import java.util.ArrayList;
import java.util.Collection;

public class Application {

    public static void main(String[] args) {
        VirtualPetShelter myShelter = new VirtualPetShelter();
        VirtualPet organicDog = new OrganicDog("Javon", " our organic dog.");
        VirtualPet roboDog = new RoboticDog("Diego", " our robotic dog.");
        VirtualPet organicCat = new OrganicCat("Sammy", " our organic cat.");
        VirtualPet roboCat = new RoboticCat("Maria", " our robotic cat.");
        myShelter.admitPet(organicDog);
        myShelter.admitPet(organicCat);
        myShelter.admitPet(roboDog);
        myShelter.admitPet(roboCat);
       // myShelter.printPets();








    }

}
