
//public class InterfaceEx5 

interface Test1 {
    void show();
}
interface Test2 {
    void show();
}
public class InterfaceEx5 
{ 
    void show(){
        System.out.println("Implemented method....");
    }
 
    public static void main(String[] args) 
    { 
    	InterfaceEx5 object = new InterfaceEx5();
        object.show();
    } 
}