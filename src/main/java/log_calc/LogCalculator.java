package log_calc;

import multi_calc.BaseCalculator;

public class LogCalculator {

	public double logValue(double firstNum, int secondNum) {
		return Math.log(firstNum);
	}

	// I do not want to inherit from parent class

	public int addLogCalc(int firstNum, int secondNum) {
		BaseCalculator baseCalculator = new BaseCalculator();
		return baseCalculator.divide(firstNum, secondNum);
	}

}
