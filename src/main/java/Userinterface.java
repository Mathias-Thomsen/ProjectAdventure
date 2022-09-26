import java.util.Scanner;

public class Userinterface {

    public void userinterface() {
        Scanner scanner = new Scanner(System.in);
        Adventure adventure = new Adventure();
        String userInput1;

        do {
            System.out.println("You are in room 1. Where do you want to go");
            userInput1 = scanner.nextLine();


            switch (userInput1) {
                case "go north":
                    System.out.println("Going north");
                    break;

                case "go south":
                    System.out.println("Going south");
                    break;

                case "go east":
                    System.out.println("Going east");
                    break;

                case "go west":
                    System.out.println("Going west");
                    break;

                case "look":
                    System.out.println(adventure.room1.toString());
                    break;

                case "help":
                    System.out.println("print info");
                    break;

                case "exit":
                    System.exit(0);
                    break;

            }

        }while (userInput1 != "exit");
    }
}





