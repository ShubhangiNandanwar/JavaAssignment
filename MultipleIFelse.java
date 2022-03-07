
public class MultipleIFelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30;
        int b = 10;
        int c = 20;
        int largest;
         
        if(a>b) 
        {
            if(a>c) 
            {
                largest = a;
            } else 
            {
                largest = c;
            }
        } 
        else 
        {
            if(b>c)
            {
                largest = b;
            }
            else
            {
                largest = c;
            }
        }
         
        System.out.println(largest + " is the largest Number.");
	}

}
