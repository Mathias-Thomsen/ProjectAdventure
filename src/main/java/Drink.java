public class Drink extends Item {
    private boolean ishealthy;



    public Drink(String itemName, String itemDescription, boolean ishealthy){
        super(itemName, itemDescription);
        this.ishealthy = ishealthy;

    }


    public boolean isHealthy(){
        return ishealthy;
    }


    public String toString(){
        return getItemDescription()+": "+getItemName();
    }

}
