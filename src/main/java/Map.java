public class Map {

    public Map(){
        createRoom();
    }

    Room room1 = new Room("a empty room \n", "The room contains nothing and there is little to no light, \nbut you can see two doors one towards east and one towards south");
    Room room2 = new Room("a shady bathroom ", "you see a small bathroom with a old table and a broken sink, there is no more doors");
    Room room3 = new Room("a large bedroom", "you see a larger bedroom with a king size bed covered in trash, there is no more doors");
    Room room4 = new Room("a dark room ","you smell the room is filled with a horrible rotten smell, but so dark that you cant see anything other then two doors leading straight ahead and east");
    Room room5 = new Room("a long hall", "you see a long hall with grey pictures on the walls and a small drawer in the middle, at the end of the hall a door is leading straight ahead");
    Room room6 = new Room("a tunnel", "you see a long narrow tunnel leading two ways north and south");
    Room room7 = new Room("a storage room", "you see a small storage room with locked cabins, and a weird blue barrel i the corner, there are no more doors");
    Room room8 = new Room("a room with a man", "you see the man walking towards you with a hammer yelling i am DAHMER");
    Room room9 = new Room("a creepy room", "you see a shady room lit up by candles, filled up with bones and typings on the walls spelling the words 'Jeff Dahmer'\na door is visible towards west");


    //Items
    private Item mug = new Item("mug", "old coffee mug");
    private Item bottle = new Item("bottle", "empty beer bottle");
    private Item drill = new Item("Drill", "bloody drill with human residue");

    //Food
    private Food Chocolate = new Food("Chocolate", "chocolate bar", 20);
    private Food meat = new Food("Meat", "smelly meat", -20);

    //Drinks
    private Drink beer = new Drink("Budweiser", "Can of budweiser. Maybe there is something bad about this", -20);

    //Weapon
    private Weapon knife = new Weapon("Knife", "big sharp knife", 15, 0);

    //Enemys
    private Enemy dahmer = new Enemy("Dahmer", "wird man in the room ", 50);


    public void createRoom(){

        //Room1
        room1.setEast(room2);
        room1.setSouth(room4);

        //Room2
        room2.setWest(room1);
        room2.addItem(mug);

        //Room3
        room3.setSouth(room6);
        room3.addItem(bottle);
        room3.addItem(beer);

        //Room4
        room4.setNorth(room1);
        room4.setEast(room5);
        room4.setSouth(room7);
        room4.addItem(meat);

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
        room7.addItem(Chocolate);

        //Room8
        room8.setEast(room9);
        room8.addEnemy(dahmer);
        //Room9
        room9.setNorth(room6);
        room9.setWest(room8);


    }


    public Room getStartRoom(){
        return room1;
    }

}
