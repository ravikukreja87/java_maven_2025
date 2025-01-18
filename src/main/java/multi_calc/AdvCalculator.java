package multi_calc;

//This class can inherit the methods/actions/processes of Base Calculator
//Base Calculator becomes parent class/super class
//Adv Calc becomes child class/sub class

//I wanted to inherit methods from BaseCalculator (+,/,-,*)

//Parent class cannot inherit methods of child class

public class AdvCalculator extends BaseCalculator {

	public double percentage(double firstNum, double secondNum) {
		return secondNum / (firstNum + secondNum) * 100;
	}

	public double sqRoot(double firstNum, int secondNum) {
		return Math.sqrt(firstNum);
	}
	
	//I need add method which should add two numbers and print that "Numbers are added successfully."
	
	protected int add(int firstNum, int secondNum) { //Overridden method
		System.out.println("Numbers are added successfully");
		return firstNum + secondNum;
	}

}
