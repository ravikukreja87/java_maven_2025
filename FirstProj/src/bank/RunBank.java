package bank;

public class RunBank {

	public static void main(String[] args) {

		Employees jon = new Employees(1);
		jon.setEmpName("Jon");
		jon.setDesignation("Manager");
		jon.setSalary(100000);

		Employees mark = new Employees(2);
		mark.setEmpName("Mark");
		mark.setDesignation("Teller");
		mark.setSalary(50000);

		Accounts rahul = new Accounts();
		rahul.setAccountHolderName("Rahul");
		rahul.setAccountNumber(100);
		rahul.setAccountType("Savings");
		rahul.setBranch("MG Road");
		rahul.setAccountBalance(10000);
		rahul.creditInterestToAccount(3);
		System.out.println(rahul.getAccountBalance());

		Accounts raj = new Accounts();
		raj.setAccountHolderName("Raj");
		raj.setAccountNumber(200);
		raj.setAccountType("Current");
		raj.setBranch("Main");
		raj.setAccountBalance(5000);
		raj.depositMoney(1000);
		raj.depositMoney(2000);
		raj.withdrawMoney(6000);
		System.out.println(raj.getAccountBalance()); //2000
		raj.creditInterestToAccount(2);
		System.out.println(raj.getAccountBalance()); //2040
		/*
		 * System.out.println(jon.getSalary());
		 * 
		 * jon.setSalary(200000); System.out.println(jon.getSalary());
		 */
		
		
		Accounts rohit = new Accounts();
		rohit.creditInterestToAccount(0);

	}

}
