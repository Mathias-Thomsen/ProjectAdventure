import java.util.Scanner;

public class UserInterface {

    public void user() {
        Scanner scanner = new Scanner(System.in);
        Adventure adventure = new Adventure();
        String userInput;
        System.out.println("You're start location is " + adventure.getSelectedRoom().getRoomName() + " Where do you want to go");

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
                    System.out.println("Items in list:\n" + adventure.getPlayer().getSelectedRoom().getItems());
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

                case "inventory":
                    System.out.println("Your inventory contains: " + adventure.getPlayer().getItems());
                    System.out.println("What's next?");
                    break;



                case "help":
                    System.out.println("Print help list...");

                case "exit":
                    System.exit(0);
            }

        } while (userInput != "exit");
    }

    public void start() {
        System.out.println("Welcome to Adventure Game");
        System.out.println("---------------------------");
        user();
    }
}




