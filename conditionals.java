package graphs_java;

public class conditionals {
	public static void main (String args[]) {
		
		boolean isLoggedIn = true;
		boolean isEmailVerified = true;
		boolean isCardInfoValid = true;
		
		if (isLoggedIn && isEmailVerified && isCardInfoValid) {
			System.out.println("You are allowed to make purchase");
		}
		else {
			System.out.println("You are not allowed to make purchase");
		}
		
		
		float sellingPrice = 1500, costPrice = 1000;
		
		if (sellingPrice > costPrice) {
			System.out.println("Profit");
		}
		else if (sellingPrice < costPrice) {
			System.out.println("Loss");
		}
		else {
			System.out.println("No profit, No Loss");
		}
	}

}
