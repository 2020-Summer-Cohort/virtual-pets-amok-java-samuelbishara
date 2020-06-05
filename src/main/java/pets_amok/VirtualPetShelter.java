package pets_amok;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class VirtualPetShelter {
    HashMap<String, VirtualPet> myPets = new HashMap<>();

    /*public void printPets() {
        for (VirtualPet pet: myPets){

        }
    }
 /*       Iterator<VirtualPet> it = myPets.iterator();
        while (true){
            if (myPets instanceof OrganicDog) {
                System.out.println("");
                VirtualPet pet1 = it.next();
                System.out.println(pet1.name + pet1.description + pet1.getHunger() + pet1.getThirst() + pet1.get);
            }
        VirtualPet pet2 = it.next();
        System.out.println(pet2.name + pet2.description);
        VirtualPet pet3 = it.next();
        System.out.println(pet3.name + pet3.description);
        VirtualPet pet4 = it.next();
        System.out.println(pet4.name + pet4.description);
   */

    public Collection<VirtualPet> retrieveAllPets() {
        return myPets;
    }
    public void admitPet(VirtualPet pet){
        myPets.put(pet.getName(), pet);
    }

    public void removePet(VirtualPet name) {
        for (VirtualPet pet : myPets) {
            if (pet.getName().equals(name)){
                myPets.remove(pet);
            }
        }
    }
    public void feedPets() {
        for (VirtualPet pet: myPets){
            pet.feedPets();
        }
    }
    public void waterPets(){
        for (VirtualPet pet: myPets){
            pet.waterPets();
        }
    }
    public void playWithPet(String name) {
        for (VirtualPet pet : myPets) {
            if (pet.getName().equals(name)) {
                pet.playWithPet();
            }
        }
    }

    }

