package bank_inheritence;

public class BankAccount {

	private long accountNumber;
	private String accountName;
	private double accountBalance;

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void openAccount(int accountNumber, String accountName) {
		setAccountName(accountName);
		setAccountNumber(accountNumber);
	}

	public void depositMoney(double amountToDeposit) {
		double newAccountBalance = getAccountBalance() + amountToDeposit;
		setAccountBalance(newAccountBalance);

	}

	public void withdrawtMoney(double amountToWithdraw) {
		double newAccountBalance = getAccountBalance() - amountToWithdraw;
		setAccountBalance(newAccountBalance);

	}

}
