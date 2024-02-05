package graphs_java;

import java.util.Scanner;

class Person{
	private String firstName;
	private String lastName;
	private int age;
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if (age >= 18) {
			this.age = age;
		}
		else {
			System.out.println("The age entered is invalid");
		}
	}
}

public class getters_and_setters {
	
	public static void main(String[] args) {
		Person person = new Person();
		// entering details
		person.setFirstName("Hoashal");
		person.setLastName("Hoashalarajh");
		person.setAge(28);
		// displaying details
		System.out.println("User details are as folows:");
		System.out.println("First Name is: " + person.getFirstName());
		System.out.println("Last Name is: " + person.getLastName());
		System.out.println("The age of the person is: "+ person.getAge());
		System.out.println("System output terminated..");
		
		
	}
	

}
