package graphs_java;

class Calculation{
	public static int addition(int number1, int number2) {
		return number1 + number2;
	}
	public static float addition (float number1, float number2) {
		return number1 + number2;
	}
	public static float addition(int number1, float number2, float number3) {
		return (number1 + number2 + number3);
	}
	public static float addition (int number1, float number2) {
		return number1 + number2;
	}
	public static float addition(float number1, int number2) {
		return number1 + number2;
	}
	
}

public class method_overloading {
	
	public static void main(String[] args) {
		//mthod1
		int number_a = Calculation.addition(30,40);
		System.out.println(number_a);
		//mthod2
		float number_b = Calculation.addition(400.58F, 12.89F);
		System.out.println(number_b);
		//mthod3
		float number_c = Calculation.addition(50, 50.89F, 45.6F);
		System.out.println(number_c);
		//mthod4
		float number_d = Calculation.addition(84, 45.89F);
		System.out.println(number_d);
		//mthod5
		float number_e = Calculation.addition(78.36F,  45);
		System.out.println(number_e);
	}

}
