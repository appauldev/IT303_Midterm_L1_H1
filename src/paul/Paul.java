/**
 * 
 */
package paul;

import java.util.Scanner;

/**
 * @author plzsales
 *
 */
public class Paul {
	public static void main(String[] args) {
		// Initialize the required variables
		Scanner sc = new Scanner(System.in);
		int input_user = 0;
		boolean isValidInput = false;
		String input_parity = "";
		
		while(!isValidInput) {
			// use try-catch to catch exceptions
			try {
				// get user input
				System.out.print("Enter an integer: ");
				input_user = sc.nextInt();
				// if the input is valid, end the loop
				isValidInput = true;
			} catch (Exception e) {
				// print a short description of the throwable/error
				System.out.println("Error: " + e.toString());
				// clear the contents of the scanner
				sc.nextLine();
			}
		}
		sc.close();
		// evaluate if the input is odd or even using the ternary operator
		// variable = <condition> ? <value if condition is true> : <value if condition is false>
		input_parity = input_user % 2 == 0 ? "even" : "odd";
		System.out.println("The input integer is " + input_parity);
		
		System.out.println("***END OF PROGRAM***");
	}
}
