package controlllers;

import farmProduction.productionLists;

import java.util.Scanner;

public class animals {
    static Scanner scanner = new Scanner(System.in);

    public static void buyCows() {
        int numberOfCowsToBeBought = 0;

        System.out.println("How many cows you wanna buy?");
        try {
            numberOfCowsToBeBought = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
        productionLists.addCows(numberOfCowsToBeBought);
        System.out.println("--------------------------------------------------");
        System.out.println(numberOfCowsToBeBought + (numberOfCowsToBeBought > 1 ? " baby cows were bought!" :
                " baby cow was bought!"));

        if (numberOfCowsToBeBought > 0) {
            System.out.println("Wanna see your " + (numberOfCowsToBeBought > 1 ? "cows" : "cow") +
                    " details?");
            if (scanner.next().equalsIgnoreCase("yes")) {
                viewCowsDetails();
            }

            System.out.println("Wanna rename your " + (productionLists.getCowList().size() > 1 ? "cows" : "cow") + "?");
            System.out.println("--- REMEMBER IT ONLY CAN BE DONE ONCE!!! ---");
            if (scanner.next().equalsIgnoreCase("yes")) {
                changeCowsNames();
            }
        }
    }

    public static void changeCowsNames() {
        int numbersOfCows = productionLists.getCowList().size();
        for (int i = 0; i < numbersOfCows; i++) {
            System.out.print("Enter a new name for cow " + (i + 1) + ": ");
            String newName = scanner.next();
            productionLists.getCowList().get(i).setName(newName);
        }
        System.out.println("Wanna see your " + (numbersOfCows > 1 ? "cows" : "cow") +
                " details?");
        if (scanner.next().equalsIgnoreCase("yes")) {
            viewCowsDetails();
        }
    }

    public static void viewCowsDetails(){
        int numberOfCows = productionLists.getCowList().size();
        System.out.println("--------------------------------------------------");
        System.out.println("You have a herd of "+ numberOfCows + (numberOfCows > 1 ? " cows!" : " cow!"));
        for (farmProduction.producers.animals.cow cow : productionLists.getCowList()) {
            System.out.println("Specie: " + cow.getSpecie()
                    + ", Name: " + cow.getName()
                    + ", Age: " + cow.getAge()
                    + ", Life Expectancy: " + cow.getLifeExpectancy()
                    + ", Gender: " + cow.getGender()
                    + ", Weight: " + cow.getWeight() + "Kg");
        }
        System.out.println("--------------------------------------------------");
    }
}