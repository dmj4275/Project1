package Chapter3;

import java.util.Scanner;

/**
 * Program that asks the use for a number then shows if it is divisible by 5 or
 * 6
 *
 * @author Dylan Jamison
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) // Dylan Jamison
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        double num = input.nextDouble();
        if (num % 5 == 0 && num % 6 == 0) {
            System.out.println("Is " + num + " divisible by 5 and 6? true");
        } else {
            System.out.println("Is " + num + " divisible by 5 and 6? false");
        }
        if (num % 5 == 0 || num % 6 == 0) {
            System.out.println("Is " + num + " divisible by 5 or 6? true");
        } else {
            System.out.println("Is " + num + " divisible by 5 or 6? false");
        }
        if (num % 5 == 0 && num % 6 != 0 || num % 6 == 0 && num % 5 != 0) {
            System.out.println("Is " + num + " divisible by 5 or 6,but not both? true");
        } else {
            System.out.println("Is " + num + " divisible by 5 or 6,but not both? false");
        }

    }

}
