
import java.io.FileOutputStream;  
public class IOEx2 {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("C:\\Users\\DELL\\eclipse-workspace\\Java(Input-output)\\Test2.txt");    
             String s="Welcome to Java Input-Output Example...";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  