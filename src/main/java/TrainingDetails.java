
public class TrainingDetails {

	public static void main(String[] args) {

		String name = "Java Selenium - Operators & Data Types";
		String day = "Sunday";
		String date = "8th Dec 2024";
		String place = "Teams - Virtual";

		// One alternative to creating multiple variables for same context/type of data
		// is a bad idea
//		System.out.println(name + "\n" + day + "\n" + date + "\n" + place);

		// training variable is Array of Strings
		String[] training = { "Java Selenium - Operators & Data Types", "Sunday", "8th Dec 2024", "Teams - Virtual" };
		// numbers variable is an array of all even number less than 11
		int[] numbers = { 2, 4, 6, 8, 10 };

		int addAllNumbers = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4]; //size -1
		System.out.println(addAllNumbers);

		System.out.println(training[0] + " " + training[1] + "\n" + training[2] + "\t" + training[3]);

	}

}
