package graphs_java;

import java.util.Date;
import java.util.Scanner;


public class first_program {
	public static void main(String[] args) {
		// printing output as Hello World
		System.out.println("Welcome to Java");
		System.out.println("Hello World, This is Java!!!");
		System.out.println("I am Richard Hendricks,");
		System.out.println("Founder and CEO of Pied Piper.");
		System.out.println("Hello! This is Hoashalarajh :)");
		
		// primitive data types:
		byte age = 23;
		long viewsCount = 1_112_345_678;
		float price = 234.56F;
		char gender = 'M';
		boolean isValid = true;
		
		// printing primitive data types
		System.out.println(age);
		System.out.println(viewsCount);
		System.out.println(price);
		System.out.println(gender);
		System.out.println(isValid);
		
		//Non-primitive data types
		// String data type as non-primitive
		String name = "Hoashal";
		System.out.println(name);
		Date now = new Date();
		System.out.println(now);
		
		// reading the input from the user
		// scanner class
		
		// getting user input from the user
		Scanner scanner = new Scanner(System.in);
		
		// prompt for getting the name of the user
		System.out.print("Enter your Name: ");
		String name1 = scanner.next();
		
		// prompt for getting the age if the user
		System.out.println("Enter your Age: ");
		int age1 = scanner.nextInt();
		
		// prompt for getting the gender of the user
		System.out.println("Enter your gender (M/F): ");
		char gender1 = scanner.next().charAt(0);
		
		// prompt for getting the contact number of the user
		System.out.println("Enter your contact number here: ");
		//double contact = scanner.nextDouble();
		String contact = scanner.next();
		
		// printing the user data provided by the user
		System.out.println("======================================");
		System.out.println("User Details");
		System.out.println("======================================");
		System.out.println("Name: " + name1);
		System.out.println("Age: " + age1);
		System.out.println("Gender: " + gender1);
		System.out.println("Contact Number: " + contact);		
		System.out.println("======================================");
		
		// Type casting in Java
		// Implicit type casting and explicit type casting
		
		// Implicit type casting
		int intValue = 100;
		System.out.println(intValue);
		
		// type casting from int to long
		long longValue = intValue;
		System.out.println(longValue);
		
		// type casting from long to double
		double doubleValue = longValue;
		System.out.println(doubleValue);
		
		
		// Explicit type casting
		double doubleValue1 = 200.56;
		
		// explicit type casting from double to int
		int intValue1 = (int) doubleValue1;
		
		// explicit type casting from int to byte
		byte byteval = (byte) intValue1;
		
		// printing the values of the variables
		System.out.println(doubleValue1);
		System.out.println(intValue1);
		System.out.println(byteval);
		
		
		// Operators
		int num1 = 100;
		int num2 = 50;
		
		System.out.println("Addition: " + (num1 + num2));
		System.out.println("Subtration: " + (num1 - num2));
		System.out.println("Multiplication: " + (num1 * num2));
		System.out.println("Division: " + (num1 / num2));
		System.out.println("Reminder: " + (num1 % num2));
		
		System.out.println("Post Increment: " + (num1++));
		System.out.println("Pre Increment: " + (++num1));
		
		System.out.println("Post Decrement: " + (num1--));
		System.out.println("Pre Decrement: " + (--num1));
		
		// Arithmetic operators
		int num3 = 10;
		int num4 = 20;
		int num5;
		
		// assigning variable num3 to variable num5
		num5 = num3;
		System.out.println("num5 = num3: " + num5);
		
		num3 += num4;
		System.out.println("num3 += num4: " + num3);
		
		num3 -= num4;
		System.out.println("num3 -= num4: " + num3);
		
		num3 *= num4;
		System.out.println("num3 *= num4: " + num3);
		
		num3 /= num4;
		System.out.println("num3 /= num4: " + num3);
		
		num3 %= num4;
		System.out.println("num3 %= num4: " + num3);
		
	}

}
