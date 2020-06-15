package pets_amok;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        VirtualPetShelter myShelter = new VirtualPetShelter();
        VirtualPet organicDog = new OrganicDog("Javon", " our organic dog:");
        VirtualPet roboDog = new RoboticDog("Diego", " our robotic dog:");
        VirtualPet organicCat = new OrganicCat("Sammy", " our organic cat:");
        VirtualPet roboCat = new RoboticCat("Maria", " our robotic cat:");
        myShelter.admitPet(organicDog);
        myShelter.admitPet(organicCat);
        myShelter.admitPet(roboDog);
        myShelter.admitPet(roboCat);
        myShelter.retrieveAllPets();

        while (true) {
            System.out.println("Welcome to Sam's virtual pet shelter! With our recent influx of new pets and lack of staff ");
            System.out.println("members, the shelter has become very hard to manage. Follow the commands below to manage ");
            System.out.println("the shelter and keep the pets healthy.");
            System.out.println();
            myShelter.printAllPets();
            System.out.println("1. Feed organic pets");
            System.out.println("2. Give organic pets a drink");
            System.out.println("3. Play with a pet");
            System.out.println("4. Oil robotic pets");
            System.out.println("5. Perform maintenance on robotic pets");
            System.out.println("6. Let cats out");
            System.out.println("7. Walk dogs");
            System.out.println("8. Clean Dog Cage");
            System.out.println("9. Adopt pet from shelter");
            System.out.println("10. Admit organic dog");
            System.out.println("11. Admit organic cat");
            System.out.println("12. Admit robotic dog");
            System.out.println("13. Admit robotic cat");
            System.out.println("14. Quit game");
            Scanner scanner = new Scanner(System.in);
            int userSelection = scanner.nextInt();

            if (userSelection == 1) {
                myShelter.feedPets();
            } else if (userSelection == 2) {
                myShelter.waterPets();
            } else if (userSelection == 3) {
                System.out.println("Which pet do you want to play with? Please type the name: ");
                Scanner petScanner = new Scanner(System.in);
                String name = petScanner.nextLine();
                myShelter.playWithPet(name);
            }else if (userSelection == 4) {
                myShelter.oilPets();
            }else if (userSelection == 5) {
                myShelter.performMaintenance();
            }else if (userSelection == 6){
                myShelter.letCatOut();
            }else if (userSelection == 7) {
                myShelter.walkDog();
            } else if (userSelection == 8) {
                myShelter.cleanDogCage();
            } else if (userSelection == 9) {
                System.out.println("What is the name of the pet you want to adopt?");
                Scanner petScanner = new Scanner(System.in);
                String name = petScanner.nextLine();
                myShelter.removePet(name);
            } else if (userSelection == 10){
                System.out.println("Enter a name for the pet you want to add.");
                Scanner petScanner = new Scanner(System.in);
                String name = petScanner.nextLine();
                System.out.println("Enter a description for the pet you want to add.");
                String desc = petScanner.nextLine();
                OrganicDog pet = new OrganicDog(name, desc);
                myShelter.admitPet(pet);
            } else if (userSelection == 11){
                System.out.println("Enter a name for the pet you want to add.");
                Scanner petScanner = new Scanner(System.in);
                String name = petScanner.nextLine();
                System.out.println("Enter a description for the pet you want to add.");
                String desc = petScanner.nextLine();
                OrganicCat pet = new OrganicCat(name, desc);
                myShelter.admitPet(pet);
            }else if (userSelection == 12) {
                System.out.println("Enter a name for the pet you want to add.");
                Scanner petScanner = new Scanner(System.in);
                String name = petScanner.nextLine();
                System.out.println("Enter a description for the pet you want to add.");
                String desc = petScanner.nextLine();
                RoboticDog pet = new RoboticDog(name, desc);
                myShelter.admitPet(pet);
            } else if (userSelection == 13) {
                System.out.println("Enter a name for the pet you want to add.");
                Scanner petScanner = new Scanner(System.in);
                String name = petScanner.nextLine();
                System.out.println("Enter a description for the pet you want to add.");
                String desc = petScanner.nextLine();
                RoboticCat pet = new RoboticCat(name, desc);
                myShelter.admitPet(pet);
            } else if (userSelection == 14) {
                System.out.println("Game over.");
                break;
            }
            myShelter.tick();

        }











    }

}
