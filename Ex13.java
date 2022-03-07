//NoSuchFieldException

//public class Ex13 

import java.lang.reflect.Field;  
  
public class Ex13 {  
    public int num;  
    public static void main(String... args) throws NoSuchFieldException {  
        Class<Ex13> obj = Ex13.class;  
        Field fields = obj.getField("num");  
        System.out.println(fields);  
        Class<?> tp = fields.getType();  //gets the type   
        System.out.println(tp);  
    }  
}  
