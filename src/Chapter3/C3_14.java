package Chapter3;

import java.util.Scanner;
import java.util.Random;

/**
 * Program that simulates the game of flipping a coin and randomizes the result
 *
 * @author Dylan Jamison
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) // Dylan Jamison
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Heads(0) or Tails(1)?");
        double guess = input.nextDouble();
        Random num = new Random();
        int RandomNum = num.nextInt(2);
        if (guess == 0) {
            if (RandomNum == 0) {
                System.out.println("You're right!");
            } else {
                System.out.println("You're wrong!");
            }
        }
        if (guess == 1) {
            if (RandomNum == 1) {
                System.out.println("You're right!");
            } else {
                System.out.println("You're wrong!");
            }
        }

    }

}
