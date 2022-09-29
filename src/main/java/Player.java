import java.util.ArrayList;

public class Player {
    private Map map;
    private Room selectedRoom;
    private Item item = new Item();

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
    ArrayList<String>playerInventory = new ArrayList<>();

    /*public String takeItem(){

        if (getSelectedRoom().getItem() != null){
            String item = getSelectedRoom().getItem();
            playerInventory.add(item);

            getSelectedRoom().removeItem(item);


        }
    }

     */



}
