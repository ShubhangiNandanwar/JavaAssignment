import java.io.FileWriter;  
public class IOEx6 {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("C:\\Users\\DELL\\eclipse-workspace\\Java(Input-output)\\Text6.txt");    
           fw.write("Welcome to Java Input-Output Example....");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}  