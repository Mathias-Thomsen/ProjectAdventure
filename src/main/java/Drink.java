public class Drink extends Item {
    private int healthPoints;




    public Drink(String itemName, String itemDescription, int healthPoints){
        super(itemName, itemDescription);
        this.healthPoints = healthPoints;

    }

    public int getHealthPoints(){
        return healthPoints;
    }

    public String toString(){
        return getItemDescription();
    }

}
