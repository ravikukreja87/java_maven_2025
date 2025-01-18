
public class TextVariables {

	public static void main(String[] args) {

		char choice = 'y'; // 1 byte
//		System.out.println(choice);

//char datatype containg one character

		String description = "This is Java Training on Sunday, 12th December 2024!";
		String space = " ";
		String day = "Sunday"; //Sunday | S->0 | u->1 | n->2 | d->3 | a->4 | y->5

//		System.out.println(description);
//		System.out.println(day);

//		String concatenatedStr = description + space + day;
		String concatenatedStr = description.concat(space).concat(day);

		System.out.println(day.charAt(1));
		
		

//		System.out.println(concatenatedStr);

	}

}
