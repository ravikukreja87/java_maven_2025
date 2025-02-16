package basic;

public class Calc {

	public static void main(String[] args) {

		double firstNumber = 200.25;
		double secondNumber = 100.10;

		double sum = firstNumber + secondNumber;
		double sub = firstNumber - secondNumber;
		double product = firstNumber * secondNumber;
		double div = firstNumber / secondNumber;

		System.out.println("Sum : " + sum); // Concatenation of String to the sum result. We can concatenate/append a
											// user freindly message by + operator
		//Str + double --> Append/Concatenante
		//Number + number = add
		//Double + double = add
		System.out.println("Difference :" + sub);
		System.out.println("Product :" + product);
		System.out.println("Division: " + div);
	}
//On line 9 with + operator, java is adding two variable values
	//On line 14,19,20,21 with + operator, java is appending or concatenating string with a variable value
	//Operator overloading in java. + operator does more than one job. Mathematically Adding & concatenating depending on data type
}
