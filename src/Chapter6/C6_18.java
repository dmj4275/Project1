
package Chapter6;

import java.util.Scanner;

/**
 * Program that has the user enter a word and the computer guesses what it is
 *
 * @author Dylan Jamison
 */
public class C6_18 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     * @param checkAmount checking the amount of the user's balance
     * @param checkValidity checking the validity of the user's check
     * @param checkInts checks the numbers from the user's balance
     */
    public int counter = 0;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Rules:");
        System.out.print("\nMust have 8 characters\nMust consist of only numbers and letters\nMust contain at least 2 digits");
        System.out.print("\nEnter a pass>> ");
        String user = input.next();
        
        checkValidity(user);
        
        checkAmount(user);
        
        checkInts(user);
        
        System.out.println("VALID PASSWORD");
    }
    public static void checkAmount(String user)
    {
        if(user.length() < 8)
        {
            user = "ERROR";
            System.out.println(user + " Too short");
            System.exit(0);
        }
    }
    public static void checkValidity(String user)
    {
        for(int x = 0; x < user.length(); ++x)
        {
            if(!Character.isLetterOrDigit(user.charAt(x)))
            {
                user = "ERROR";
                System.out.println(user + " Contains invalid character");
                System.exit(0);
            }
        }
    }
    public static void checkInts(String user)
    {
        int counter = 0;
        for(int x = 0; x < user.length(); ++x)
        {
            if(Character.isDigit(user.charAt(x)))
            {
                ++counter;
            }
        }
        if(counter < 2)
        {
            user = "ERROR";
            System.out.print(user + " Not enough integers\n");
            System.exit(0);
        }
    }

    
}
