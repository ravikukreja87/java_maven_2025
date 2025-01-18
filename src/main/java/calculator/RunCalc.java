package calculator;

public class RunCalc {

	public static void main(String[] args) {

		/*
		 * Calculator add = new Calculator(); add.firstNumber = 10; add.secondNumber =
		 * 5; add.operation = "+"; add.addition();
		 * 
		 * add.showResult();
		 * 
		 * Calculator addAnother = new Calculator(); addAnother.firstNumber = 20;
		 * addAnother.secondNumber = 10; addAnother.operation = "+";
		 * addAnother.addition(); addAnother.showResult();
		 */

		NewCalculator newCalculator = new NewCalculator();
		int result = newCalculator.add(20, 20);
		int anotherResult = newCalculator.add(10, 20, 30);
		double decimalAdditionResult = newCalculator.add(2.3, 3.3);
		System.out.println(result);
		System.out.println(anotherResult);
		System.out.println(decimalAdditionResult);
	}
}
