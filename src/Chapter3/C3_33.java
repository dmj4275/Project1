package Chapter3;

import java.util.Scanner;

/**
 * Program that asks the user for the weight and prices of two packages and sees
 * which package has the better deal
 *
 * @author Dylan Jamison
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) // Dylan Jamison
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a weight for package 1:");
        double w1 = input.nextDouble();
        System.out.println("Enter a price for package 1:");
        double p1 = input.nextDouble();
        System.out.println("Enter a weight for package 2:");
        double w2 = input.nextDouble();
        System.out.println("Enter a price for package 2:");
        double p2 = input.nextDouble();
        double d1 = w1 / p1;
        double d2 = w2 / p2;
        if (d1 < d2) {
            System.out.println("Package 1 has the better price.");
        }
        if (d2 < d1) {
            System.out.println("Package 2 has the better price.");
        }

    }

}
