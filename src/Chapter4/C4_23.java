package Chapter4;

import java.util.Scanner;

/**
 * Program that has the user enter basic information and then uses that to find
 * the amount of tax they would have to pay
 *
 * @author Dylan Jamison
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) // Dylan Jamison
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee's name:");
        String name = input.next();
        System.out.println("Enter number of hours worked:");
        double hours = input.nextDouble();
        System.out.println("Enter hourly pay rate:");
        double payRate = input.nextDouble();
        System.out.println("Enter federal tax withholding rate:");
        double fTaxRate = input.nextDouble();
        System.out.println("Enter state tax withholding rate:");
        double sTaxRate = input.nextDouble();
        System.out.printf("Employee Name: %s ", name);
        System.out.printf("Hours worked: %.2f", hours);
        System.out.printf("Pay Rate:  %.2f", payRate);
        double gross = hours * payRate;
        System.out.printf("Gross Pay: %.2f", gross);
        System.out.println("Deductions:");
        double fTax = gross * fTaxRate;
        double sTax = gross * sTaxRate;
        System.out.printf(" Federal Withholding: %.2f", fTax);
        System.out.printf(" State Withholding: %.2f ", sTax);
        double totalDed = fTax + sTax;
        System.out.printf(" Total Deduction: %.2f ", totalDed);
        double netPay = gross - totalDed;
        System.out.printf("Net Pay: %.2f ", netPay);

    }

}
