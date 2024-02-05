package graphs_java;

import java.util.Scanner;

public class do_while {
	
	public static void main(String[] args){
		// initiating scanner
		Scanner scanner = new Scanner(System.in);
		String input;
		
		do {
			System.out.print("Enter Message: ");
			input = scanner.nextLine().toLowerCase();
			System.out.println(input);
		} while (!input.equals("quit"));
	}

}
