import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {

		// 1. Read color from user
		// 2. If color is in Violet Indigo Blue Green Yellow Orange Red
		// 3. Print Rainbow color
		// 4. Print not a rainbow color

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the color: ");
		String color = in.next();

		switch (color.toLowerCase()) {
		case "violet":
			System.out.println("RAINBOW Color");
			break;
		case "indigo":
			System.out.println("RAINBOW Color");
			break;
		case "blue":
			System.out.println("RAINBOW Color");
			break;
		case "green":
			System.out.println("RAINBOW Color");
			break;
		case "yellow":
			System.out.println("RAINBOW Color");
			break;
		case "orange":
			System.out.println("RAINBOW Color");
			break;
		case "red":
			System.out.println("RAINBOW Color");
			break;
		default:
			System.out.println("NOT a RAINBOW Color");
		}
	}
}