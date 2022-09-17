
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 8, 6, 7, 5, 3, 0, 9, 1, 4, 2};
		
		printArray( nums);
		bubbleSort(nums);
		
	}
	
	// Bubble sort is a bigO of n^2
	
	public static void bubbleSort ( int[] data)
	{
		for( int j = 0; j < data.length; j++)
		{
			for( int i =0; i< data.length -1;i++)
			{
				if ( data[i]> data[1+1] )
				{
					int temp = data[i];
					data[i]= data[i+1];
					data[i+1]= temp;
				}
			}
			printArray(data);
			
		}
	}
	
	
	
		public static void printArray(int[] x)
		{
	System.out.print("[ ");
	
	for( int i =0; i < x.length; i++)
		
	{
		if( i> 0)
			System.out.print(", ");
			
			System.out.print( x[i] );
	}
	System.out.print(" ]");
	System.out.println();
		}

}

