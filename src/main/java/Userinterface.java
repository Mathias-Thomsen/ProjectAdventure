import java.util.Scanner;

public class Userinterface {
    Scanner scan = new Scanner(System.in);
    Adventure adventure = new Adventure();
    String userInput;
    String currentPlace = adventure.getRoom1();

    public void user(){
        do {
            System.out.println("You are now in " + currentPlace +   " Where do you wanna go?");
            userInput = scan.nextLine();
            switch (userInput) {
                case "go north":
                    System.out.println("Going north");
                    if (currentPlace == adventure.getRoom1()){
                        System.out.println("You cant go north from " + currentPlace);
                    }

                    else if (currentPlace == adventure.getRoom2()) {
                        System.out.println("you cant go north from " + currentPlace);
                    }

                    else if (currentPlace == adventure.getRoom3()) {
                        System.out.println("You cant go north from " + currentPlace);
                    }

                    else if (currentPlace == adventure.getRoom4()) {
                        currentPlace = adventure.getRoom1();
                    }

                    else if (currentPlace == adventure.getRoom5()) {
                        System.out.println("You cant go north from " + currentPlace);
                    }

                    else if (currentPlace == adventure.getRoom6()) {
                        currentPlace = adventure.getRoom3();
                    }

                    else if (currentPlace == adventure.getRoom7()) {
                        currentPlace = adventure.getRoom4();
                    }

                    else if (currentPlace == adventure.getRoom8()) {
                        currentPlace = adventure.getRoom5();
                    }

                    else if (currentPlace == adventure.getRoom9()) {
                        currentPlace = adventure.getRoom6();
                    }
                    break;

                case "go south":
                    System.out.println("Going south");
                    if (currentPlace == adventure.getRoom1()){
                        currentPlace = adventure.getRoom4();
                    }

                    else if (currentPlace == adventure.getRoom2()) {
                        System.out.println("Door is locked, go another way");
                    }

                    else if (currentPlace == adventure.getRoom3()) {
                        currentPlace = adventure.getRoom6();
                    }

                    else if (currentPlace == adventure.getRoom4()) {
                        currentPlace = adventure.getRoom7();
                    }

                    else if (currentPlace == adventure.getRoom5()) {
                        currentPlace = adventure.getRoom8();
                    }

                    else if (currentPlace == adventure.getRoom6()) {
                        currentPlace = adventure.getRoom9();
                    }

                    else if (currentPlace == adventure.getRoom7()) {
                        System.out.println("You cant go south from " + currentPlace);
                    }

                    else if (currentPlace == adventure.getRoom8()) {
                        System.out.println("You cant go south from " + currentPlace);
                    }

                    else if (currentPlace == adventure.getRoom9()) {
                        System.out.println("You cant go south from " + currentPlace);
                    }

                    break;

                case "go east":
                    System.out.println("Going east");
                    if (currentPlace == adventure.getRoom1()){
                        currentPlace = adventure.getRoom2();
                    }

                    else if (currentPlace == adventure.getRoom2()) {
                        currentPlace = adventure.getRoom3();
                    }

                    else if (currentPlace == adventure.getRoom3()) {
                        System.out.println("You cant go east from " + currentPlace);
                    }

                    else if (currentPlace == adventure.getRoom4()) {
                        System.out.println("You cant go east from " + currentPlace);
                    }

                    else if (currentPlace == adventure.getRoom5()) {
                        System.out.println("You cant go east from " + currentPlace);
                    }

                    else if (currentPlace == adventure.getRoom6()) {
                        System.out.println("You cant go east from " + currentPlace);
                    }

                    else if (currentPlace == adventure.getRoom7()) {
                        currentPlace = adventure.getRoom8();
                    }

                    else if (currentPlace == adventure.getRoom8()) {
                        currentPlace = adventure.getRoom9();
                    }

                    else if (currentPlace == adventure.getRoom9()) {
                        System.out.println("You cant go east from " + currentPlace);
                    }
                    break;

                case "go west":
                    System.out.println("Going west");
                    if (currentPlace == adventure.getRoom1()){
                        System.out.println("You cant go west from " + currentPlace);
                    }

                    else if (currentPlace == adventure.getRoom2()) {
                        currentPlace = adventure.getRoom1();
                    }

                    else if (currentPlace == adventure.getRoom3()) {
                        currentPlace = adventure.getRoom2();
                    }

                    else if (currentPlace == adventure.getRoom4()) {
                        System.out.println("You cant go west from " + currentPlace);
                    }

                    else if (currentPlace == adventure.getRoom5()) {
                        System.out.println("You cant go west from " + currentPlace);
                    }

                    else if (currentPlace == adventure.getRoom6()) {
                        System.out.println("You cant go west from " + currentPlace);
                    }

                    else if (currentPlace == adventure.getRoom7()) {
                        System.out.println("You cant go west from " + currentPlace);
                    }

                    else if (currentPlace == adventure.getRoom8()) {
                        currentPlace = adventure.getRoom7();
                    }

                    else if (currentPlace == adventure.getRoom9()) {
                        currentPlace = adventure.getRoom8();
                    }
                    break;

                case "look":
                    System.out.println("look around");
                    break;

                case "help":
                    System.out.println("print info");
                    break;

                case "exit":
                    System.exit(0);
                    break;
            }
        } while(userInput != "exit");




    }

    public void start(){
        user();
    }
}





