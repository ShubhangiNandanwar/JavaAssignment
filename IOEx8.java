import java.io.*;  
public class IOEx8 {  
public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("C:\\Users\\DELL\\eclipse-workspace\\Java(Input-output)\\Text8.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome to Java Input-Output Example....");  
    buffer.close();  
    System.out.println("Success");  
    }  
}  