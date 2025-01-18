import java.util.Scanner;

public class EvenNumberIdentifier {
	
	
	public static void main(String[] args) {
		
		//Take a number from user
		//Find out if the number is even or not
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number to check even: ");
		int num = in.nextInt(); //Assigning num variable with a value entered by user on console
		
		//if I divide number by 2 and remainder is 0
		//remainder operator
		//num % 2 --> 0 --> even number
		//num % 2 --> 1 --> odd number
		//Need some conditional construct here which can help us achieve this task
		//Something which can evaluate condition and based on which it processes output
		//Out come of a condition is always T/F
		
		//Condition --> num%2 ==0 -->T/F
		//num % 2 == 0
		
		//6 --> true
		if(num % 2 ==0) {
			System.out.println("Number is an even number");
		} //if closing
		else {
			System.out.println("Number is an odd number");
		}
	
		//== is an equality operator. Compares LHS and RHS. 
		//= is an assignment operator
		// != is an non-equality comparison /// 5 !=7 (True)
		// ! --> Not operator --------------------------------------------> true (2==2) (7==7) (5 != 7)
		// (2==2) --> true
		//              !(3==3) --> false
	} //main closing

} //class closing
