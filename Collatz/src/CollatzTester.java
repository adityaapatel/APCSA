
public class CollatzTester {
 public static int count;
	 
	public static void main(String[] args) {
		
		

		int result = equalsOne(3);
		
		System.out.println(result);
		System.out.println(count);

	}
	
	
	public static int equalsOne(int n) 
		{
		
	     if( n ==1)
		{
	    	 count++;   // optional maybe but adds 1 extra, depends if 1 repeat counts as 1 or 0.
			return n;
			
		}
	
		if(n%2 == 0)
		{
			n= n/2;
			count++;
			
		}
		else {
			n= (3* n) +1;
		count++;
		}
		return  equalsOne(n);
		
		}
}
	
	

