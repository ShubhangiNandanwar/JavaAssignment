
interface Printables{  
void print();  
}  
interface Showables{  
void show();  
}  
class InterfaceEx2 implements Printables,Showables{  
public void print(){System.out.println("Hello World...");}  
public void show(){System.out.println("Welcome to My World...");}  
  
public static void main(String args[]){  
	InterfaceEx2 obj = new InterfaceEx2();  
obj.print();  
obj.show();  
 }  
}  