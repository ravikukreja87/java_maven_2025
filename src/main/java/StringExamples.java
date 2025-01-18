
public class StringExamples {

	/*
	 * int addition() { int a = 5; int b = 10; int sum = a + b; return sum; }
	 */

	public static void main(String[] args) {
//		System.out.println(addition());
		// Main method returns nothing/void

		// Here void in main method is return type
		// Every method has a return type
		// Duck is swimming which is an action/act/function --> outcome (to cover
		// distance)
		// return types is type of return value

		// I create a function/method to add two number --> outcome is number which is
		// sum
		// return value is sum
		// return will have a type which is return type

		// int one = 5; int two = 10 ; int sum = one + two;

		// String is continuous block of characters

		// String is alpha-numeric

		// All string variable values must be surrounded in double quotes
		String day = "Saturday";
		String emptyString = ""; // Null but it is not void

		System.out.println(day.toUpperCase());
		System.out.println(day.toLowerCase());

//		System.out.println(month.charAt(5));
//		boolean test = date.contains(month);
//		System.out.println(test);

		String month = "decembeR";
		String prevMonth = "December";
		boolean check = month.equalsIgnoreCase(prevMonth);
		System.out.println("Check: " + check);
		String date = "  14 December 2024         ";

		boolean test = date.contains(month);
		System.out.println("test : " + test);

		// date.toLowerCase() --> 14-december-2024 --> contains --> decembeR.toLowerCase
		// --> december
		test = date.toLowerCase().contains(month.toLowerCase());
		System.out.println("test : " + test);

		System.out.println(date.length());
		System.out.println(date.trim().length());

		// I am trying to assign String Saturday to integer variable dayNumber
		// int datatype variable should contain on integers between (-2^32) to (2^32-1)

		// Proactive - Compile time errors - which are flagged by java compiler before
		// we run/execute program
		// Reactive - Runtime exceptions - which are flagged by JVM - JRE after we
		// run/execute the program

//		Type mismatch: 
		// cannot convert from String to int
		// StringExamples.java /FirstProj/src line 12 Java Problem

	}

}
