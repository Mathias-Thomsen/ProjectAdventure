import java.util.Scanner;

public class Userinterface {


    public void userinterface() {
        Scanner scanner = new Scanner(System.in);
        Adventure adventure = new Adventure();
        String userInput;




        do {

            System.out.println("You are in " + adventure.getSelectedRoom() + " Where do you want to go");
            userInput = scanner.nextLine();


            if (adventure.go(userInput)){
                System.out.println(adventure.getSelectedRoom());
            } else {
                System.out.println("You can not go that way");
            }






        }while (userInput != "exit");
    }
}




