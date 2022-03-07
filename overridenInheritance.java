
class Bank
	{  
		int getRateOfInterest(){return 0;}  
	}  

class SBI extends Bank
	{  
		int getRateOfInterest(){return 8;}  
	}  

class ICICI extends Bank
	{  
		int getRateOfInterest(){return 7;}  
	}  

class AXIS extends Bank
	{  
		int getRateOfInterest(){return 9;}  
	}  

public class overridenInheritance 
	{

		public static void main(String[] arg) 
		{
			
			Bank sbibank=new SBI(); 
			Bank icicibank=new ICICI();  
			Bank axisbank=new AXIS();  
			
			System.out.println("SBI Rate of Interest: "+sbibank.getRateOfInterest());  
			System.out.println("ICICI Rate of Interest: "+icicibank.getRateOfInterest());  
			System.out.println("AXIS Rate of Interest: "+axisbank.getRateOfInterest());  
		}

	}
