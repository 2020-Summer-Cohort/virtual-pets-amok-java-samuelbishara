package pets_amok;

public class OrganicDog extends Organic {
    public OrganicDog(String name, String description) {
        super(name, description);
        this.cageFilth = 5;
    }
    private int cageFilth;

    // accessor method for dog waste
    public int getCageFilth() {
        return cageFilth;
    }
    public void walkDog() {
        happiness ++;
        health ++;
        cageFilth --;
        boredom --;
    }
    public void cleanDogCage(){
        cageFilth -= 4;
        happiness += 3;
        health += 3;
    }
    // tick method negatively impacts pet attributes which in turn lowers health and happiness
    // other methods (i.e feedPets) positively impact pet attributes which increases health and happiness
    public void dogTick(){
        tick();
        cageFilth++;
    }
    }

