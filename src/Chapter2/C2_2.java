package Chapter2;

import java.util.Scanner;

/**
 * Program that finds the area of a cylinder by asking for a radius and length
 *
 * @author Dylan Jamison
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) // Dylan Jamison
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a cylinder:");
        double radius = input.nextDouble();
        System.out.println("Enter the length of a cylinder:");
        double length = input.nextDouble();
        double area = (2 * 3.14 * (radius * radius)) + (length * (2 * 3.14 * radius));
        double volume = 3.14 * (radius * radius) * length;
        System.out.println("The area is " + area);
    }

}
