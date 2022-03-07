
public class ValueOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Java String valueOf() Example");
		int value=30;  
		String s1=String.valueOf(value);  
		System.out.println(s1+10);
		
		System.out.println("\nJava String valueOf(boolean bol)Example");
		  boolean bol = true;    
	      boolean bol2 = false;    
	      String s3 = String.valueOf(bol);    
	      String s4 = String.valueOf(bol2);  
	      System.out.println(s3);  
	      System.out.println(s4);  
	        
	    System.out.println("\nJava String valueOf(char ch) Example");     
	      char ch1 = 'A';    
	      char ch2 = 'B';  
	      String s5 = String.valueOf(ch1);    
	      String s6 = String.valueOf(ch2);  
	      System.out.println(s5);  
	      System.out.println(s6);  
	     
	    System.out.println("\nJava String valueOf(float f) and valueOf(double d) Example");
	      float f  = 10.05f;    
	      double d = 10.02;  
	      String s7 = String.valueOf(f);    
	      String s8 = String.valueOf(d);          
	      System.out.println(s7);  
	      System.out.println(s8);  
	        
	      

	}

}
