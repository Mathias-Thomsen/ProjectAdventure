public class Player {
    private Map map;
    private Room selectedRoom;

    public boolean move(String userInput){
        Room requestedRoom = null;

        if(userInput.charAt(0) == 'n') {
            requestedRoom = selectedRoom.getNorth();
        } else if (userInput.charAt(0) == 'e') {
            requestedRoom = selectedRoom.getEast();
        } else if (userInput.charAt(0) == 's') {
            requestedRoom = selectedRoom.getSouth();
        } else if (userInput.charAt(0) == 'w') {
            requestedRoom = selectedRoom.getWest();
        } else if (userInput.charAt(0) == 'l') {

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



}
