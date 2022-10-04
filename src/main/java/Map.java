public class Map {

    public Map(){
        createRoom();
    }

    Room room1 = new Room("a empty room \n", "The room contains nothing and there is little to no light, \nbut you can see two doors one towards east and one towards south");
    Room room2 = new Room("a shady bathroom ", "bathroom with a old table and a broken sink containing a flashlight");
    Room room3 = new Room("a large bedroom", "");
    Room room4 = new Room("a dark room ","The room is filled with a horrible rotten smell, but so dark that nothing is visual");
    Room room5 = new Room("a long hall", "a long hall with grey pictures on the walls and a small drawer");
    Room room6 = new Room("a tunnel", "a narrow tunnel leading two ways");
    Room room7 = new Room("a bedroom", "a small bedroom containing a small bed");
    Room room8 = new Room("stairs", "stairs leading outside towards south");
    Room room9 = new Room("boss", "Jeff Dohmer");



    private Item flashLight = new Item("Flashlight");
    private Item key = new Item("Key");
    private Item knife = new Item("Knife");
    private Item drill = new Item("Drill");

    private Food cheese = new Food("cheese", true, "smelly");
    private Food meat = new Food("Meat",true, "Cooked");
    private Food beer = new Food("Budweiser",false, "Can of beer");

    public void createRoom(){

        //Room1
        room1.setEast(room2);
        room1.setSouth(room4);



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
        room7.addFood(cheese);

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
