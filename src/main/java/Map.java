import java.util.ArrayList;

public class Map {
    private Map map;
    private Room startRoom;
    private ArrayList<Room> items = new ArrayList<>();
    Room selectedRoom = new Room();

    Room room1 = new Room("Room 1", "Info about Room 1: ");
    Room room2 = new Room("Room 2", "Info about Room 2");
    Room room3 = new Room("Room 3", "Info about Room 3");
    Room room4 = new Room("Room 4", "Info about Room 4");
    Room room5 = new Room("Room 5", "Info about Room 5");
    Room room6 = new Room("Room 6", "Info about Room 6");
    Room room7 = new Room("Room 7", "Info about Room 7");
    Room room8 = new Room("Room 8", "Info about Room 8");
    Room room9 = new Room("Room 9", "Info about Room 9");

    public void createRoom(){

        //Room1
        room1.setEast(room2);
        room1.setSouth(room4);

        //Room2
        room2.setEast(room3);
        room2.setWest(room1);

        //Room3
        room3.setSouth(room6);
        room3.setWest(room2);

        //Room4
        room4.setNorth(room1);
        room4.setEast(room5);
        room4.setSouth(room7);

        //Room5
        room5.setEast(room6);
        room5.setWest(room4);

        //Room6
        room6.setNorth(room3);
        room6.setSouth(room9);
        room6.setWest(room5);

        //Room7
        room7.setNorth(room4);

        //Room8
        room8.setEast(room9);

        //Room9
        room9.setNorth(room6);
        room9.setWest(room8);

        startRoom = room1;
    }

    Item item1 = new Item("itemName1", "itemInfo1");
    Item item2 = new Item("itemName2", "itemInfo2");
    Item item3 = new Item("itemName3", "itemInfo3");
    Item item4 = new Item("itemName4", "itemInfo4");
    Item item5 = new Item("itemName5", "itemInfo5");
    Item item6 = new Item("itemName6", "itemInfo6");
    Item item7 = new Item("itemName7", "itemInfo7");
    Item item8 = new Item("itemName8", "itemInfo8");
    Item item9 = new Item("itemName9", "itemInfo9");


    public ArrayList<Room> roomItems(){
        item1.setRoom(room1);
        item2.setRoom(room1);
        item3.setRoom(room1);
        item4.setRoom(room4);
        item5.setRoom(room5);
        items.add(item1.getRoom());
        items.add(item2.getRoom());
        items.add(item3.getRoom());
        room2.setItem(item2);
        room3.setItem(item3);
        room4.setItem(item4);
        return items;
    }

    public String itemsInRooms(){
        String itemInRooms = null;
        for (Room items: roomItems()){
            itemInRooms = "\n" +items.getItem().getItemName(selectedRoom);
        }
        return itemInRooms;
    }


    public Room getStartRoom(){
        return startRoom;
    }



}
