import java.util.ArrayList;

public class Adventure {
    private Player player = new Player(50);
    private Map map = new Map();


    public Adventure() {
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



}