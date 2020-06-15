package pets_amok;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class VirtualPetShelter {
    HashMap<String, VirtualPet> myPets = new HashMap<>();

    public VirtualPetShelter() {
        myPets.put("Javon", new OrganicDog("Javon", "our organic dog:"));
        myPets.put("Diego", new RoboticDog("Diego", "our robotic dog:"));
        myPets.put("Sammy", new OrganicCat("Sammy", "our organic cat:"));
        myPets.put("Maria", new RoboticCat("Maria", "our robotic cat:"));
    }

    public HashMap<String, VirtualPet> retrieveAllPets() {
        return myPets;
    }

    public void printAllPets() {
        for (VirtualPet pet : myPets.values()) {
            if (pet instanceof OrganicDog) {
                System.out.println("                      Hunger   Thirst Boredom Health Happiness CgFilth");
                System.out.println(pet.getName() + pet.getDescription() + "|      " + ((OrganicDog) pet).getHunger() + "|      " + ((OrganicDog) pet).getThirst() + "|      " + pet.getBoredom() + "|     " + pet.getHealth() + "|     " + pet.getHappiness() + "|     " + ((OrganicDog) pet).getCageFilth());
            } else if (pet instanceof OrganicCat) {
                System.out.println("                      Hunger   Thirst Boredom Health Happiness");
                System.out.println(pet.getName() + pet.getDescription() + "|      " + ((OrganicCat) pet).getHunger() + "|      " + ((OrganicCat) pet).getThirst() + "|      " + pet.getBoredom() + "|     " + pet.getHealth() + "|     " + pet.getHappiness());
            } else if (pet instanceof RoboticDog) {
                System.out.println("                      Oil     Maint   Boredom Health Happiness");
                System.out.println(pet.getName() + pet.getDescription() + "|      " + ((RoboticDog) pet).getOilLevel() + "|      " + ((RoboticDog) pet).getMaintenance() + "|      " + pet.getBoredom() + "|     " + pet.getHealth() + "|     " + pet.getHappiness());
            } else if (pet instanceof RoboticCat) {
                System.out.println("                      Oil     Maint   Boredom Health Happiness");
                System.out.println(pet.getName() + pet.getDescription() + "|      " + ((RoboticCat) pet).getOilLevel() + "|      " + ((RoboticCat) pet).getMaintenance() + "|      " + pet.getBoredom() + "|     " + pet.getHealth() + "|     " + pet.getHappiness());
            }
        }
    }

    public void admitPet(VirtualPet pet) {
        myPets.put(pet.getName(), pet);
    }

    public void removePet(String name) {
        myPets.remove(name);


    }

    public void feedPets() {
        for (VirtualPet pet : myPets.values()) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).feedPets();
            } else if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).feedPets();
            }
        }
    }

    public void waterPets() {
        for (VirtualPet pet : myPets.values()) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).waterPets();
            } else if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).waterPets();
            }
        }
    }

    public void oilPets() {
        for (VirtualPet pet : myPets.values()) {
            if (pet instanceof RoboticDog) {
                ((RoboticDog) pet).oilPets();
            } else if (pet instanceof RoboticCat) {
                ((RoboticCat) pet).oilPets();
            }
        }
    }

    public void letCatOut() {
        for (VirtualPet pet : myPets.values()) {
            if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).letCatOut();
            }
        }
    }

    public void performMaintenance() {
        for (VirtualPet pet : myPets.values()) {
            if (pet instanceof RoboticDog) {
                ((RoboticDog) pet).performMaintenance();
            } else if (pet instanceof RoboticCat) {
                ((RoboticCat) pet).performMaintenance();
            }
        }
    }

    public void walkDog() {
        for (VirtualPet pet : myPets.values()) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).walkDog();
            }
        }
    }

    public void cleanDogCage() {
        for (VirtualPet pet : myPets.values()) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).cleanDogCage();
            }
        }
    }

    public void playWithPet(String name) {
        myPets.get(name).playWithPet();
    }

    public void tick() {
        for (VirtualPet pet : myPets.values()) {
            if (pet instanceof RoboticDog) {
                ((RoboticDog) pet).tick();
            } else if (pet instanceof RoboticCat) {
                ((RoboticCat) pet).tick();
            } else if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).tick();
            } else if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).dogTick();
            }
        }
    }
}




