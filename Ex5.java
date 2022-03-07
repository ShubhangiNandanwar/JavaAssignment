//Call argument constructor of current class using this()
class A1{  
A1(){  
this(5);  
System.out.println("hello World");  
}  
A1(int x){  
System.out.println(x);  
}  
}  
class Ex5{  
public static void main(String args[]){  
A1 a=new A1();  
}}  