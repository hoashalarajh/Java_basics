package graphs_java;

public class string_buffer {
	public static void main (String args[]) {
		StringBuffer buffer = new StringBuffer("Hello ");
		System.out.println(buffer.capacity());
		// appending
		buffer.append("World");
		// printing buffer
		System.out.println(buffer);
		// 
		
		// using StringBuilder
		StringBuilder builder = new StringBuilder("Hello ");
		System.out.println(builder.capacity());
		// appending
		builder.append("World");
		System.out.println(builder);
		
		
	}

}
