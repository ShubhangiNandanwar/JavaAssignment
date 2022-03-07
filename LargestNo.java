
public class LargestNo {

	static int Large(int x, int y, int z)
    {
 
        if (x >= y && x >= z)
        	return x;
        
        else if (y >= x && y >= z)
            return y;
 
        else
            return z;
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20, c=5, d;
        d = Large(a, b, c);
 
        System.out.println("The Largest number is :"+d);
    }
	

}
