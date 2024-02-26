package graphs_java;

class Person1{
	String name;
	public Person1() {
		System.out.println("Person: default");
		name = "Vijay";
	}
	// parameterized constructor
	public Person1(String name) {
		System.out.println("Person: parameterized");
		this.name = name;
	}
	
	public void displayDetails() {
		System.out.println("User details are displayed below");
		System.out.println("******************************************");
		System.out.println("The name is: " + name);
	}
}

class Employee extends Person1 {
	String designation;
	public Employee() {
		System.out.println("Employee: defult");
		designation = "Thalapathy";
	}
	public Employee(String desig) {
		System.out.println("Employee: parameterized");
		this.designation = desig;
	}
	public void displayDetails() {
		System.out.println("User details are displayed below");
		System.out.println("******************************************");
		System.out.println("The name is: " + designation);
		System.out.println("******************************************");
	}
}

public class constructor_chaining {
	
	public static void main(String[] args) {
		// getting default constructor
		// for employee class
		Employee emp = new Employee();
		emp.displayDetails();
		// for person class
		Person1 per1 = new Person1();
		per1.displayDetails();
		
		// getting parametrized constructor
		// for person
		Person1 per = new Person1("Joseph Vijay");
		per.displayDetails();

		// for employee class
		Employee emp2 = new Employee("Actor");
		emp2.displayDetails();
		
	}

}
