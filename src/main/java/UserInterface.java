import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Adventure adventure = new Adventure();
    Scanner scanner = new Scanner(System.in);
    private String userInput;



    public void user() {

        System.out.println("Your start location is " + adventure.getSelectedRoom().getRoomName()+ adventure.getSelectedRoom().getRoomInfo()+ "\nWhats next?");

        do {
            userInput = scanner.nextLine();
            String[] userListFromInput = userInput.split(" ");
            String userChoice = "";
            String lastWord = userListFromInput[userListFromInput.length -1];
            String command = userListFromInput[0];
            if (userListFromInput.length > 1) {
                userChoice = lastWord;
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
                        for (Enemy enemy : adventure.getSelectedRoom().getEnemy()){
                            System.out.println("This room contains a " + enemy.getEnemyDescription());
                        }
                    }
                    System.out.println("Whats next?");
                    break;


                case "take":
                    Item itemPickUp = adventure.getSelectedRoom().removeItem(userChoice);

                    if (itemPickUp == null) {
                        System.out.println("There is nothing called " + userChoice);
                        System.out.println("Try again");

                    } else {
                        System.out.println("you have picked up " + itemPickUp);
                        adventure.getPlayer().addItem(itemPickUp);
                        System.out.println("What's next ? ");
                    }
                    break;


                case "drop":
                    Item itemDropped = adventure.getPlayer().removeItem(userChoice);
                    if (itemDropped == null) {
                        System.out.println("There is nothing called " + userChoice);
                        System.out.println("Try again");
                    } else {
                        System.out.println("you have dropped up " + itemDropped);
                        adventure.getPlayer().getSelectedRoom().addItem(itemDropped);
                        System.out.println("What's next?");
                    }
                    break;

                case "inventory", "inv":
                    System.out.println("Your inventory contains: " + adventure.getPlayer().getInventory());
                    if (adventure.getPlayer().getItemNameUser() != null){
                        System.out.println("You have " + adventure.getPlayer().getItemNameUser() + " equipped");
                    }
                    System.out.println("What's next?");
                    break;


                case "eat":
                    ReturnMessage resultFood = adventure.playerEat(userChoice);
                        if (resultFood == ReturnMessage.OK) {
                            System.out.println("you have eaten " + userChoice);
                            if (adventure.getPlayer().getHealth() <= 0) {
                                System.out.println("You died! Thanks for the game!");
                                System.exit(1);
                            }
                            System.out.println("your current health is now " + adventure.getPlayer().getHealth());

                        }
                        else if (resultFood == ReturnMessage.CANT) {
                            System.out.println("You can not eat " + userChoice);

                        }
                        else if (resultFood == ReturnMessage.NOT_FOUND) {
                            System.out.println("Invalid item " + userChoice);
                            System.out.println("Maybe you need to take your food first before you can eat...");
                        }
                        break;



                case "drink":
                    ReturnMessage resultDrink = adventure.playerDrink(userChoice);
                    if (resultDrink == ReturnMessage.OK) {
                        System.out.println("you have drank " + userChoice);
                        System.out.println("your current health is now " + adventure.getPlayer().getHealth());

                    }
                    else if (resultDrink == ReturnMessage.CANT) {
                        System.out.println("You can not drink " + userChoice);

                    }
                    else if (resultDrink == ReturnMessage.NOT_FOUND) {
                        System.out.println("Invalid item " + userChoice);
                        System.out.println("Maybe you need to take your drink first before you can eat...");
                    }
                    break;


                case "show health", "health":
                    System.out.println("Your current health is: " + adventure.getPlayer().getHealth());
                    System.out.println("Whats next?");
                    break;

                case "equip": {
                    ReturnMessage result = adventure.equip(userChoice);
                    if (result == ReturnMessage.OK) { System.out.println("you equipped " + userChoice); }
                    else if (result == ReturnMessage.CANT) {System.out.println(userChoice +  " cannot be equipped.");}
                    else if (result == ReturnMessage.NOT_FOUND){System.out.println(userChoice + " is an invalid item or is not in inventory");}
                    break;
                }

                case "attack":
                    ReturnMessage enemyAttack = adventure.attack(userChoice);

                    if (enemyAttack == ReturnMessage.NOT_FOUND){
                        System.out.println("No enemy found in this room");
                    }
                    else if (enemyAttack == ReturnMessage.CANT) {
                        System.out.println("You have no equipped weapon");
                    }
                    else if (enemyAttack == ReturnMessage.OK) {
                        System.out.println("You have attacked " + userChoice);
                        adventure.getEnemy().enemyDamage();
                        if (adventure.getEnemyHealth() <= 0){
                            System.out.println("you kill " + userChoice + " you are free to go!");
                            System.out.println("Thanks for the game! ");
                            System.exit(2);
                        }
                        else if (adventure.getPlayer().getHealth() <= 0) {
                            System.out.println("You died! thanks for the game!");
                            System.exit(1);
                        } else {
                            System.out.println(userChoice + " health is now " + adventure.getEnemyHealth());
                            System.out.println("BUT " + userChoice + " attacked also you with a bloody hammer! ");
                            adventure.getPlayer().playerDamage();
                            System.out.println("Your health is now " + adventure.getPlayer().getHealth());
                        }
                    }
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
                    to see the player inventory: "inventory"
                    to consume a food "eat" and "item name"
                    to see health: "health"
                    to eat food: "eat"
                    to drink: "drink"
                    to equip a weapon: "equip"
                    to attack a enemy: "attack"
                    
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
