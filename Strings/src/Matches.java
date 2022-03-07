
public class Matches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Str = new String("Welcome to Hello World");

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("(.*)Hello(.*)"));

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("Hello"));

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("Welcome(.*)"));
	}

}
