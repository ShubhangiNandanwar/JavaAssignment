
interface printable{  
void print();  
}  
class InterfaceEx1 implements printable{  
public void print(){System.out.println("Hello World");}  
  
public static void main(String args[]){  
	InterfaceEx1 obj = new InterfaceEx1();  
obj.print();  
 }  
}  