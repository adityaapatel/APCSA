
public class student 
{

	private String name;
	private int id;
	private double gpa;
	
//Constructor
	
	public student(String n, int i)
	
	{
		name = n;
	    id= i;
	    gpa = 0;
		
	}
	
	public String getname()
	{
		return name;
	}
	
	public int getID()
	{
		return id;
	}
	
	public double getGPA()
	{
		return gpa;
	}
	
	public boolean setGPA(double newGPA)
	
	{
		
		if(newGPA >=0 && newGPA <=4) {
		gpa = newGPA;
		return true;
		}
		else
		{
	
			return false;
		}
			
		
		
	}
	
	public String toString()
	
	{
	
	return " Student's name: " + name + " Student's ID: " + id +  " Student's GPA: " + gpa;
	}
	
}

