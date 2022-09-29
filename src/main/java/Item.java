public class Item {
    String itemName;

    public Item(String itemName){
        this.itemName = itemName;
    }

    public String getItemName(){
        return itemName;
    }

    public String toString(){
        return getItemName();
    }


}
