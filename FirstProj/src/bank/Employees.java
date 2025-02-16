package bank;

public class Employees {

	private String empName;
	private int empCode;
	private double salary;
	private String designation;
	String workingLocation; //this is default access modifier

	/*
	 * public is an access modifier - Field/method/class/constructor - These things can be accessed anywhere (in any class) in my project
	 * 
	 * private - Only current class can use the field/method
	 * 
	 * private fields/data members and public setter methods --> Encapsulation
	 * 
	 * 
	 * protected
	 * 
	 * default - Access data/methods within same package
	 * 
	*/
	public Employees(int empCode) {
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpCode() {
		return empCode;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
