
import java.io.*;  
public class IOEx4{    
public static void main(String args[])throws Exception{    
     FileOutputStream fout=new FileOutputStream("C:\\Users\\DELL\\eclipse-workspace\\Java(Input-output)\\Text4.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="Welcome to Java Input-Output Example....";    
     byte b[]=s.getBytes();    
     bout.write(b);    
     bout.flush();    
     bout.close();    
     fout.close();    
     System.out.println("success");    
}    
}  