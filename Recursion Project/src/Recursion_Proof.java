
public class Recursion_Proof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(intSum1(17));

		System.out.println(intSum2(17));

	}
	public static int intSum1(int n)
	{
		int total = 1;
		for (int i=1;i<=n;i++)
		{
			total *= i;
		}
		return total;

	}
	
	
	
	public static int intSum2(int n)
	{
		if( n==1) return 1;
		return n * intSum2(n-1);
	}
	

}
