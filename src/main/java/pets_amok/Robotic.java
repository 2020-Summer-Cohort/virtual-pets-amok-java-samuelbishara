package pets_amok;

public abstract class Robotic extends VirtualPet {
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
        oilLevel += 3;
    }
    public void performMaintenance(){
        maintenance += 3;
    }
}
