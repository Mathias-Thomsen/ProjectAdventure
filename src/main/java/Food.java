public class Food extends Item {
    private double healthpoints;
    private boolean healthy;


    public Food(String itemName, String itemDescription, double healthpoints, boolean healthy){
        super(itemName, itemDescription);
        this.healthpoints = healthpoints;
        this.healthy = healthy;

    }


    public boolean isHealthy(){
        return healthy;
    }

    public double getHealthPoints(){
        return healthpoints;
    }


    public String toString(){
        return getItemDescription();
    }

}
