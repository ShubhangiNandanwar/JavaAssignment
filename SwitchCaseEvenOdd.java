import java.util.Scanner;

public class SwitchCaseEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter any integer value");
		        n = sc.nextInt();
		        switch(n%2) 
		        {
		            case 0:
		                    System.out.println("Number is even");
		                    break;
		    
		            default:
		                    System.out.println("Number is Odd");
		        }
	    
	}

}
