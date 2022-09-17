
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] names = new String[5];
		
		names[0]= "Susie";
		names[1]= "Sam";
		names[2]= "Bob";
		names[3]= "Clyde";
		names[4]= "George";
		
		//Way to print arrays
		
		//for ( int x = 0; x< names.length; x++)
	//	{
			//System.out.println(names[x]);
		//}
		
		//Enhanced for-loop
			
			for( String s : names)
		System.out.println(s);
	}

}
