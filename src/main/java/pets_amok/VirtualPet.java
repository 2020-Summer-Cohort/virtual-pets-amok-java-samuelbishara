package pets_amok;

public abstract class VirtualPet {
    protected String name;
    protected String description;
    protected int health;
    protected int happiness;
    private int boredom;

    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
        this.health = 5;
        this.happiness = 5;
        this.boredom = 5;
    }

    public String getName() {
        return name;
    }
    public int getHealth(){
        return health;
    }

    public String getDescription() {
        return description;
    }

    public int getHappiness(){
        return happiness;
    }
    public int getBoredom() {
        return boredom;
    }
    public void playWithPet(){
        boredom -= 3;
    }

    public void tick1(){
        boredom ++;
        happiness ++;
        health++;
    }


}


