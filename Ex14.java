import java.lang.reflect.Method;  

public class Ex14 {  

  public static void main(String... args) throws NoSuchMethodException {  
      Class<Ex14> class1 = Ex14.class;  

      Method mthd = class1.getMethod("IntCalc", int.class);  
      System.out.println(mthd);  

      mthd = class1.getMethod("Work");  
      System.out.println(mthd);  

      mthd = class1.getMethod("StaticMethod", String.class);  
      System.out.println(mthd);  

      mthd = class1.getMethod("Work");  
      System.out.println(mthd);         
  }  

  public int IntCalc(int i) {return 0;}  

  public void Work() {}  

  public static void StaticMethod(String s) {}  
}  