
public class Mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 8, 6, 7, 5, 3, 0, 9, 1, 4, 2};
		
		printArray( nums);
		mergeSort(nums);
		printArray(nums);
		
		
		
	}	public static void printArray(int[] x)
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
	//big O of n log n

		public static void mergeSort( int[]data)
		{
			mergeSplitter(data);
			
		}
		private static void mergeSplitter(int [] sortMe)
		{
			if (sortMe.length <=1) {return;}
			
			int[] firstHalf = new int [sortMe.length /2];
			int[] secondHalf = new int [sortMe.length - firstHalf.length];
			
			int ptr= 0;
			
			for (int index=0; index < sortMe.length/2 ; index++) 
				firstHalf[ptr++] = sortMe[index];
				
				ptr = 0;
			
				
			for (int index= sortMe.length/2; index<sortMe.length; index++)
				
					secondHalf[ptr++]= sortMe[index];
				
			
			mergeSplitter(firstHalf);
			mergeSplitter(secondHalf);
			
			mergeArrays(firstHalf,secondHalf,sortMe);
			
			
			} 
			
			private static void mergeArrays(int[]array1, int [] array2, int[] combined)
			{
				int iOne= 0;int iTwo=0;int iSorted =0;
				
				while(iOne<array1.length && iTwo<array2.length)
				{
					if( array1[iOne] < array2[iTwo])  
						combined[iSorted++] = array1[iOne++];
					else  combined[iSorted++] = array2[iTwo++];
					
				}
				if (iOne == array1.length)
				
					while(iTwo <array2.length)
						combined[iSorted++]= array2[iTwo++];
					else 
						while (iOne < array1.length)
						{
							combined[iSorted++] = array1[iOne++];
						}
				
	
						
		}
		
		
}	
		



