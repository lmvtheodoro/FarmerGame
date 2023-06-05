package controlllers;

import java.util.Scanner;

public class game {
    static boolean isFarmSetUp = false;
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
        System.out.println("It is time to set up your farm!");
    }

    public static void gameFlow(){
        while(!isFarmSetUp){
            System.out.println("--------------------------------------------------");
            //TODO: Set up player name and money(Dificulty)
            //TODO: Buy a farm

            System.out.println("--> Wanna buy animals?");
            System.out.println("1 - Buy Cow / 2 - Buy Chicken / 3 - Buy Pigs");
            System.out.println("Other keys to skip...");
            //TODO: ONGOING: Buy Animals (Implement other animals methods)
                animals.buyCows();

            System.out.println("Press 2 - Buy Machinery");
            //TODO: Buy machinery

            System.out.println("Press 3 - Contract worker");
            //TODO: Contract workers

            System.out.println("Is your farm set up? Yes or Any Key");
            if(scanner.next().equalsIgnoreCase("yes")){
                isFarmSetUp = true;
            }
            System.out.println("--------------------------------------------------");
        }
        //TODO: Start game
        //TODO: Interactive turns
        //TODO: End game and deliver results
    }

    public static void exitGame(){
        System.out.println("Closing game...");
    }
}