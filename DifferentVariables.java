
public class DifferentVariables {

    int rollno;  
    String name;  
    static String college = "RGCER"; //static Variables
    static String country = "UK"; //static Variables
    
    //static method  
    static void change(){  
    college = "RTMNU";  
    country ="India";
    }  
    
    //constructor to initialize the variable  
    DifferentVariables(int r, String n){  
    rollno = r;  
    name = n;  
    }  
   
    //method to display values  
    void display(){System.out.println(rollno+" "+name+" "+college+" "+country);}  
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DifferentVariables.change();//calling change method  
	    
		//creating objects  
		DifferentVariables s1 = new DifferentVariables(01,"ABC");  
		DifferentVariables s2 = new DifferentVariables(02,"XYZ");    
	   
		//calling display method  
	    s1.display();  
	    s2.display();  
	    
	}
	}

