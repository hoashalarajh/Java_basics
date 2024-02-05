package graphs_java;

import java.util.Scanner;

class Student{
	// declare class variables
	int studentId;
	String studentName;
	int studentAge;
	Scanner scanner = new Scanner(System.in);
	
	// Member functions
	public void acceptDetails() {
		System.out.println("Enter Student ID: ");
		studentId = scanner.nextInt();
		System.out.println("Enter the Student Name: ");
		studentName = scanner.next();
		System.out.println("Enter Student Age: ");
		studentAge = scanner.nextInt();
		
	}
	public void displayDetails() {
		System.out.println("User details are displayed below");
		System.out.println();
		System.out.println("The Student ID is: " + studentId);
		System.out.println("The Student Name is: " + studentName);
		System.out.println("The Student Age is: " + studentAge);
	}
}



public class access_modifiers {
	
	public static void main(String[] args) {
		
		// creating an object student1 of Class Student 
		Student student1 = new Student();
		// accepting details for student1
		student1.acceptDetails();
		// displaying the entered details
		student1.displayDetails();
		
		// creating an object stuent2 of Class Student
		Student student2 = new Student();
		// accepting detials for student2
		student2.acceptDetails();
		// displaying the entered details for student2
		student2.displayDetails();
	}

}
