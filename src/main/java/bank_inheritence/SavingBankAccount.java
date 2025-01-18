package bank_inheritence;

public class SavingBankAccount extends BankAccount {

	public double showInterest(double interestRate, double accountBalance) {
		return accountBalance * interestRate / 100;
	}
	
	public void depositMoney(double amountToDeposit) {
		double newAccountBalance = getAccountBalance() + amountToDeposit + 1;
		setAccountBalance(newAccountBalance);

	}

}
