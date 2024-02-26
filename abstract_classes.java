package graphs_java;

abstract class ABCBank{
	public void message() {
		System.out.println("Welcome to ABCBank!!");
	}
	public static void message_new() {
		System.out.println("This power is Antha Ragam");
	}
	abstract void openAccount();
	abstract void closeAccount();
	
}

abstract class BankAccount extends ABCBank{
	abstract void deposit();
	abstract void withdraw();
	abstract void balance();
	
}

class SavingAccount extends BankAccount{

	@Override
	void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit in Saving Acccount");
		
	}

	@Override
	void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw from Saving Account");
		
	}

	@Override
	void balance() {
		// TODO Auto-generated method stub
		System.out.println("Balance in Saving Account");
		
	}

	@Override
	void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("Open the Saving Account");
		
	}

	@Override
	void closeAccount() {
		// TODO Auto-generated method stub
		System.out.println("Close the Saving Account");
	}
	
}

class CurrentAccount extends  BankAccount{

	@Override
	void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit in Current Account");
		
	}

	@Override
	void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw from Currrent Account");
		
	}

	@Override
	void balance() {
		// TODO Auto-generated method stub
		System.out.println("Balance in Current Account");
		
	}
	
	@Override
	void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("Open the Saving Account");
		
	}

	@Override
	void closeAccount() {
		// TODO Auto-generated method stub
		System.out.println("Close the Saving Account");
	}
	
}


public class abstract_classes{
	public static void main(String[] args) {
		// instantiating savingAccount object
		// static method allows the access without creating an object of a class
		ABCBank.message_new();
		SavingAccount savingAccount = new SavingAccount();
		savingAccount.message();
		savingAccount.openAccount();
		savingAccount.deposit();
		savingAccount.balance();
		savingAccount.withdraw();
		savingAccount.closeAccount();
		
		System.out.println("****************************************");
		
		// instantiating currentAccount object
		// power of static method --> allows to access method without creating an object of a class
		ABCBank.message_new();
		CurrentAccount currentAccount = new CurrentAccount();
		savingAccount.message();
		currentAccount.openAccount();
		currentAccount.balance();
		currentAccount.withdraw();
		currentAccount.deposit();
		currentAccount.closeAccount();
	}
}