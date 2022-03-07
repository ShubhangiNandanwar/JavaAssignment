//Write a program to generate NumberFormatException

class Ex16
{
   public static void main(String args[])
   {
      try{
	 int num=Integer.parseInt ("XYZ") ;
	 System.out.println(num);
      }catch(NumberFormatException e){
	  System.out.println("Number format exception occurred");
       }
   }
}