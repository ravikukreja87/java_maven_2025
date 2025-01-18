package loops_demo;

import java.util.Scanner;

/*

5 X 1 = 5
5 X 2 = 10
....
....
...
5 X 10 = 50

*/
public class TableAdv {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number for which table should be printed : ");
		int number = in.nextInt();
		System.out.print("Enter the number upto which table rows should be printed : ");
		int times = in.nextInt();

		if (times > 100) {
			System.out.println("Too large times value. Provide a value less than 100");
			return; // Close the main method here
		}

		for (int i = 1; i <= times; i++) {
			// i++ ==> i = i +1

			System.out.println(number + " X " + i + " = " + (number * i));

		}

		System.out.println("Exiting");

		// Iteration 1 --> initially value of loop variable i is 1, condition is 1 <= 10
		// which is true, execute loop block, and i is incremented by 1 to value 2
		// Iteration 2 --> condition is 2 <= 10 which is true, execute loop block, and i
		// is incremented by 1 to value 3
		// Iteration 3 --> condition is 3 <= 10 which is true, execute loop block, and i
		// is incremented by 1 to value 4
		// ..
		// ...
		///...Iteration 10 --> condition is 10 <= 10 which is true, execute loop block, and i is incremented by 1 to value 11
		// Iteration 11 --> condition is 11 <= 10 which is false, loop breaks.

	}

}
