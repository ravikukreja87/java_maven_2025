package multi_calc;

public class BaseCalculator {
	
	
	//I want this base calculator add method to be accessible to only my class and my child classes 
	//protected ensures that method is accessible to same class and child class only
	//public - method is accessible everywhere
	//private - method is accessible in same class only
	//<default> - <no access modifier>. Method multiply is default. Same package only. (Also called as package access modifier)
	//provides access to methods within classes of same package only
	
	protected int add(int firstNum, int secondNum) {
		return firstNum + secondNum;
	}
	
	public int sub(int firstNum, int secondNum) {
		return firstNum - secondNum;
	}

	int multiply(int firstNum, int secondNum) {
		return firstNum * secondNum;
	}

	public int divide(int firstNum, int secondNum) {
		return firstNum / secondNum;
	}
	
	public int remainder(int firstNum, int secondNum) {
		return firstNum % secondNum;
	}

}
