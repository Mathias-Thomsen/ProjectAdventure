public class Food extends Item {
    private double healthpoints;


    public Food(String itemName, String itemDescription, double healthpoints){
        super(itemName, itemDescription);
        this.healthpoints = healthpoints;


    }


    public double getHealthPoints(){
        return healthpoints;
    }


    public String toString(){
        return getItemDescription();
    }

}
