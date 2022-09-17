//Aditya Patel
// Recursive String Inverter Challenge

import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner s1= new Scanner(System.in);
            System.out.println("Enter Word to be reversed: ");
            
            String word1 = s1.nextLine();
            String word2= strReverse(word1);
            System.out.println("The reversed string is:"+ word2 );
            
            
	}
	public static String strReverse( String input)
	{
		//
		if(input.length() == 0)
		{
			return input;
		}
		
		return strReverse( input.substring(1)) + input.substring(0,1);
	}

	
}
