package Chapter4;

import java.util.Scanner;

/**
 * Program that asks the user for a major and year and it will give you a grade
 * depending on that answer
 *
 * @author Dylan Jamison
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) // Dylan Jamison
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two characters:");
        String a = input.next().toUpperCase();
        char b = a.charAt(0);
        char c = a.charAt(1);
        String major = "";
        String year = "";
        if (b != 'M' && b != 'C' && b != 'I' && c != '1' && c != '2' && c != '3' && c != '4') {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        if (b == 'M') {
            major = "Mathematics";
        }
        if (b == 'C') {
            major = "Computer Science";
        }
        if (b == 'I') {
            major = "Information Technology";
        }
        if (c == '1') {
            year = "freshman";
        }
        if (c == '2') {
            year = "sophomore";
        }
        if (c == '3') {
            year = "junior";
        }
        if (c == '4') {
            year = "senior";
        }
        System.out.println(major + " " + year);
    }

}
