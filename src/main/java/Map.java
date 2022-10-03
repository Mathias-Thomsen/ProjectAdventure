public class Map {

    public Map(){
        createRoom();
    }

    Room room1 = new Room("Room 1", "Info about Room 1: ");
    Room room2 = new Room("Room 2", "Info about Room 2");
    Room room3 = new Room("Room 3", "Info about Room 3");
    Room room4 = new Room("Room 4", "Info about Room 4");
    Room room5 = new Room("Room 5", "Info about Room 5");
    Room room6 = new Room("Room 6", "Info about Room 6");
    Room room7 = new Room("Room 7", "Info about Room 7");
    Room room8 = new Room("Room 8", "Info about Room 8");
    Room room9 = new Room("Room 9", "Info about Room 9");



    private Item sword = new Item("Sword");
    private Item flashLight = new Item("Flashlight");
    private Item key = new Item("Key");
    private Item knife = new Item("Knife");
    private Item drill = new Item("Drill");

    private Food aeble = new Food("Æble");
    private Food banan = new Food("Banan");
    private Food fisk = new Food("Fisk");
    private Food meat = new Food("Meat");
    private Food beer = new Food("Budweiser");

    public void createRoom(){

        //Room1
        room1.setEast(room2);
        room1.setSouth(room4);
        room1.addItem(sword);
        room1.addFood(aeble);
        room1.addFood(banan);
        room1.addFood(fisk);

        //Room2
        room2.setWest(room1);
        room2.addItem(flashLight);

        //Room3
        room3.setSouth(room6);
        room3.addItem(key);
        room3.addFood(beer);

        //Room4
        room4.setNorth(room1);
        room4.setEast(room5);
        room4.setSouth(room7);
        room4.addFood(meat);

        //Room5
        room5.setEast(room6);
        room5.setWest(room4);
        room5.addItem(knife);

        //Room6
        room6.setNorth(room3);
        room6.setSouth(room9);
        room6.setWest(room5);

        //Room7
        room7.setNorth(room4);
        room7.addItem(drill);

        //Room8
        room8.setEast(room9);

        //Room9
        room9.setNorth(room6);
        room9.setWest(room8);

    }


    public Room getStartRoom(){
        return room1;
    }

}
