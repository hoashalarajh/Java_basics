package graphs_java;

import java.util.Scanner;

public class switch_case {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("admin - Gets Full Access");
		System.out.println("submadmin - Gets access to create/delete courses");
		System.out.println("tester - Gets access to create/delete tests");
		System.out.println("user - Gets access to consume content");
		System.out.print("Enter your choice: ");
		
		String user = scanner.nextLine();
		
		switch(user) {
		case "admin":
			System.out.println("Your are admin..");
			System.out.println("You have full access..");
			break;
			
		case "subadmin":
			System.out.println("You are subadmin..");
			System.out.println("You have access to create/ delete course contents");
			break;
			
		case "tester":
			System.out.println("You are tester..");
			System.out.println("You have access to acces to create/delete tests");
			break;
			
		case "user":
			System.out.println("You are a user..");
			System.out.println("Get access to consume content");
			break;
			
		default:
			System.out.println("You are a trial user");
			System.out.println("Sorry! You have a limited access..");
			break;
			
		}
	}

}
