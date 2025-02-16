import java.util.Scanner;

public class RainbowColorFinder {

	public static void main(String[] args) {

		// 1. Read color from user
		// 2. If color is in Violet Indigo Blue Green Yellow Orange Red
		// 3. Print Rainbow color
		// 4. Print not a rainbow color

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the color: ");
		String color = in.next();

		if (color.equalsIgnoreCase("violet")) {
			System.out.println("Color is part of RAINBOW colors");
		} else if (color.equalsIgnoreCase("indigo")) {
			
			System.out.println("Color is part of RAINBOW colors");
		
		} else if (color.equalsIgnoreCase("blue")) {
			System.out.println("Color is part of RAINBOW colors");
		} else if (color.equalsIgnoreCase("green")) {
			System.out.println("Color is part of RAINBOW colors");
		} else if (color.equalsIgnoreCase("yellow")) {
			System.out.println("Color is part of RAINBOW colors");
		} else if (color.equalsIgnoreCase("orange")) {
			System.out.println("Color is part of RAINBOW colors");
		} else if (color.equalsIgnoreCase("red")) {
			System.out.println("Color is part of RAINBOW colors");
		} else {
			System.out.println("Not a RAINBOW");
		}

		// == will not work for String, because is not a primitive data type
		// Workaround / alternate approach

	}

}
