import java.util.Scanner;

public class UserInput {

	/**
	 * 
	 * Enter First Number : 200
	 * Enter Second Number : 100
	 * Output
	 * ===============
	 * Addition of 200 and 100 = 300
	 * Subtraction of 200 and 100 = 100
	 * Multiplication of 200 and 100 = 20000
	 * Division of 200 and 100 = 2
	 * Remainder of 200 divide 100 = 0	 * 
	 */

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("============CALCULATOR============");
		
		System.out.print("Enter First Number: ");
		int firstNumber = in.nextInt(); //Program will wait here for user to enter number. Once user enters the number and presses enter key , that number
		//will be assigned to variable firstNumber
		
		System.out.print("Enter Second Number: ");
		int secondNumber = in.nextInt();
		
		int  sum = firstNumber + secondNumber;
		int sub = firstNumber - secondNumber;
		int product = firstNumber * secondNumber;
		int div = firstNumber / secondNumber;
		int remainder = firstNumber % secondNumber;

		System.out.println(" Addition of " + firstNumber +" and " + secondNumber + " = " + sum);
		System.out.println(" Subtraction of " + firstNumber +" and " + secondNumber + " = " + sub);
		System.out.println(" Multiplication of " + firstNumber +" and " + secondNumber + " = " + product);
		System.out.println(" Division of " + firstNumber +" and " + secondNumber + " = " + div);
		System.out.println(" Remainder of " + firstNumber +" and " + secondNumber + " = " + remainder);
	}

}
