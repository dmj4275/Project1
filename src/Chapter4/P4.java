package Chapter4;

import java.util.Scanner;

/**
 * Program that has the user enter two bidders and basic info about them and
 * then the program tells you which has a higher cost
 *
 * @author Dylan Jamison
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) // Dylan Jamison
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Name of first bidder:");
        String firstName = input.next();
        System.out.println("How many hours does the first bidder require?:");
        double reqHours1 = input.nextDouble();
        System.out.println("How many does the bidder charge per hour?:");
        double reqWage1 = input.nextDouble();
        System.out.println("Name of second bidder:");
        String secondName = input.next();
        System.out.println("How many hours does the second bidder require?:");
        double reqHours2 = input.nextDouble();
        System.out.println("How many does the bidder charge per hour?:");
        double reqWage2 = input.nextDouble();
        double cost1 = reqHours1 * reqWage1;
        double cost2 = reqHours2 * reqWage2;
        if (cost1 < cost2) {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", firstName, cost1, reqHours1);

        }
        if (cost2 < cost1) {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", secondName, cost2, reqHours2);
        }
        if (cost1 == cost2 && reqHours1 < reqHours2) {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", firstName, cost1, reqHours1);
        }
        if (cost2 == cost1 && reqHours2 < reqHours1) {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", secondName, cost2, reqHours2);
        }
        if (cost2 == cost1 && reqHours2 == reqHours1) {
            System.out.printf("Both bidders have identical costs with a total cost of %.2f and %d hours", cost2, reqHours2);
        }

    }

}
