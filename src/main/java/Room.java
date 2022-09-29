import java.util.ArrayList;

public class Room {
    private String roomName;
    private String roomInfo;
    private Room north;
    private Room east;
    private Room south;
    private Room west;
    private Item item;


    public ArrayList<Item> getRoomItems() {
        return roomItems;
    }

    public void setRoomItems(ArrayList<Item> roomItems) {
        this.roomItems = roomItems;
    }

    public ArrayList<Item> roomItems = new ArrayList<>();


    public Room(String roomName, String roomInfo){
        this.roomName = roomName;
        this.roomInfo = roomInfo;
    }

    public Room(ArrayList roomItems){
        this.roomItems = roomItems;
    }

    public Item getItem(){
        return item;
    }

    public void setItem(){
        this.item = item;
    }

    public Room(){
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
