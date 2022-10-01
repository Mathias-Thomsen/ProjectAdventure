import java.util.ArrayList;

public class Player {
    private Room selectedRoom;
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Food> foods = new ArrayList<>();

    public boolean move(String userInput){
        Room requestedRoom = null;

        if(userInput.equals("go north") || userInput.charAt(0) == 'n') {
            requestedRoom = selectedRoom.getNorth();
        } else if (userInput.equals("go east") || userInput.charAt(0) == 'e') {
            requestedRoom = selectedRoom.getEast();
        } else if (userInput.equals("go south") || userInput.charAt(0) == 's') {
            requestedRoom = selectedRoom.getSouth();
        } else if (userInput.equals("go west") || userInput.charAt(0) == 'w') {
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

    public Room getRoomInfo(){
        return selectedRoom;
    }


    //Items
    public void addItem(Item item){
        items.add(item);
    }

    public Item removeItem(String itemName) {
        for (Item item : items) {
            if (item.getItemName().equals(itemName)) {
                items.remove(item);
                return item;
            }
        }
        return null;
    }

    public ArrayList<Item> getItems(){
        return items;
    }


    public void addFood(Food food){
        foods.add(food);
    }

    public Food eatFood(String foodName) {
        for (Food food : foods) {
            if (food.getFoodName().equals(foodName)) {
                foods.remove(food);
                return food;
            }
        }
        return null;
    }

    public ArrayList<Food> getFoods(){
        return foods;
    }

}


