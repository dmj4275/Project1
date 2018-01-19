
package Chapter6;

import java.util.Scanner;

/**
 * Program that can convert different currencies
 *
 * @author Dylan Jamison
 */
public class P6 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     * @param Conversion a conversion from money to provided currency
     */
    public static void main(String[] args)
    {       
        String user;
        Scanner input = new Scanner(System.in);
        double EuroWorth, PoundWorth, YenWorth, UserAmount;
        String selection;        
        double money = 0;
        System.out.print("How many Euros can ONE DOLLAR buy>> ");
        EuroWorth = input.nextDouble();//Assigns EuroWorth to user input
        System.out.print("How many Pound Sterlings(Pounds) can ONE DOLLAR buy>> ");
        PoundWorth = input.nextDouble();//Assigns PoundWorth to user input
        System.out.print("How many Yen can ONE DOLLAR buy>> ");
        YenWorth = input.nextDouble();//Assigns YenWorth to user input
        do{
        System.out.print("Enter 'E' to buy Euros\nEnter 'P' to buy Pounds\nEnter 'Y' to buy Yen>>\n>> ");
        selection = input.next();
        System.out.print("Enter the amount of dollars to convert>> ");
        UserAmount = input.nextDouble();
        if(selection.equalsIgnoreCase("E"))
        {
            money = Conversion(UserAmount, EuroWorth);
            System.out.printf("For %.2f dollars you will get %.2f euros", UserAmount, money);
        }
        if(selection.equalsIgnoreCase("Y"))
        {
            money = Conversion(UserAmount, YenWorth);
            System.out.printf("For %.2f dollars you will get %.2f yen", UserAmount, money);
        }
        if(selection.equalsIgnoreCase("P"))
        {
            money = Conversion(UserAmount, PoundWorth);
            System.out.printf("For %.2f dollars you will get %.2f yen", UserAmount, money);
        }
        do {
                System.out.print("\nContinue converting?(Y or N)>> ");
                user = input.next();
        } while(!user.equalsIgnoreCase("N") && !user.equalsIgnoreCase("Y"));
        }while(!user.equalsIgnoreCase("N"));
    }
    public static double Conversion(double UserAmount, double Worth)
    {   double money = 0;
        if(UserAmount > 100)
        {
            money = (UserAmount * Worth) - (UserAmount * 0.05);
        }
        else
        {
            money = (UserAmount * Worth) - (UserAmount * 0.10);
        }
        return money;
    }
    
}
