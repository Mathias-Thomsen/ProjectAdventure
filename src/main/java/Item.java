import java.util.ArrayList;

public class Item {
   private String itemName;
   private String itemDescription;

    public Item(String itemName){
        this.itemName = itemName;
    }

    public Item(String itemName, String itemDescription){
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    //Getter
    public String getItemName(){
        return itemName;
    }

    public String getItemDescription(){
        return itemDescription;
    }

    //Setter
    public void setItemName(){
        this.itemName = itemName;
    }

    public void setItemDescription(){
        this.itemDescription = itemDescription;
    }

    //toString
    @Override
    public String toString() {
        return itemName;
    }


}
