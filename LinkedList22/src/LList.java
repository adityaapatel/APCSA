

public class LList 
{
	   private class ListNode
	    {

	        // Instance Variables

	        private String value;

	        private ListNode next;



	        // Constructor

	        public ListNode(String initialValue, ListNode initialNext)
	        {
	            value = initialValue;
	            next = initialNext;
	        }
	        // Accessors

	        public String getValue()
	        {
	            return value;
	        }

	        public ListNode getNext()

	        {
	            return next;
	        }
	        // Mutators

	        public void setValue(String newValue)
	        {
	            value = newValue;
	        }
	        public void setNext(ListNode newNext)
	        {
	            next = newNext;
	        }
	        public String toString()
	        {
	            return getValue();
	        }
	    }
 // Instance Variables
	    private ListNode head;
	    private int count;
	    // Constructors
	    public LList()

	    {
	        head = null;
	    }
	    // Methods
	    public String toString()

	    {
	        String retVal = "[ ";
	        ListNode here = head;
	        while (here != null)
	        {
	            retVal += here.toString();
	            here = here.getNext();
	            if (here != null)
	                retVal += ", ";
	        }
	        return retVal + " ]";
	    }

	    public boolean add(String str)
	    {
	        head = new ListNode(str, head);
	        count++;
	        return true;
	    }

	    public boolean remove(String target)
	    {
	        ListNode here = head, prev = null;
	        while ( (here != null) && (here.getValue().equals(target) == false))
	        {
	            prev = here;
	            here = here.getNext();
	        }
	        if (here == null)        // End of the List -- target doesn't exist
	            return false;
	        if (prev != null)
	            prev.setNext(here.getNext());
	        else        // Target is first node
	            head = here.getNext();
	        count--;
	        return true;

	    }

	public void clear()
{
	head=null;
	count = 0;
}
	public boolean isEmpty()
{
	return head ==null;
	
}

	public int size()
{
	int size = count;
	//int count = 0;
	 
//	ListNode here = head;
	// while (here!=null)
	 //{
		// count++;
		 //here=here.getNext();

		return size; 
}
	public String get(int index)
{
	if (index <0 || index >= count)
{
	throw new IndexOutOfBoundsException();
}
	ListNode here = head;
	
	for(int i= 0; i< index; i++)
	{
		here= here.getNext();
		
	}
	return here.getValue();
}

	public String set(int index, String newValue)
{
	if (index <0 || index >= count)
	{
		throw new IndexOutOfBoundsException();
	}
		ListNode here = head;
		
		for(int i= 0; i< index; i++)
		{
			here= here.getNext();
			
		}
		String oldValue= here.getValue();
		here.setValue(newValue);
		return oldValue;
}

	public void add(int index, String newValue)
	{
		if (index <0 || index > count)  throw new IndexOutOfBoundsException();
		
		if (index ==0)
		{
			add(newValue);
			
		}
		else
		{
			ListNode here= head;
			for(int i= 0;i < index-1;i++)
			{
				here = here.getNext();
			}
			ListNode newNode = new ListNode(newValue, here.getNext());
			here.setNext(newNode);
			
			count++;
		}
		}
		public String remove(int index)
		{
			if (index <0 || index >= count)
			{
				throw new IndexOutOfBoundsException();
			}
				ListNode here = head;
				
				for(int i= 0; i< index-1; i++)
				{
					here= here.getNext();
				}
				
				String removedValue= here.getNext().getValue();
				
				here.setNext(here.getNext().getNext());
				count--;
				return removedValue;
		}
				
		public int indexOf(String target)
			{
					int index = 0;
					ListNode here = head;
					while(here!= null)
					{
						if (target.equals(here.getValue()))
						{
							return index;
						}
						index++;
						here = here.getNext();
					}
					return -1;
	
			}

		 public String reverseString()
		 {
			 String retVal = " }";
		        ListNode here = null;
		        while (here != null)
		        {
		            retVal += here.toString();
		            here = here.getNext();
		            if (here == null)
		                retVal += ", ";
		        }
		        return retVal + " [";
			 
			 
		    }



}




















	

	


	