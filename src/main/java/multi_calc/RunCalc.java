package multi_calc;

public class RunCalc {

	public static void main(String[] args) {

		int numberOne = 15;
		int numberTwo = 6;
		int result = 0;

		BaseCalculator baseCalculator = new BaseCalculator();
		result = baseCalculator.add(numberOne, numberTwo);
		System.out.println("Result Addition Base: " + result);
		System.out.println("=====================================");
		/**
		 * result = baseCalculator.sub(numberOne, numberTwo); System.out.println("Result
		 * Subtraction : " + result);
		 * 
		 * result = baseCalculator.multiply(numberOne, numberTwo);
		 * System.out.println("Result Product : " + result);
		 * 
		 * result = baseCalculator.divide(numberOne, numberTwo);
		 * System.out.println("Result Division : " + result);
		 */

		AdvCalculator advCalculator = new AdvCalculator();
		result = advCalculator.add(numberOne, numberTwo);
		System.out.println("Result Addition Adv: " + result);
		
		//add method is over-ridden in AdvCalculator class
		/**
		 * advCalculator.percentage(numberOne, numberTwo); System.out.println("Result
		 * Percentage: " + resultAdv + "%");
		 * 
		 * resultAdv = advCalculator.sqRoot(numberOne, numberTwo);
		 * System.out.println("Result Sq Root: " + resultAdv);
		 * 
		 * 
		 * 
		 * result = advCalculator.remainder(numberOne, numberTwo);
		 * System.out.println("Result Remainder : " + result);
		 */

		/*
		 * LogCalculator logCalculator = new LogCalculator(); // double resultLog =
		 * logCalculator.logValue(numberTwo, numberOne); //
		 * System.out.println("Result Log: " + resultLog);
		 * 
		 * result = logCalculator.addLogCalc(numberOne, numberTwo);
		 * System.out.println("Result Subtraction : " + result);
		 */

	}

}
