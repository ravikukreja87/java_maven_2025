import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {

		// GRADING SYSTEM
		// 1. Read/Get Percentage that a student has scored.
		// 2. If student scored greater that 80% --> A Grade
		// 3. If student scored between 60-80% --> B Grade
		// 4. If student scored between 40-60% --> C Grade
		// 5. If student scored less than 40 -->FAIL
		// 6. If user enters data > 100 --> Say Invalid data, enter values between 0-100
		// 7. For negative percentage --> Say Invalid data, enter values between 0-100
		System.out.println("=============GRADING SYSTEM=============");
		Scanner in = new Scanner(System.in);
		String condition = "";
		do {
			System.out.print("Enter student percentage: ");
			int percentage = in.nextInt();

			// 85>80 --> true
			if (percentage > 100) {
				System.out.println("Invalid data, enter values between 0-100");
			} else if (percentage >= 80 && percentage <= 100) {
				System.out.println("Grade A");
			} else if (percentage >= 60 && percentage < 80) {
				System.out.println("Grade B");
			} else if (percentage >= 40 && percentage < 60) {
				System.out.println("Grade C");
			} else if (percentage < 40 && percentage >= 0) {
				System.out.println("FAIL");
			} else {
				System.out.println("Invalid data, enter values between 0-100");
			}

			System.out.print("Do you want to continue? (yes/no) : ");
			condition = in.next();
		} while (condition.equalsIgnoreCase("yes"));
		System.out.println("Exiting!");
	}

}
