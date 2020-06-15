package pets_amok;

public class Robotic extends VirtualPet {
    public Robotic(String name, String description) {
        super(name, description);
        this.oilLevel = 5;
        this.maintenance = 5;
    }

    protected int oilLevel;
    protected int maintenance;

    public int getOilLevel() {
        return oilLevel;
    }
    public int getMaintenance() {
        return maintenance;
    }
    public void oilPets(){
        oilLevel += 4;
        happiness += 3;
        health += 3;
    }
    public void performMaintenance(){
        maintenance += 4;
        happiness += 3;
        health += 3;

    }
    // tick method negatively impacts pet attributes which in turn lowers health and happiness
    // other methods (i.e feedPets) positively impact pet attributes which increases health and happiness
    public void tick(){
        oilLevel --;
        maintenance --;
        happiness --;
        health --;
        boredom ++;
    }
}
