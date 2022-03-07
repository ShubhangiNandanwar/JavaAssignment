
public class Variables {
		
	public void Local_Variable(){
		int num = 10;
		System.out.println("Local Variable number is : " + num);
	}
	static int a=5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables obj = new Variables();
		obj.Local_Variable();
	
		System.out.println("The Global variable number is: "+a);
	}

}
