package graphs_java;

// upcasting and downcasting
class Vehicle {
	void drive() {
		System.out.println("Driving a vehicle");
	}
}
class Car extends Vehicle{
	void drive() {
		System.out.println("Driving a car..");
	}
	void speedUp() {
		System.out.println("Speeding up a car..");
	}
}


public class inheritance {
	public static void main(String[] args) {
		System.out.println("This is the main method and;");
		System.out.println("This is the entry point of the program!!!");
		// down casting
		Vehicle vehicle = new Car();
		Car car = (Car) vehicle;
		car.drive();
		car.speedUp();
		// up casting
		Vehicle vehicle1 = new Car();
		vehicle1.drive();
		
		
	}
	

}
