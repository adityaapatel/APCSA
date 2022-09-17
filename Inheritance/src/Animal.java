
public class Animal {
	private String mySpecies;
	public Animal( String species)

	{
		mySpecies = species;
	}
	public void breathe() 
	{
		
		System.out.println(mySpecies+" inhale.... exhale");
	}
	
	public void eat()
	{
		System.out.println(mySpecies+ "Chomp!");
	}
	public String getSpecies() {return mySpecies;}
}
