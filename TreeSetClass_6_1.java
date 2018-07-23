package practice;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {

	private static TreeSet<String> unique;

	public static void main(String[] args) 
	{
		TreeSet<String> ts = new TreeSet<>();
		ts.add("A");
		ts.add("B");
		ts.add("D");
		ts.add("C");
		ts.add("C");
		
		System.out.println(ts);
		
		//Transversing elements
		
		Iterator<String> itr= ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		// to remove an element if list is non empty
		
		if(!ts.isEmpty()) 
		try 
		{
			System.out.println("Element D is removed from the list" + ts.remove("D"));
			System.out.println("The size of the list is: " + ts.size());
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		// to find duplicate in array
		
		for(String tsarray:ts)
		{
			try
			{
				if(!unique.add(tsarray))
				{
					System.out.println("Duplicate arrays:-" + tsarray);
				}
			}
			catch(Exception e)
			{
				System.out.println("No duplicate found");
			}
			
		}
		
		// to get subset from tree set
		
		Set<String> subset= ts.subSet("G", "H");	
		//subset = ts.subSet("GREEN", true, "WHITE", true);
	    System.out.println("sub set: "+subset);
	        
	        
		
		
		

	}

}
