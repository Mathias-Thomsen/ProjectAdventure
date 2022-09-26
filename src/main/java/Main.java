import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("You are in room 1. Where do you want to go");

        String userInput1 = scanner.nextLine();

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
                System.out.println("Looking around");
                break;

            case "help":
                System.out.println("print info");
                break;

            case "exit":
                break;
        }




    }
}
