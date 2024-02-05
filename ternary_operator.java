package graphs_java;

public class ternary_operator {
	
	public static void main (String args[]) {
		
		boolean isAuthenticated = true;
		
		if (isAuthenticated)
			System.out.println("You are logged in successfully");
		else
			System.out.println("You are Not logged in successfully");
		
		// short hand version of if-else statement using ternary operators
		String result = (isAuthenticated) ? "LoggedIn" : "Not LoggedIn";
		// printing the ternary operator
		System.out.println("This is obtained using Ternary operator: " + result);
		
	}

}
