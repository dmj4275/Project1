package Chapter2;

import java.util.Scanner;

/**
 * Program that calculates the total price of food by asking the user for
 * certain variables
 *
 * @author Dylan Jamison
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of the meal:");
        double priceOfMeal = input.nextDouble();
        System.out.println("Enter the price of the drink:");
        double priceOfDrink = input.nextDouble();
        System.out.println("Enter the price of the dessert:");
        double priceOfDessert = input.nextDouble();
        double priceOfFood = priceOfMeal + priceOfDrink + priceOfDessert;
        double salesT = priceOfFood * .10;
        double tip = (priceOfFood + salesT) * .15;
        double total = priceOfFood + salesT + tip;
        System.out.println("The price of food is: " + priceOfFood);
        System.out.println("The sales tax is: " + salesT);
        System.out.println("The tip is: " + tip);
        System.out.println("The total cost is: " + total);

    }

}
