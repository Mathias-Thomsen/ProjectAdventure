import java.util.ArrayList;

public class Adventure {
    private Player player = new Player();
    private Map map = new Map();
    private Room room = new Room();

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

    public Player getPlayer(){
        return player;
    }


    public Room getRoomInfo(){
        return player.getRoomInfo();
    }
    public Map getMap(){
        return map;
    }

}