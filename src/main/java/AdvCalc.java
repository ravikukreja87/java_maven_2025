import java.util.Scanner;

public class AdvCalc {

	/**
	 * Use case 1 ============CALCULATOR============ Enter First Number : 200 Enter
	 * Operation to be performed (+ , -, *, /, %) : + Enter Second Number : 100
	 * =============== Output =============== Addition of 200 and 100 = 300 Do you
	 * want to continue? (y/n) : n Closing Calculator
	 * 
	 * Use Case 2 ============CALCULATOR============ Enter First Number : 300 Enter
	 * Operation to be performed (+ , -, *, /, %) : - Enter Second Number : 100
	 * =============== Output =============== Subtraction of 300 and 100 = 200 Do
	 * you want to continue? (y/n) : y ============CALCULATOR============ Enter
	 * First Number :
	 * 
	 * 
	 * 
	 * After my output is displayed, I want to ask user whether they want to
	 * continue or quit? Do you want to continue? (y/n) :
	 */

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("============CALCULATOR============");
		String condition = "";

		do {
			System.out.print("Enter First Number: ");
			int firstNumber = in.nextInt(); // Program will wait here for user to enter number. Once user enters the
											// number
											// and presses enter key , that number
			// will be assigned to variable firstNumber

			System.out.println("Enter Operation to be performed (+ , -, *, /, %) : ");
			//		char operation = in.next();

			System.out.print("Enter Second Number: ");
			int secondNumber = in.nextInt();

			int sum = firstNumber + secondNumber;
			int sub = firstNumber - secondNumber;
			int product = firstNumber * secondNumber;
			int div = firstNumber / secondNumber;
			int remainder = firstNumber % secondNumber;

			System.out.println(" Addition of " + firstNumber + " and " + secondNumber + " = " + sum);
			System.out.println(" Subtraction of " + firstNumber + " and " + secondNumber + " = " + sub);
			System.out.println(" Multiplication of " + firstNumber + " and " + secondNumber + " = " + product);
			System.out.println(" Division of " + firstNumber + " and " + secondNumber + " = " + div);
			System.out.println(" Remainder of " + firstNumber + " and " + secondNumber + " = " + remainder);
			System.out.println("================================");
			System.out.print("Do you want to continue? (y/n) :");
			condition = in.next();
		} while (condition.equals("y"));
		System.out.println("Ending the program now!!!");

	}

}
