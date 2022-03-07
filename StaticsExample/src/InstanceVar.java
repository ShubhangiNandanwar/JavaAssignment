
public class InstanceVar {
	public String name;
	private int marks;
	 
	public InstanceVar (String stuName) {
	name = stuName;
	}
	public void setMarks(int stuMar) {
	marks = stuMar;
	}
	 
	public void display() {
	System.out.println("Name: " + name+ "  " +"Marks:" + marks);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVar StuOne = new InstanceVar("ABC");
		InstanceVar StuTwo = new InstanceVar("XYZ");
		
		StuOne.setMarks(98);
		StuTwo.setMarks(89);
		 
		StuOne.display();
		StuTwo.display();
		 
		}

	}

