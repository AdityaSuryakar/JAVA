/* Accept 2 double values from User (using Scanner). Check data type. If arguments are not 
doubles, supply suitable error message & terminate. 
If numbers are double values, print its average. 
Hint : Check Scanner class for the methods*/

package Assignment1;
import java.util.Scanner;
public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first double value: ");
        // Check if next input is a double
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Invalid input. Please enter a valid double value.");
            return; // terminate program
        }
        double num1 = sc.nextDouble();

        System.out.print("Enter second double value: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Invalid input. Please enter a valid double value.");
            return; // terminate program
        }
        double num2 = sc.nextDouble();

        // Calculate average
        double average = (num1 + num2) / 2;

        System.out.println("Average of " + num1 + " and " + num2 + " is: " + average);
	}

}
