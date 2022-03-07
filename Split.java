
public class Split {
	public static void main(String args[]){  
		String s1="Java is a Object Oriented Programming Language";  
		String[] words=s1.split("\\s");    
		for(String w:words){  
		System.out.println(w); 

		}
	}
}
