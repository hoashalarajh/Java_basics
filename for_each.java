package graphs_java;

public class for_each {
	public static void main(String[] args) {
		String names[] = {"King", "Queen", "Jack", "Spades", "Club"};
		
		// getting the length of names array
		System.out.println("The length of the array is: " + names.length);
		
		for (int i=0; i < names.length; i++) {
			System.out.println("This is name #" + (i+1) + ": " + names[i]);
			
		}
		
		// for each implementation
		System.out.println();
		int j = 1;
		for (String name: names) {
			System.out.print("This is name #" + j + " ");
			System.out.println(name);
			j = j + 1;
		}
	}

}
