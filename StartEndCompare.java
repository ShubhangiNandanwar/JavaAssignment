
public class StartEndCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="hello";  
		String s2="hello";  
		
		System.out.println("Example of compareTo()....");
		System.out.println(s1.compareTo(s2));
		
		System.out.println("Example of UsingEndsWith()....");
		String s3="Hello World";  
		System.out.println(s3.endsWith("d"));  
		System.out.println(s3.endsWith("Hello"));  
		
		System.out.println("Example of Startwith()....");
		String s4="My name is Shubhangi Nandanwar";    
		System.out.println(s4.startsWith("My"));  
		System.out.println(s4.startsWith("My Name"));  
		 
		System.out.println("Example of equalsIgnoreCase()....");
		String s5="HELLO";  
		String s6="Java";  
		System.out.println(s1.equalsIgnoreCase(s2));  
		System.out.println(s1.equalsIgnoreCase(s5));  
		System.out.println(s1.equalsIgnoreCase(s6));  
		
	}

}
