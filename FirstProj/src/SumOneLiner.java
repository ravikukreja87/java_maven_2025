
public class SumOneLiner {

	public static void main(String[] args) {

		int one = 10;
		int two = 20;

		System.out.println("Sum of two numbers - " + one + " + " + two + " is =  " + (one + two));
		System.out.println("Sum of two numbers - " + one + " + " + two + " is =  " + one + two);
		int res = one + two;
		System.out.println("Sum of two numbers (res var) - " + one + " + " + two + " is =  " + res);
		// BODMAS --> Bracket Open Divide Multiply Add Sub
		// Sum of two number 10 + 20 is = 30 - one and two are added
		// Sum of two number 10 + 20 is = 1020 - one and two are concatenated
	}

}
