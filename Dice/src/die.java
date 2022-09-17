
public class die {

	//Instance Fields
	private int myNumSides;
	private int myCurrentRoll;
	
	//Constructors
	
	public die(int numSides)
	{
		myNumSides = numSides;
		myCurrentRoll = 0;
		
	}
	
	public die()
	{
		this(6);
	}
	
	//Methods
	public int roll() 
	{
	myCurrentRoll = (int)(Math.random() * myNumSides +1);
	return myCurrentRoll;

	}
	
	public int getLastRoll()
	{
	return myCurrentRoll;
    }
	
	
	public int getNumSides()
	{
		return myNumSides;
	}
	
	
	public String toString()
	{
		return "This die has " +  myNumSides + " sides ";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}