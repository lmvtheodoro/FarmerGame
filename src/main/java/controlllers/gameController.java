package controlllers;

import controlllers.Animals.cowController;
import java.util.Scanner;

public class gameController {

    static Scanner scanner = new Scanner(System.in);

    public static void welcomePlayer(){
        System.out.println("--------------------------------------------------");
        System.out.println("Hello farmer. Welcome to the best farm game you could play!!!");
        System.out.println("--------------------------------------------------");

        System.out.println("Wanna learn the rules? - Yes or Type any key");
        if(scanner.next().equalsIgnoreCase("yes")){
           System.out.println("blablabla....");
        }
        System.out.println("--------------------------------------------------");
        System.out.println("It is time to set up your farmer!");
    }

    public static void gameFlow(){
        //TODO: Build farmer
        //TODO: Build farm
        System.out.println("Press 1 - Buy Animals");
        //TODO: Create more animals options (Chikens and Pigs using Cows example)
        cowController.buyCows();
        System.out.println("Press 2 - Buy Harvesters");
        //TODO: Harvesters options
    }

    public static void exitGame(){
        System.out.println("Closing game...");
    }
}