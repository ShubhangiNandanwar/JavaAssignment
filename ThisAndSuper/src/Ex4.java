//Call constructor of the current class using this()
class A{  
A(){System.out.println("hello World..");}  
A(int x){  
this();  
System.out.println(x);  
}  
}  
class Ex4{  
public static void main(String args[]){  
A a=new A(10);  
}}  