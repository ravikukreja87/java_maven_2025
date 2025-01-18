package bank_inheritence;

public class RunBank {

	private static double interestRate = 4.12;

	public static void main(String[] args) {

		SavingBankAccount jon = new SavingBankAccount();
		jon.setAccountName("JON");
		jon.setAccountNumber(1);
		jon.depositMoney(5000);

		System.out.println("Account balance of " + jon.getAccountName() + " is Rs." + jon.getAccountBalance());

		jon.depositMoney(2000);
		System.out.println("Account balance of " + jon.getAccountName() + " is Rs." + jon.getAccountBalance());
		jon.depositMoney(3000);
		System.out.println("Account balance of " + jon.getAccountName() + " is Rs." + jon.getAccountBalance());
		jon.withdrawtMoney(2400);
		System.out.println("Account balance of " + jon.getAccountName() + " is Rs." + jon.getAccountBalance());

		double interest = jon.showInterest(interestRate, jon.getAccountBalance());
		System.out.println("Jon's Interest = " + interest);

		SavingBankAccount mark = new SavingBankAccount();

		mark.setAccountName("MARK");
		mark.setAccountNumber(2);
		mark.depositMoney(10000);

		System.out.println("Account balance of " + mark.getAccountName() + " is Rs." + mark.getAccountBalance());

		mark.depositMoney(2000);
		System.out.println("Account balance of " + mark.getAccountName() + " is Rs." + mark.getAccountBalance());
		mark.depositMoney(3000);
		System.out.println("Account balance of " + mark.getAccountName() + " is Rs." + mark.getAccountBalance());
		mark.withdrawtMoney(1200);
		System.out.println("Account balance of " + mark.getAccountName() + " is Rs." + mark.getAccountBalance());
		interest = mark.showInterest(interestRate, mark.getAccountBalance());
		System.out.println("Mark's Interest = " + interest);
		System.out.println("===================");
		CurrentBankAccount tom = new CurrentBankAccount();
		tom.setAccountBalance(1000);
		tom.setAccountName("TOM");
		tom.depositMoney(1000);
		System.out.println("Account balance of " + tom.getAccountName() + " is Rs." + tom.getAccountBalance());
		interest = tom.showInterest(10, tom.getAccountBalance());
		System.out.println("Tom's Interest = " + interest);

		SavingBankAccount tomSaving = new SavingBankAccount();
		tomSaving.setAccountBalance(1000);
		tomSaving.setAccountName("TOM Savings");
		tomSaving.depositMoney(1000);
		System.out.println("Account balance of " + tomSaving.getAccountName() + " is Rs." + tomSaving.getAccountBalance());
		interest = tomSaving.showInterest(10, tomSaving.getAccountBalance());
		System.out.println("Tom's Interest = " + interest);

	}

}
