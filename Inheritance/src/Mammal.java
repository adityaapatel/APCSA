
public class Mammal extends Animal {

	public Mammal(String mammalSpecies)

	{
	super(mammalSpecies);
	
	}
	
	public void eat()
	{
		System.out.println(getSpecies() + " Got Milk???");
	}
	public void eatSolid()
	{
		super.eat();
	}

	public void shave()
	{
		System.out.println(getSpecies()+ " Hand me that razor");
	}
}
