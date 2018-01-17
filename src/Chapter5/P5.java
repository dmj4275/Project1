
package Chapter5;

import java.util.Scanner;

/**
 * Program that takes the user's vote and prints the output of what the user voted
 *
 * @author Dylan Jamison
 */
public class P5 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumY = 0;
        int sumN = 0;
        String x = "";
        do {
            System.out.println("Enter y to vote yes and enter n to vote no.");
            x = input.next();
            if (x.equalsIgnoreCase("y"))
            {
                sumY++;
            }
            if (x.equalsIgnoreCase("n"))
            {
                sumN++;
            }
            else if(!x.equalsIgnoreCase("y") && !x.equalsIgnoreCase("n") && !x.equalsIgnoreCase("q"))
            {
                System.out.println("Invalid Input!");
            }
        } while (!x.equalsIgnoreCase("q"));
        System.out.println(sumY);
        System.out.println(sumN);
    }
    
}
