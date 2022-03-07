
public class ArgumentConst {

	// constructor with one argument
	ArgumentConst(String name)
    {
        System.out.println("Constructor with one " +
                      "argument : " + name);
    }
  
    // constructor with two arguments
	ArgumentConst(String name, int age)
    {
  
        System.out.println("Constructor with two arguments : " + name + " "+ age);
  
    }
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArgumentConst s1 = new ArgumentConst("ABC");
		  
	        // Invoke the constructor with two arguments
		ArgumentConst s2 = new ArgumentConst("XYZ", 26);

	}

}
