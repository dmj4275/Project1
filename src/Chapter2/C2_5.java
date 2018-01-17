package Chapter2;

import java.util.Scanner;

/**
 * Program that finds the gratuity rate and the total by asking the user for
 * certain variables
 *
 * @author Dylan Jamison
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) // Dylan Jamison
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal:");
        double subtotal = input.nextDouble();
        System.out.println("Enter the gratuity rate(10 = 10%): ");
        double gr = input.nextDouble();
        gr = gr / 100;
        double gratuity = subtotal * gr;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is " + gratuity + " and the total is " + total);
    }

}
