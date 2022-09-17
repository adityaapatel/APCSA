
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		   die d1= new die();
           die d4 = new die(4);
    		die d8= new die (8);
     System.out.println(d1);
     System.out.println(d4);
     System.out.println(d8);
    		//System.out.println("d4 has: "+ d4.getNumSides() + "sides");
    		//System.out.println("d8 has: "+ d8.getNumSides() + "sides");
    		//System.out.println("d1 has: "+ d1.getNumSides() + "sides");
    		
		for (int x = 0; x<10; x++)
		{
			System.out.print("   " + d1.roll());
		}
		System.out.println();
		for (int x = 0; x<10; x++)
		{
			System.out.print("   " + d4.roll());
		}
		System.out.println();
		for (int x = 0; x<10; x++)
		{
			System.out.print("   " + d8.roll());
		}
		System.out.println();
		
		System.out.println(d1.getLastRoll());
		System.out.println(d4.getLastRoll());
		System.out.println(d8.getLastRoll());
	}
     
     
     }
