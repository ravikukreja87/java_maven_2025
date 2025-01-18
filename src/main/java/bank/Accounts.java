package bank;


/**
 * Explain what this class does?
 * What are methods available in this class?
 * What are fields available in this class?
 * 
 * This class represents Account holders of a Bank
 */

public class Accounts {

	
	/**
	 * accountNumber - This is account number of a bank account holder. It is 6 numeric characters
	 * accountHolderName - First name, middle name and last name of account holder. All three must be separated by spaces
	 */
	private int accountNumber;
	private String accountHolderName;
	private String branch;
	private String accountType;
	private double accountBalance;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void depositMoney(int moneyToBeDeposited) {
		this.accountBalance = this.accountBalance + moneyToBeDeposited;

	}
	
	public void withdrawMoney(int moneyToBeWithdrawn) {
		this.accountBalance = this.accountBalance - moneyToBeWithdrawn;
	}
	
	/**
	 * This method calculates interest amount based on provided interestPercentage as a parameter
	 * And adds the interest to the overall principal amount.
	 * @param interestPercentage
	 */
	public void creditInterestToAccount(double interestPercentage) {
		double interestAmount = this.accountBalance * interestPercentage /100;
		this.accountBalance = this.accountBalance + interestAmount;
	}
	

}
