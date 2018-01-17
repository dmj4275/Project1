
package Chapter5;

import java.util.Scanner;

/**
 * Program that reverses the string that the user inputs
 *
 * @author Dylan Jamison
 */
public class C5_46 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string>> ");
        String user = input.next();
        String userReversed = new StringBuilder(user).reverse().toString();
        System.out.printf("\nYou entered '%s'; the reversed string is '%s'", user, userReversed);
    }

    
}
