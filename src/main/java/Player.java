import java.util.ArrayList;

public class Player {
    private Room selectedRoom;
    private ArrayList<Item> inventory = new ArrayList<>();
    private ArrayList<Item> equipWeapon = new ArrayList<>();
    private ArrayList<Weapon> equipWeapons = new ArrayList<>();
    private Weapon currentWeapon;
    private double health;
    private final double maxHealth = 50;

    public Player(double health) {
        this.health = health;
    }
    public double getHealth() {
        return health;
    }
    public void setHealth(double health) {
        this.health += health;
    }

    public boolean move(String userInput){
        Room requestedRoom = null;

        if(userInput.equals("go north") || userInput.equals("go n") || userInput.charAt(0) == 'n') {
            requestedRoom = selectedRoom.getNorth();
        } else if (userInput.equals("go east") || userInput.equals("go e") || userInput.charAt(0) == 'e') {
            requestedRoom = selectedRoom.getEast();
        } else if (userInput.equals("go south") || userInput.equals("go s") || userInput.charAt(0) == 's') {
            requestedRoom = selectedRoom.getSouth();
        } else if (userInput.equals("go west") || userInput.equals("go w") || userInput.charAt(0) == 'w') {
            requestedRoom = selectedRoom.getWest();
        }


        if (requestedRoom != null) {
            selectedRoom = requestedRoom;
            return true;
        }else {
            return false;
        }
    }

    public Room getSelectedRoom(){
        return selectedRoom;
    }
    public void setSelectedRoom(Room room){
        this.selectedRoom = room;
    }



    //Items
    public void addItem(Item item){
        inventory.add(item);
    }


    public Item removeItem(String itemName) {
        for (Item item : inventory) {
            if (item.getItemName().equals(itemName)) {
                inventory.remove(item);
                return item;
            }
        }
        return null;
    }

    public ArrayList<Item> getInventory(){
        return inventory;
    }

    public ArrayList<Item> getEquipWeapon(){
        return equipWeapon;
    }
    public void addEquipWeapon(Item equipWepon){
        equipWeapon.add(equipWepon);
    }


    public String getItemNameUser(){
        for (Item weapon : equipWeapon){
            String itemAttackName = weapon.getItemName();
            return itemAttackName;
        }
        return null;
    }


    public Weapon getMeeleorRanged(String itemName){
        for (Weapon weapon : equipWeapons){
            if (weapon.getItemName().equals(itemName)){
                return weapon;
            }
        }
        return null;
    }

   /* public Item removeItem(String itemName) {
        for (Item item : inventory) {
            if (item.getItemName().equals(itemName)) {
                inventory.remove(item);
                return item;
            }
        }
        return null;
    }*/

}


