public class Adventure {
    private String selectedRoom;



    Room room1 = new Room("room1", "Your are now in room 1....");
    Room room2 = new Room("Room2", "Your are now in room 2....");
    Room room3 = new Room("Room3", "Your are now in room 3....");
    Room room4 = new Room("Room4", "Your are now in room 4....");
    Room room5 = new Room("Room5", "Your are now in room 5....");
    Room room6 = new Room("Room6", "Your are now in room 6....");
    Room room7 = new Room("Room7", "Your are now in room 7....");
    Room room8 = new Room("Room8", "Your are now in room 8....");
    Room room9 = new Room("Room9", "Your are now in room 9....");


    public void createRoom(){

        //Room1
        room1.setNorth(null);
        room1.setEast(room2);
        room1.setSouth(room4);
        room1.setWest(null);

        //Room2
        room2.setNorth(null);
        room2.setEast(room3);
        room2.setSouth(null);
        room2.setWest(room1);

        //Room3
        room3.setNorth(null);
        room3.setEast(null);
        room3.setSouth(room6);
        room3.setWest(room2);

        //Room4
        room4.setNorth(room1);
        room4.setEast(room5);
        room4.setSouth(room7);
        room4.setWest(null);

        //Room5
        room5.setNorth(null);
        room5.setEast(room6);
        room5.setSouth(null);
        room5.setWest(room4);

        //Room6
        room6.setNorth(room3);
        room6.setEast(null);
        room6.setSouth(room9);
        room6.setWest(room5);

        //Room7
        room7.setNorth(room4);
        room7.setEast(null);
        room7.setSouth(null);
        room7.setWest(null);

        //Room8
        room8.setNorth(null);
        room8.setEast(room9);
        room8.setSouth(null);
        room8.setWest(null);

        //Room9
        room9.setNorth(room6);
        room9.setEast(null);
        room9.setSouth(null);
        room9.setWest(room8);







    }

    public void setRoom(){
        this.selectedRoom = selectedRoom;
    }









}