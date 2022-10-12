import java.util.ArrayList;

public class Adventure {
    private Player player = new Player(50);
    private Map map = new Map();
    private Enemy enemy = new Enemy(40);


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

    public Enemy getEnemy(){
        return enemy;
    }

    public ReturnMessage equip(String itemName){
        return player.equipWeapon(itemName);
    }

    public ReturnMessage attack(String userChoice){
        return player.attackCommand(userChoice);
    }
    public int getEnemyHealth(){
        return enemy.getEnemyHealth();
    }

    //player
    public Player getPlayer(){
        return player;
    }
    public ReturnMessage playerEat(String itemName) {
        return player.eatFood(itemName);
    }
    public ReturnMessage playerDrink(String itemName) {
        return player.drinkItem(itemName);
    }




}