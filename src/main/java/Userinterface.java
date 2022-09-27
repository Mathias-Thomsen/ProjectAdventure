import java.util.Scanner;

public class Userinterface {
    private Room room;

    public void userinterface() {
        Scanner scanner = new Scanner(System.in);
        Adventure adventure = new Adventure();
        String userInput1;



        do {
            System.out.println("You are in " + adventure.getSelectedRoom().getRoomName() + " Where do you want to go");
            userInput1 = scanner.nextLine();



            switch (userInput1) {

                case "go north":
                    if (adventure.goNorth()){
                        System.out.println(adventure.getSelectedRoom().getRoomName() + " " + adventure.getSelectedRoom().getRoomInfo());
                    } else {
                        System.out.println("You can not go that way");
                    }
                    break;

                case "go east":
                    if (adventure.goEast()){
                        System.out.println(adventure.getSelectedRoom().getRoomName() + " " + adventure.getSelectedRoom().getRoomInfo());
                    } else {
                        System.out.println("You can not go that way");
                    }
                    break;



                case "go south":
                    if (adventure.goSouth()){
                        System.out.println(adventure.getSelectedRoom().getRoomName() + " " + adventure.getSelectedRoom().getRoomInfo());
                    } else {
                        System.out.println("You can not go that way");
                    }
                    break;

                case "go west":
                    if (adventure.goWest()){
                        System.out.println(adventure.getSelectedRoom().getRoomName() + " " + adventure.getSelectedRoom().getRoomInfo());
                    } else {
                        System.out.println("You can not go that way");
                    }
                    break;

                case "look":
                    System.out.println("You are in " + adventure.getSelectedRoom().getRoomName() + " " + adventure.getSelectedRoom().getRoomInfo());
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




