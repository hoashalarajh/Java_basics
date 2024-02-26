package graphs_java;

interface IABCBank{
	default void message() {
		System.out.println("Welcome to ABC Bank!!!");
	}
	public void openAccount();
	public void closeAccount();
}

interface IBankAccount{
	void deposit();
	void withdraw();
	void balance();
}

class Saving implements IBankAccount, IABCBank{

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("Open the saving account");
		
	}

	@Override
	public void closeAccount() {
		// TODO Auto-generated method stub
		System.out.println("Close the saving account");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit in Saving Account");
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw from Saving Account");
		
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("Chack balance of Saving Account");
		
	}
	
}
public class InterfaceExample {
	public static void main(String[] args) {
		System.out.println("Hello");
		Saving saving = new Saving();
		saving.message();
		saving.balance();
		saving.deposit();
		saving.withdraw();
		
	}

}
