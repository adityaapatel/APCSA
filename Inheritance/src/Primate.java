
public class Primate extends Mammal {
	
	public Primate(String primateSpecies) 
	{
	super(primateSpecies);
}
	public void hitchARide()
	{
		System.out.println(getSpecies() + " Can i Get A Ride??");
	}
	public void eat() {
		eatSolid();
	}
}
