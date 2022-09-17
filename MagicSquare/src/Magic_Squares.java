import java.util.*;
import java.io.*;
public class Magic_Squares {
private static int[][] square;
private static int index =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		
		Scanner input = new Scanner(System.in);
		int size= -1;
		
		while(size != 0)
		{
		System.out.print("Enter a size for you magic square: ");
		size = input.nextInt();
		
		if (size >0 && size %2 != 0)
		{
			//generate the magic square
	        generateSquare(size);
	        printSquare();
		}
		else if ( size !=0)
		
			System.out.println("Error on input: Odd Numbers Only");
		}
	}
			
		
	
           
		private static void generateSquare(int size)
{
	square= new int[size][size];
	int row,col;
	
	
	while (index <= size * size)
	{
		square[row++][col++] = index++;
		if (row==size)  row =0;
		if (col ==size) col= 0;
		if (square[row][col]) col = 1;
	}
			
		}	
		private static void printSquare() {
				
			int size = square.length;
			for (int row =0; row< size; row++)
			{
				for(int col= 0; col< size;col++)
					{
					System.out.print(square[row][col] + "\t");
					}
			System.out.println();
				}
	}
		}


		