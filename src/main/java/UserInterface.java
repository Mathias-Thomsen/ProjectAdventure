import java.util.Scanner;

public class UserInterface {

    public void user() {
        Scanner scanner = new Scanner(System.in);
        Adventure adventure = new Adventure();
        String userInput;
        System.out.println("You're start location is " + adventure.getSelectedRoom().getRoomName() + " Where do you want to go");

        do {

            userInput = scanner.nextLine();

            if (userInput.equals("l")) {
                System.out.println(adventure.getSelectedRoom().getRoomInfo());
            } else if (adventure.go(userInput)) {
                System.out.println("You are now in: " + adventure.getSelectedRoom().getRoomName() + " Whats next?");
            } else {
                System.out.println("You can not go that way");
            }


        } while (userInput != "exit");
    }

    public void start() {
        System.out.println("Welcome to Adventure Game");
        System.out.println("---------------------------");
        user();
    }
}




