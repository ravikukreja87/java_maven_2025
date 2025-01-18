package loops_demo;

import java.util.Scanner;

/*
	Print multiples of 3 in reverse order for a given number
	Enter a number: 30
	30
	27
	24
	...
	...
	...
	0
*/

public class ForLoopDec {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = in.nextInt();

		if (num % 3 == 0) {
			System.out.println("All multiples of 3 are --");
			for (int i = num   ;     i >= 0    ;     i = i - 3) {

				System.out.println(i);

			}
		} else {
			System.out.println("Entered number is not a multiple of 3");
		}

	}

}
