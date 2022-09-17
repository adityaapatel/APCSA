// Aditya Patel
//Triangle Tester Program

import java.io.*;
import java.util.*;


public class Traingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner TriangleReader = new Scanner(System.in);
		
		System.out.print( " Enter the first numerical value(x): ");
		double x = TriangleReader.nextDouble();
		
		System.out.print( " Enter the second numerical value(y): ");
		double y = TriangleReader.nextDouble();
		
		System.out.print( " Enter the third numerical value(z): ");
		double z = TriangleReader.nextDouble();
		 	
		
		if( x == 0 || y ==0 || z== 0)
			System.out.println ("ERROR, a value in a triangle has to be greater than 1");
		else
			
		if (x + y > z)
		{
			System.out.println("Yes, its a triangle");	
		}
		else
			System.out.println( "No its not a triangle");
		
		
		if (x==y && y==z && x !=0 && y!= 0 && z != 0)
		{
			
			System.out.println("It is a equilateral triangle!");
		}
		else
		
			if ( x==y || y==z|| z==x )
		{	
			if ( x ==0 || y== 0 || z == 0)
				System.out.println( );
			else
			
				
			System.out.println("It is a isosceles triangle");
			
			
		
		}
			
	
		
			
			
	}
	
	
}
