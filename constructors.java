package graphs_java;

import java.util.Scanner;

class StudentNew{
	// declare class variables
	int studentId;
	String studentName;
	int studentAge;
	Scanner scanner = new Scanner(System.in);
	
	// default constructor
	public StudentNew() {
		this.studentId = 14077;
		this.studentName = "Hoashal";
		this.studentAge = 28;
	}
	
	// parameterized constructors
	public StudentNew(int sId, String sName, int sAge) {
		this.studentId = sId;
		this.studentName = sName;
		this.studentAge = sAge;
	}
	
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



// main method is here to run the whole code and serves as an entry point
public class constructors {
	
	public static void main(String[] args) {
		// using default constructor
		StudentNew student1 = new StudentNew();
		student1.displayDetails();
		
		// using a seperator
		System.out.println("**************************************");
		
		// using parameterized constructor
		StudentNew student2 = new StudentNew(14444, "Harish", 27);
		student2.displayDetails();
		
		// using a seperator
		System.out.println("**************************************");
		
		// using parameterized constructor for another student entry
		StudentNew student3 = new StudentNew(124789, "Veera", 38);
		student3.displayDetails();
		
		// using a seperator
		System.out.println("**************************************");
		
		// using parameterized constructor for another student entry
		StudentNew student4 = new StudentNew(30257,"Raghavan", 42);
		student4.displayDetails();
		
				
		
	}

}
