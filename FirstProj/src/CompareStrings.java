
public class CompareStrings {

	public static void main(String[] args) {

		// Assertion , Verification

		String firstString = "This is demo";
		String secondString = "this is demo";

		// 1. We have 2 Strings to compare
		// 2. Compare both the Strings
		// 3. Outcome --> Either strings are same or different
		// 4. Outcome --> true - if strings are same || false - if strings are different

		boolean areStringsEqual = firstString.equalsIgnoreCase(secondString); //boolean means either true/false

		System.out.println(areStringsEqual);
		// I am using equals method on first string and comparing it to second string

	}

}
