package graphs_java;

public class StringManipulationExample {
	public static void main (String args[]) {
		// Using String Literal
		// declaring the string
		String str1 = "Hello";
		// printing the string
		System.out.println("This string is going to be printed: " + str1);
		
		// Using String Object
		String str2 = new String("World!");
		// printing the string
		System.out.println("This string is going to be printed: " + str2);
		
		// Concatenating two strings
		String str3 = str1 + " " + str2;
		// printing the concatenated string
		System.out.println("This is the concatenated string: " + str3);
		
		
		// String Methods
		// print the str3
		System.out.println(str3);
		// print the length of the str3
		System.out.println(str3.length());
		// print the character at index 0
		System.out.println(str3.charAt(0));
		// printing the concatenation 
		System.out.println(str1.concat(str2));
		// printing the substring
		System.out.println(str3.substring(0,5));
		// checking the euqality of two strings
		System.out.println(str1.equals(str2));
		// checking one word contains in the string
		System.out.println(str3.contains("Hello"));
		// convert the string to lower case
		System.out.println(str3.toLowerCase());
		// convert the string to upper case
		System.out.println(str3.toUpperCase());
		// changing the str3 format
		// printing str3
		System.out.println(str3);
		// changing str3
		String str4 = " " + str3 + " ";
		//printing str4
		System.out.println(str4);
		
		// remove the white spaces within the string
		// removing the white spaces at front and trail of string
		System.out.println(str4.trim());
		System.out.println(str4.strip());
		
	}

}
