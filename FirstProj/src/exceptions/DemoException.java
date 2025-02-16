package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoException {

	/*
	 * Divide two numbers Enter first number : 10 Enter second number : 0 Division
	 * Result is = Infinity
	 */

	public static void main(String[] args) {

		int result = 0;
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter first number : ");
			int firstNum = in.nextInt();
			System.out.print("Enter second number : ");
			int secondNum = in.nextInt();

			result = firstNum / secondNum; // Here my program is getting terminated abruptly at run time due to
											// exception
			System.out.println("Result is = " + result);

		} catch (ArithmeticException ae) {
			// JVM will come here if exception is occured.
			// Which exception? Mention the exception type in round bracket after catch
			System.out.println("Result is = Infinity");
			System.out.println(ae.getMessage());

		} catch(InputMismatchException ime) {
			System.out.println("Enter numbers only!");
			//How do I know why java is giving me this exception
			System.out.println(ime.getMessage());
		}
		// If no exception code resumes from here
		// I want that in case user enters second number as 0
		// print Result is = Infinity
		// and continue for rest of program
		// To achieve this I have to do EXCEPTION HANDLING
		// Line 21 is risky code where exception is expected
		System.out.println("Exiting the program");
	}
}