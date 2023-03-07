/* Program Purpose: This program asks the user to input the total sales of a business 
and then calculates state tax, local tax, and final sales of the business
*/
import java.util.Scanner;
public class SalesTax
{
    public static void main(String args[])
    {
        // Defining constants
        final double state_Tax = 0.307;
        final double local_Tax = 0.06;

        // Declaring variables
        double totalSales , state , local , finalsales;

        // Create a scanner object
        Scanner sc = new Scanner(System.in);

        // This is to input the total sales of the business
        System.out.print("Input total sales: ");
        totalSales = sc.nextDouble();
        

        // Calculations
        state = (totalSales * state_Tax); // STATETAX
        local = (totalSales * local_Tax); // LOCALTAX
        finalsales = (totalSales - state - local); // FINAL SALES

        // Output to the end user
        System.out.printf("The total sales for the month is: %.2f" , totalSales);
        System.out.printf("\nThe state tax for the month is: %.2f" ,state);
        System.out.printf("\nThe local tax for the month is: %.2f"  ,local );
        System.out.print("\nThe final sales amount is: " );
        System.out.format("%.2f" , finalsales);
        
       





    }
}