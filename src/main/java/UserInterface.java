import java.util.Scanner;

public class UserInterface {

    public void user() {
        Scanner scanner = new Scanner(System.in);
        Adventure adventure = new Adventure();
        String userInput;
        System.out.println("You're start location is " + adventure.getSelectedRoom().getRoomName() + " Where do you want to go");

        do {

            userInput = scanner.nextLine();

            switch (userInput) {
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
                    Item pickedUpItem = adventure.getSelectedRoom().removeItem(userInput);
                    if (pickedUpItem == null) {
                        System.out.println("There is nothing called that..");
                    } else {
                        System.out.println("you have picked up " + pickedUpItem);
                        adventure.getPlayer().addItem(pickedUpItem);
                    }


                case "help":

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




