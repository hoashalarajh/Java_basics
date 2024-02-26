package graphs_java;

class Persons{
	String name;
	int age;
	
	public Persons(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void print() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}
}

class Employees extends Persons{
	String designation;
	float salary;
	
	public Employees(String name, int age, String designation, float salary) {
		super(name, age);
		this.designation = designation;
		this.salary = salary;
	}
	
	public void print() {
		super.print();
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
	}
}

public class method_overriding {
	public static void main(String[] args) {
		System.out.println("This is method overriding...");
	}

}
