import java.util.*;  
class HashSets{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
    HashSet<String> set=new HashSet();  
           
    set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
           set.add("Five");  
           set.add("Six");  
           set.add("Seven");  
           set.add("Eight");  
           set.add("Nine");  
           set.add("Ten");  
           
           System.out.println("List Of Elements....");
           for(String hs:set)
           {
        	   System.out.println(hs);  
           }
           
           System.out.println("\nRemoving specific element from HashSet...");  
           set.remove("Two"); 
           for(String hs:set)
           {
        	   System.out.println(hs);  
           }
           
           System.out.println("\nUpdate element of HashSet..."); 
           HashSet<String> set1=new HashSet<String>();  
           set1.add("Eleven");  
           set1.add("Twelve");  
           set.addAll(set1);  
           for(String hs:set)
           {
        	   System.out.println(hs);  
           } 
           
           System.out.println("\nRemoving all the new elements from HashSet.."); 
           set.removeAll(set1);  
           for(String hs:set)
           {
        	   System.out.println(hs);  
           } 
           
           System.out.println("\nCheck if the HashSet contains an specific element");
           String num = "Two";
           if(set.contains(num)) 
           {
               System.out.println(num + " is in the Number list.");
           }
           else 
           {
               System.out.println(num + " is not in the Number list.");
           }
           
           System.out.println("\nSize of the element : " +set.size());
 } 
 }