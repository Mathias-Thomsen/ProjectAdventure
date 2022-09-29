public class Item {
    String itemName;
    String itemInfo;
    Room room = new Room();
    Room selectedRoom = new Room();

    public Item(String itemName, String itemInfo){
        this.itemName = itemName;
        this.itemInfo = itemInfo;
    }
    public Item(){
    }

    public Item(Room selectedRoom){
        this.selectedRoom = selectedRoom;
    }

    public String getItemName(Room selectedRoom){
        return itemName;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public String getItemInfo(){
        return itemInfo;
    }

    public void setItemInfo(String itemInfo){
        this.itemInfo = itemInfo;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getItemName(){
        return itemName;
    }

    public String toString(){
        return itemName + ": " + itemInfo;
    }


}
