
public class BankAccount {

	private double balance;
	
	private String name;
	
	public BankAccount(double b, String s)
	{
		balance = b;
		name = s;
	}
	
	public void deposit( double dep )
	{ 
		if (dep>=0)
			balance = (balance + dep);
		else 
			System.err.println("you cant deposit less than 1");
		//return dep;
		
	}
	
	public void withdrawal(double w)
	{
		if( w <=balance)
		balance = ( balance - w);
		else
			System.err.println("Not Enough Funds ");
		
		
		
	}
	
public double getBal()
{
	return balance;
}
	
	
}
