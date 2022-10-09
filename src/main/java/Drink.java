public class Drink extends Item {
    private int healthPoints;
    private boolean healthy;



    public Drink(String itemName, String itemDescription, int healthPoints, boolean healthy){
        super(itemName, itemDescription);
        this.healthPoints = healthPoints;
        this.healthy = healthy;

    }

    public boolean isHealthy(){
        return healthy;
    }


    public int getHealthPoints(){
        return healthPoints;
    }


    public String toString(){
        return getItemDescription();
    }

}
