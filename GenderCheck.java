import java.util.Scanner;

public class GenderCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in); 
		System.out.println("Enter m or f"); 
		char c=s.next().charAt(0); 
	 
		 
		switch(c){ 
		case 'm': 
			System.out.println("Gender is male"); 
			break; 
		case 'f': 
			System.out.println("Gender is female"); 
			break; 
		} 
		s.close(); 

	}

}
