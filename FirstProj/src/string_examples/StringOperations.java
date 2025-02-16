package string_examples;

public class StringOperations {

	public static void main(String[] args) {

		final String demo = "This is demo string"; // demo is constant
		String test = "This is a test string"; // test is variable

		System.out.println(test);
		// convert all characters to upper case

		test = test.toUpperCase();

		System.out.println(test);

		test = test.toLowerCase();
		System.out.println(test);

		System.out.println(demo);
		String demoUpdated = demo.toUpperCase();
		System.out.println(demoUpdated);
		

	}

}
