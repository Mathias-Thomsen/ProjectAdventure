import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Adventure adventure = new Adventure();
    int currentHealth = 50;

    public void setCurrentHealth(){
        if (currentHealth >= 50){
            System.out.println("Your current health is now: " +  currentHealth + ", You are in good health stay above 50!");
        } else if(currentHealth < 50) {
            System.out.println("Your current health is now: " +  currentHealth + ", Your health is low, keep eating!");
        }

    }

    public void user() {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        System.out.println("Access Game Guide during the game by typing: help");
        System.out.println("Press enter to start the game");
        try{System.in.read();}
            catch(Exception e){}
        System.out.println("Your start location is " + adventure.getSelectedRoom().getRoomName()+ adventure.getSelectedRoom().getRoomInfo()+ "\nWhats next?");

        do {
            userInput = scanner.nextLine();
            String[] userListFromInput = userInput.split(" ");
            String direction = "";
            String command = userListFromInput[0];
            if (userListFromInput.length > 1) {
                direction = userListFromInput[1];
            }


            switch (command) {
                case "go north", "n":
                case "go east", "e":
                case "go south", "s":
                case "go west", "w":
                    if (adventure.go(userInput)) {
                        System.out.println("You are now in: " + adventure.getSelectedRoom().getRoomName() + " Whats next?");
                    } else {
                        System.out.println("You can not go that way");
                    }
                    break;

                case "look", "l":
                    System.out.println(adventure.getSelectedRoom().getRoomInfo());
                    System.out.println("\nItems in the room:\n" + adventure.getPlayer().getSelectedRoom().getItems()); // TODO print getItemInfo
                    if (!adventure.getPlayer().getSelectedRoom().getFoods().isEmpty()){
                        System.out.println("\nFoods in the room\n" + adventure.getPlayer().getSelectedRoom().getFoods() + "\n"); // TODO print getFoodInfo
                    } else {
                        System.out.println("\nThere is no food in the current room");
                    }
                    System.out.println("Whats next?");
                    break;


                case "take":
                    Item itemPickUp = adventure.getSelectedRoom().removeItem(direction);
                    Food takeFood = adventure.getSelectedRoom().eatFood(direction);
                    if (itemPickUp == null && takeFood == null) {
                        System.out.println("There is nothing called that..");
                        System.out.println("Try again");

                    } else if(itemPickUp != null) {
                        System.out.println("you have picked up " + itemPickUp);
                        adventure.getPlayer().addItem(itemPickUp);
                        System.out.println("What's next? ");
                    } else {
                        System.out.println("you have picked up " + takeFood);
                        adventure.getPlayer().addFood(takeFood);
                        System.out.println("Whats next?");
                    }
                    break;


                case "drop":
                    Item itemDropped = adventure.getPlayer().removeItem(direction);
                    if (itemDropped == null) {
                        System.out.println("There is nothing called that..");
                        System.out.println("Try again");
                    } else {
                        System.out.println("you have dropped up " + itemDropped);
                        adventure.getPlayer().getSelectedRoom().addItem(itemDropped);
                        System.out.println("What's next?");
                    }
                    break;

                case "inventory", "inv":
                    System.out.println("Your inventory contains: " + adventure.getPlayer().getInventory());
                    System.out.println("Your foods: " + adventure.getPlayer().getFoods());
                    System.out.println("What's next?");
                    break;


                case "eat":
                    Food eatFoodFromRoom = adventure.getSelectedRoom().eatFood(direction);
                    Food eatFoodFromInv = adventure.getPlayer().eatFoodFromInv(direction);
                    if (eatFoodFromRoom == null && eatFoodFromInv == null) {
                        System.out.println("There is nothing called that..");
                        System.out.println("Try again");
                    } else {
                        if (eatFoodFromRoom == null) {
                            System.out.println("you have eaten " + eatFoodFromInv);
                        }
                        if (eatFoodFromInv == null) {
                            System.out.println("you have eaten " + eatFoodFromRoom);
                        }
                    }
                    if (eatFoodFromRoom.isHealthyOrNot()){
                        currentHealth = currentHealth + 20;
                    System.out.println("your current health is increased by 20 to "+ currentHealth);
                    } else {currentHealth = currentHealth - 20;
                    System.out.println("your current health is decreasing by 20 to "+ currentHealth);
                        }
                    if (currentHealth <= 0){
                    System.out.println("you have no more health, you died"+"\uD83D\uDC80");
                    System.exit(0);
                }
                    break;

                case "show health", "health":
                    System.out.println("Your current health is: " + currentHealth);
                    System.out.println("Whats next?");
                    break;

                case "help":
                    System.out.println("""
                    Game guide:
                    ---------------------------------------------------------
                    Commands:
                    to move: "go" and "direction" north, south, west or east.
                    to see location: "look"
                    to pickup: "take" and "item name"
                    to drop: "drop" and "item name"
                    to see inventory: "inventory"
                    to consume a food "eat" and "item name"
                    to see health: "health"
                    
                    whats next?
                     """);
                    break;

                case "exit":
                    System.exit(0);
            }

        } while (userInput != "exit");
    }

    public void start() {
        System.out.println("\u001B[31m"+"\n\uD83D\uDD2A\uD83E\uDE78Welcome to the Mystery of Dohmers Basement\uD83E\uDE78\uD83D\uDD2A");
        System.out.println("--------------------------------------------------\n");
        user();
    }
}




