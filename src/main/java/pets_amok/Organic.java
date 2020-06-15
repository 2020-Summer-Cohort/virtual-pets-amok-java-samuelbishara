package pets_amok;

public class Organic extends VirtualPet {

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
        hunger -= 4;
        happiness += 3;
        health += 3;
    }
    public void waterPets(){
        thirst -= 4;
        happiness +=3;
        health += 3;
    }
    // tick method negatively impacts pet attributes which in turn lowers health and happiness
    // other methods (i.e feedPets) positively impact pet attributes which increases health and happiness
    public void tick(){
        hunger ++;
        thirst ++;
        boredom ++;
        happiness --;
        health --;
    }

}
