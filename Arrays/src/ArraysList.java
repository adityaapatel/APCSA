import java.util.*;
public class ArraysList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <String> names = new ArrayList<String>();
		
		
		names.add("Bob");
		names.add("Pete");
		names.add("Luke");
		names.add("Sue");
		names.add("Nancy");
		names.add("Mary");
	
		System.out.println(names);
		String temp= names.get(1);
		
		names.set(1, names.get(4));
		names.set(4, temp);
		System.out.println(names);
		
for (String X:names)
{
	System.out.println(X.toUpperCase());
	
	
}
System.out.println(names);


	}

}
