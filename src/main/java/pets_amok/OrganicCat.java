package pets_amok;

public class OrganicCat extends Organic {
    public OrganicCat(String name, String description) {
        super(name, description);
    }


    public void letCatOut(){
        happiness +=3;
        health +=3;
        boredom -=3;
    }
}
