public class Room {
    private String roomName;
    private String roomInfo;


    public Room(String roomName, String roomInfo){
        this.roomName = roomName;
        this.roomInfo = roomInfo;

    }

    public String getRoomName(){
        return roomName;
    }

    public String getRoomInfo(){
        return roomInfo;
    }

    public String toString(){
        return  getRoomName() + " " + getRoomInfo();
    }


}
