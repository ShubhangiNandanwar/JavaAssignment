//Write a program to generate IOException
import java.util.*;  

public class Ex12 {    
    public static void main(String[] args) {  
        //Create a new scanner with the specified String Object  
          Scanner scan = new Scanner("Hello World....");  
          //Print the line  
          System.out.println("" + scan.nextLine());  
          //Check if there is an IO exception  
          System.out.println("Exception Output: " + scan.ioException());  
          scan.close();   
    }  
}  