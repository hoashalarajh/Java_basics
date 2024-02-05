package graphs_java;

import java.util.Scanner;

public class jump_statements {
	
	public static void main(String[] args) {
		// jump statement break, continue
		Scanner scanner = new Scanner(System.in);
		String input = "";
		
		while (!input.equals("quit")) {
			System.out.print("Enter Message: ");
			input = scanner.nextLine().toLowerCase();
			
			if(input.equals("hello"))
				break;
			if (input.equals("pass"))
				continue;
			System.out.println(input);
			
		}
		
	}

}
