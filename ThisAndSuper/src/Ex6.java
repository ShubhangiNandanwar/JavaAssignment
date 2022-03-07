//Call constructor of the parent class using super()
class Animals{  
Animals(){System.out.println("animal is created");}  
}  
class Dogs extends Animals{  
Dogs(){  
super();  
System.out.println("dog is created");  
}  
}  
class Ex6{  
public static void main(String args[]){  
Dogs d=new Dogs();  
}}  