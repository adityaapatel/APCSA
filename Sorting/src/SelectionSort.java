
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 8, 6, 7, 5, 3, 0, 9, 1, 4, 2};
		
		printArray( nums);
		selectionSort(nums);
		
		
	}
		public static void selectionSort( int[]data)
		{
			int minPos;
			
			// Find the location of the smallest value in the array.
			
				for(int Pass = 0; Pass < data.length; Pass++) {
				minPos =Pass;
			
				for ( int index =Pass; index < data.length; index++)
				{
					if (data[minPos] > data[index]) 
				{
						minPos =index;
				}	
					}
					//Exchange the smallest element with the smallest element.
				int temp = data[Pass];
					data[Pass] = data[minPos];
					data[minPos] = temp;
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


