
public class RealZoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal X = new Animal("Emu");
		X.eat();
		X.breathe();
		
		Mammal Y= new Mammal("Giraffe");
		
		Y.breathe();
		Y.eat();
		Y.shave();
		Y.eatSolid();
		
		Primate Z= new Primate("Bonobo");
		Z.eat();
		Z.breathe();
		Z.shave();
		Z.hitchARide();
		
		Mammal Q = new Primate("Chimp");   //< creates a mammal using a primate constructor
		
		{
			Q.eat();
			Q.breathe();
		Q.shave();
		Q.eatSolid();
		//Q.hitchARide             Cant do this because Mammals dont know about the primate methods.
	
		}
		Animal P = new Primate("Macaw");  // Creates a Animal using a primate constructor.
		
		
		{
			X.eat();
			X.breathe();
		}
		Object O = new Primate("Orangutang)");  // creates an object using a primate constructor.
		
		System.out.println(X instanceof Primate);
	}

}
