package pets_amok;

public class OrganicDog extends VirtualPet {
    public OrganicDog(String name, String description) {
        super(name, description);
        this.cageCleanliness = 5;
    }
    private int cageCleanliness;

    public int getCageCleanliness() {
        return cageCleanliness;
    }
    public void walkDog() {
        cageCleanliness += 3;
    }
    public void ODogtick1(){
        cageCleanliness++;
    }
    }

