
public class InserrtionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 8, 6, 7, 5, 3, 0, 9, 1, 4, 2};
		
		printArray( nums);
		InsertionSort(nums);
		
		
	}
		public static void InsertionSort( int[]data)
		{
			for(int index =1;index<data.length;index++) {
				
				int candidate = index;
				
				while (candidate>0 && data[candidate ] < data[candidate -1])
				{
					int temp = data[candidate] = data[candidate -1];
					data[candidate -1] = temp;
					
					candidate--;
				}
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



