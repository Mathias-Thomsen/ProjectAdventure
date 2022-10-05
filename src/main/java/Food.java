public class Food extends Item {
    private boolean healthy;


    public Food(String itemName, String itemDescription, boolean healthy){
        super(itemName, itemDescription);
        this.healthy = healthy;

    }

    public boolean isHealthy(){
        return healthy;
    }


    public String toString(){
        return getItemDescription()+": "+getItemName();
    }

}
