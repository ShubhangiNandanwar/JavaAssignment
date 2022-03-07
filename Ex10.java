//Write a program to generate ClassNotFoundException

public class Ex10 {

	// Main driver method
	public static void main(String args[])
	{

		// Try block to check for exceptions
		try {

			Class.forName("Hello World...");
		}

		// Catch block to handle exceptions
		catch (ClassNotFoundException ex) {

			// Displaying exceptions on console along with
			// line number using printStackTrace() method
			ex.printStackTrace();
		}
	}
}
