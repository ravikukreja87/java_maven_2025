package loops_demo;

public class DoWhileLoop {

	public static void main(String[] args) {

		int i = 1;
		do {
			System.out.println("Number is = " + i);
			i++;
		} while (i <= 0);

		//The loop block/body executes at-least once, irrespective of condition is True/False
		//Here i = 1 and condition is 1 < = 0 --> False
		//It executed the loop body and then checked for the condition/expression was evaluated
	}

}
