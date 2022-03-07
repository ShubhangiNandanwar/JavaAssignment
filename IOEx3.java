import java.io.*;  
public class IOEx3{    
 public static void main(String args[]){    
  try{    
    FileInputStream fin=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Java(Input-output)\\Text3.txt");    
    BufferedInputStream bin=new BufferedInputStream(fin);    
    int i;    
    while((i=bin.read())!=-1){    
     System.out.print((char)i);    
    }    
    bin.close();    
    fin.close();    
  }catch(Exception e){System.out.println(e);}    
 }    
}  