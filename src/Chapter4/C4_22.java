package Chapter4;

import java.util.Scanner;

/**
 * Program that ask the user for two strings and then tells you if one of the
 * strings is the substring of the other
 *
 * @author Dylan Jamison
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) // Dylan Jamison
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string s1:");
        String s1 = input.next();
        System.out.println("Enter string s2:");
        String s2 = input.next();
        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }
    }

}
