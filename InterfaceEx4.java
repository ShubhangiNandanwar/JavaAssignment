
//public class InterfaceEx4 

interface I1 {
	  abstract void method();
	}
	 
	interface I2 {
	  abstract void method();
	}
	 
	public class InterfaceEx4 implements I1, I2 {
	 
	  @Override
	  public void method() {
	    System.out.println("Hello World");
	  }
	 
	  public static void main(String[] a) {
		  InterfaceEx4 mi = new InterfaceEx4();
	    I1 i1 = new InterfaceEx4();
	    I2 i2 = new InterfaceEx4();
	    i1.method();
	    i2.method();
	  }
	 
	}