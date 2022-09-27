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

                case "go north", "north", "n" -> {
                    if (adventure.goNorth()){
                        System.out.println(adventure.getSelectedRoom().getRoomName() + " " + adventure.getSelectedRoom().getRoomInfo());
                    } else {
                        System.out.println("You can not go that way");
                    }
                }


                case "go east", "east", "e" -> {
                    if (adventure.goEast()){
                        System.out.println(adventure.getSelectedRoom().getRoomName() + " " + adventure.getSelectedRoom().getRoomInfo());
                    } else {
                        System.out.println("You can not go that way");
                    }
                }


                case "go south", "south", "s" -> {
                    if (adventure.goSouth()){
                        System.out.println(adventure.getSelectedRoom().getRoomName() + " " + adventure.getSelectedRoom().getRoomInfo());
                    } else {
                        System.out.println("You can not go that way");
                    }
                }

                case "go west", "west", "w" -> {
                    if (adventure.goWest()){
                        System.out.println(adventure.getSelectedRoom().getRoomName() + " " + adventure.getSelectedRoom().getRoomInfo());
                    } else {
                        System.out.println("You can not go that way");
                    }
                }

                case "look" -> {
                    System.out.println("You are in " + adventure.getSelectedRoom().getRoomName() + " " + adventure.getSelectedRoom().getRoomInfo());
                }


                case "help" -> {
                    System.out.println("print info");
                }

                case "exit" -> {
                    System.exit(0);
                }

            }

        }while (userInput1 != "exit");
    }
}




