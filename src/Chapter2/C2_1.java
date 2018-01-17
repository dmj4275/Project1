package Chapter2;

import java.util.Scanner;

/**
 * program that asks the user for a temp in Celsius and converts it to
 * Fahrenheit
 *
 * @author Dylan Jamison
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) // Dylan Jamison
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in celsius:");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }

}
