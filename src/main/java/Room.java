import java.util.ArrayList;

public class Room {
    private String roomName;
    private String roomInfo;
    private Room north;
    private Room east;
    private Room south;
    private Room west;

    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Enemy> enemies = new ArrayList<>();


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

    public void addItem(Item item){
        items.add(item);
    }


    public Item removeItem(String itemName) {
        for (Item item : items) {
            if (item.getItemName().equals(itemName)) {
                items.remove(item);
                return item;
            }
        }
        return null;
    }



    public ArrayList<Item> getItems(){
        return items;
    }


    public void addEnemy(Enemy enemy ){
        enemies.add(enemy);
    }

    public ArrayList<Enemy> getEnemy(){
        return enemies;
    }






}
