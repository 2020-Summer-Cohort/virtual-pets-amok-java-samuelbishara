package pets_amok;

public abstract class Organic extends VirtualPet {

    public Organic(String name, String description) {
        super(name, description);
        this.hunger = 5;
        this.thirst = 5;
    }
    protected int hunger;
    protected int thirst;

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }
    public void feedPets(){
        hunger -= 3;
    }
    public void waterPets(){
        thirst -= 3;
    }

}
