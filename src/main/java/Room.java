import java.util.ArrayList;

public class Room {
    private String roomName;
    private String roomInfo;
    private Room north;
    private Room east;
    private Room south;
    private Room west;
    private String item;


    public ArrayList<String> roomItems = new ArrayList<>();


    public Room(String roomName, String roomInfo){
        this.roomName = roomName;
        this.roomInfo = roomInfo;
    }

    public String addItem(String item) {
        roomItems.add(item);
        return item;
    }

    public String getItem(){
        return item;
    }

    public String removeItem(String item){
        roomItems.remove(item);
        return item;
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

    public Room getNorth() {
        return north;
    }

    public Room getEast() {
        return east;
    }

    public Room getSouth() {
        return south;
    }

    public Room getWest() {
        return west;
    }

    public void setNorth(Room room) {
        this.north = room;
    }

    public void setEast(Room room) {
        this.east = room;
    }

    public void setSouth(Room room) {
        this.south = room;
    }

    public void setWest(Room room) {
        this.west = room;
    }








}
