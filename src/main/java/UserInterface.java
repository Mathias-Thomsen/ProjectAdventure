import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Adventure adventure = new Adventure();
    Scanner scanner = new Scanner(System.in);
    int currentHealth = 50;
    private String userInput;

    public void setCurrentHealth(){
        if (currentHealth >= 50){
            System.out.println("Your current health is now: " +  currentHealth + ", You are in good health stay above 50!");
        } else if(currentHealth < 50) {
            System.out.println("Your current health is now: " +  currentHealth + ", Your health is low, keep eating!");
        }

    }

    public void user() {

        System.out.println("Your start location is " + adventure.getSelectedRoom().getRoomName()+ adventure.getSelectedRoom().getRoomInfo()+ "\nWhats next?");

        do {
            userInput = scanner.nextLine();
            String[] userListFromInput = userInput.split(" ");
            String direction = "";
            String command = userListFromInput[0];
            if (userListFromInput.length == 2) {
                direction = userListFromInput[1];
            }
            else if (userListFromInput.length > 2){
                direction = userListFromInput[2];
            }


            switch (command) {
                case "go", "go n", "go e", "go s", "go w", "go north", "go east", "go south", "go west", "n", "e", "s", "w":

                    if (adventure.go(userInput)) {
                        System.out.println("You are now in: " + adventure.getSelectedRoom().getRoomName() + "\nWhats next?");
                    }
                    else {
                        System.out.println("You can not go that way");
                    }
                    break;

                case "look", "l":
                    System.out.println(adventure.getSelectedRoom().getRoomInfo());

                    if (!adventure.getSelectedRoom().getItems().isEmpty()){
                        for (Item item : adventure.getSelectedRoom().getItems()) {
                            System.out.println("This room contains a " + item.getItemDescription());
                        }
                    }
                    System.out.println("Whats next?");
                    break;


                case "take":
                    Item itemPickUp = adventure.getSelectedRoom().removeItem(direction);
                    if (itemPickUp == null) {
                        System.out.println("There is nothing called that..");
                        System.out.println("Try again");

                    } else {
                        System.out.println("you have picked up " + itemPickUp);
                        adventure.getPlayer().addItem(itemPickUp);
                        System.out.println("What's next? ");
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
                    System.out.println("What's next?");
                    break;


                case "eat":
                    Item eatFoodFromRoom = adventure.getSelectedRoom().removeItem(direction);
                    Item eatFoodFromInv = adventure.getPlayer().removeItem(direction);

                    if (eatFoodFromRoom == null && eatFoodFromInv == null) {
                        System.out.println("There is nothing you can eat..");
                        break;
                    }

                    if (eatFoodFromRoom != null) {

                        if (eatFoodFromRoom instanceof Food) {
                            System.out.println("you have eaten " + eatFoodFromRoom);


                            if (((Food) eatFoodFromRoom).isHealthy()){
                                currentHealth = currentHealth + 20;
                                System.out.println("your current health is increased by 20 to "+ currentHealth);
                                setCurrentHealth();
                            } else {
                                currentHealth = currentHealth - 20;
                                System.out.println("your current health is decreasing by 20 to " + currentHealth);
                                setCurrentHealth();
                            }
                            if (currentHealth <= 0){
                                System.out.println("you have no more health, you died"+"\uD83D\uDC80");
                                System.exit(0);
                            }
                            System.out.println("What's next? ");
                            break;

                        }else {
                            System.out.println("You can not eat that!");
                            System.out.println("What's next? ");
                            break;
                        }
                    }

                    else if (eatFoodFromInv != null) {

                        if (eatFoodFromInv instanceof Food) {
                            System.out.println("you have eaten " + eatFoodFromInv);

                            if (((Food) eatFoodFromInv).isHealthy()){
                                currentHealth = currentHealth + 20;
                                System.out.println("your current health is increased by 20 to "+ currentHealth);
                                setCurrentHealth();
                            } else {
                                currentHealth = currentHealth - 20;
                                System.out.println("your current health is decreasing by 20 to " + currentHealth);
                                setCurrentHealth();
                            }
                            if (currentHealth <= 0){
                                System.out.println("you have no more health, you died"+"\uD83D\uDC80");
                                System.exit(0);
                            }
                            System.out.println("What's next? ");
                            break;

                        }else {
                            System.out.println("You can not eat that!");
                            System.out.println("What's next? ");
                            break;
                        }
                    }

                case "drink":
                    Item drinkDrinkFromRoom = adventure.getSelectedRoom().removeItem(direction);
                    Item drinkDrinkFromInv = adventure.getPlayer().removeItem(direction);

                    if (drinkDrinkFromRoom == null && drinkDrinkFromInv == null) {
                        System.out.println("There is nothing you can drink..");
                        break;
                    }

                    if (drinkDrinkFromRoom != null) {

                        if (drinkDrinkFromRoom instanceof Drink) {
                            System.out.println("you have drank " + drinkDrinkFromRoom);


                            if (((Drink) drinkDrinkFromRoom).isHealthy()){
                                currentHealth = currentHealth + 20;
                                System.out.println("your current health is increased by 20 to "+ currentHealth);
                                setCurrentHealth();
                            } else {
                                currentHealth = currentHealth - 20;
                                System.out.println("your current health is decreasing by 20 to " + currentHealth);
                                setCurrentHealth();
                            }
                            if (currentHealth <= 0){
                                System.out.println("you have no more health, you died"+"\uD83D\uDC80");
                                System.exit(0);
                            }
                            System.out.println("What's next? ");
                            break;

                        }else {
                            System.out.println("You can not drink that!");
                            System.out.println("What's next? ");
                            break;
                        }
                    }

                    else if (drinkDrinkFromInv != null) {

                        if (drinkDrinkFromInv instanceof Drink) {
                            System.out.println("you have drank " + drinkDrinkFromInv);

                            if (((Drink) drinkDrinkFromInv).isHealthy()){
                                currentHealth = currentHealth + 20;
                                System.out.println("your current health is increased by 20 to "+ currentHealth);
                                setCurrentHealth();
                            } else {
                                currentHealth = currentHealth - 20;
                                System.out.println("your current health is decreasing by 20 to " + currentHealth);
                                setCurrentHealth();
                            }
                            if (currentHealth <= 0){
                                System.out.println("you have no more health, you died"+"\uD83D\uDC80");
                                System.exit(0);
                            }
                            System.out.println("What's next? ");
                            break;

                        }else {
                            System.out.println("You can not drink that!");
                            System.out.println("What's next? ");
                            break;
                        }
                    }

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

                default:
                    System.out.println("Invalid input");
            }


        } while (userInput != "exit");
    }

    public void start() {
        System.out.println("\u001B[31m"+"\n\uD83D\uDD2A\uD83E\uDE78Welcome to the Mystery of Dohmers Basement\uD83E\uDE78\uD83D\uDD2A");
        System.out.println("--------------------------------------------------\n");
        System.out.println("Access Game Guide during the game by typing: help");
        System.out.println("Press ENTER to start the game");
        userInput = scanner.nextLine();
        boolean userFalse = false;

        while (!userFalse) {
            if (userInput.isEmpty()) {
                user();
                userFalse = true;
            } else {
                System.out.println("Invalid input. Press ENTER to start the game.");
                userInput = scanner.nextLine();
            }
        }

    }
}




