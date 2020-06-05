package pets_amok;

public class OrganicCat extends VirtualPet {
    public OrganicCat(String name, String description) {
        super(name, description);
        this.waste = 5;
    }

    private int waste;

    public int getWaste() {
        return waste;
    }
    public void letCatOut(){
        waste -= 3;
    }
    public void rCatTick() {
        waste ++;


    }

}
