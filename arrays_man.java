package graphs_java;

public class arrays_man {
	
	public static void main (String args[]) {
		// arrays
		// arrays: Single dimensional array and Multi dimensional array
		
		// Single dimensional array
		// Declaring an array
		
		//int[] marks;
		//marks = new int[5];
		// OR
		//int [] marks = new int[5];
		
		// initializing an array
		//int[] marks = new int[] {10,20,30,40,50};
		
		// Declare and assign
		int[] marks = new int[5];
		marks[0] = 78;
		marks[1] = 96;
		marks[2] = 85;
		marks[3] = 75;
		marks[4] = 87;
		
		// printing the length of the array
		System.out.println("The length of the array is: " + marks.length);
		
		for (int i = 0; i < marks.length; i++) {
			int j = marks[i];
			System.out.println(j);
		}
		
		System.out.println("***********************************************");
		
		for (int value : marks) {
			System.out.println(value);
		}
		
		// further practice
		// initializing the array
		int[] age = new int[] {24,28,21,30,32,42};
		// iterate through the array
		for (int age_val : age) {
			System.out.println(age_val);
		}
		
		// Multi-dimensional array
		// declaring a multi dimensional array
		int science_marks[][] = {
				{67,76,87,89,98},
				{76,77,56,65,90},
				{67,79,92,63,55}};
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(science_marks[i][j] + "\t");
			}
			System.out.println();
		}
		
		// Strings data type
		String myString = "Hello World";
		System.out.println(myString);
		
		
		
	}
}
