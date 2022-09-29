public class Adventure {
    private Player player = new Player();
    private Map map = new Map();
    private Item item = new Item();


    public Adventure() {
        map.createRoom();
        Room startRoom = map.getStartRoom();
        player.setSelectedRoom(startRoom);

    }

    public boolean go(String userInput) {
        return player.move(userInput);
    }
    public Room getSelectedRoom() {
        return player.getSelectedRoom();

    }
    public Room getRoomInfo(){
        return player.getRoomInfo();
    }
    /*public String getTakeItem(){
        return player.takeItem();
    }

     */

}