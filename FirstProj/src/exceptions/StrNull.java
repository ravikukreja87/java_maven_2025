package exceptions;

public class StrNull {

	public static void main(String[] args) {

		try {
			String test = ""; // THis is string with zero length/empty string
			String testOne = null; // This is null string
			int len = testOne.length();
			System.out.println(len);
		} catch (NullPointerException npe) {
			System.out.println("String is null!!!");
		}

	}

}
