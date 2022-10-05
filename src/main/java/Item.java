import java.util.ArrayList;

public class Item {
   private String itemName;
   private String itemDescription;

   public Item(){
   }

    public Item(String itemName){
        this.itemName = itemName;
    }

    public Item(String itemName, String itemDescription){
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    //Getter
    public String getItemName(){
        return itemName.toLowerCase();
    }

    public String getItemDescription(){
        return itemDescription;
    }


    //toString
    public String toString() {
        return  itemName;
    }


}
