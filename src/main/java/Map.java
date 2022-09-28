public class Map {
    private Map map;
    private Room startRoom;
    public void createRoom(){
        Room room1 = new Room("Room 1", "Your are now in room 1....");
        Room room2 = new Room("Room 2", "Your are now in room 2....");
        Room room3 = new Room("Room 3", "Your are now in room 3....");
        Room room4 = new Room("Room 4", "Your are now in room 4....");
        Room room5 = new Room("Room 5", "Your are now in room 5....");
        Room room6 = new Room("Room 6", "Your are now in room 6....");
        Room room7 = new Room("Room 7", "Your are now in room 7....");
        Room room8 = new Room("Room 8", "Your are now in room 8....");
        Room room9 = new Room("Room 9", "Your are now in room 9....");

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

    public Room getStartRoom(){
        return startRoom;
    }



}
