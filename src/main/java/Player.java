import java.util.ArrayList;

public class Player {
    private Room selectedRoom;
    private Item item = new Item();
    private Room room = new Room();
    private ArrayList<Item> inventory = new ArrayList<>();

    public boolean move(String userInput){
        Room requestedRoom = null;

        if(userInput.equals("go north") || userInput.charAt(0) == 'n') {
            requestedRoom = selectedRoom.getNorth();
        } else if (userInput.equals("go east") || userInput.charAt(0) == 'e') {
            requestedRoom = selectedRoom.getEast();
        } else if (userInput.equals("go south") || userInput.charAt(0) == 's') {
            requestedRoom = selectedRoom.getSouth();
        } else if (userInput.equals("go west") || userInput.charAt(0) == 'w') {
            requestedRoom = selectedRoom.getWest();
        }


        if (requestedRoom != null) {
            selectedRoom = requestedRoom;
            return true;
        }else {
            return false;
        }


    }
    public Room getSelectedRoom(){
        return selectedRoom;
    }
    public void setSelectedRoom(Room room){
        this.selectedRoom = room;
    }

    public Room getRoomInfo(){
        return selectedRoom;
    }

    public void setInventory(ArrayList<Item> inventory){
        this.inventory = inventory;
    }

    public ArrayList<Item> getInventory(){
        return inventory;
    }





}
