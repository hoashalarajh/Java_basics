package graphs_java;

import java.util.Scanner;

public class while_loop {
	public static void main(String[] args) {
		/*
		int i = 1;
		while (i <= 10) {
			System.out.println("This is while loop" + " " + i);
			// incrementing i
			//i = i + 1;
			// shorter version
			i++;
		}
		*/
		// initiating scanner variable
		Scanner scanner = new Scanner(System.in);
		String input = "";
		while (!input.equals("quit")) {
			System.out.print("Enter Message: ");
			input = scanner.nextLine().toLowerCase();
			System.out.println(input);
		}
		
	}

}
