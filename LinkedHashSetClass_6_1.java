package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetClass {

	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("first");
		lhs.add("second");
		lhs.add("third");
		lhs.add("fourth");
		lhs.add("fifth");
		lhs.add("sixth");
				
		System.out.println("This is linked hash set" + lhs);
		
		// adding hashset to linedhash set
		
		HashSet<String> subset = new HashSet<>();
		subset.add("Seventh");
		subset.add("eight");
		subset.add("ninth");
		subset.add("tenth");
		
		lhs.addAll(subset);
		
		System.out.println("Linked list after adding hash set" + lhs);
		
		if(!lhs.isEmpty())
		{
		
		  java.util.Iterator<String> itr=lhs.iterator();
		  while(itr.hasNext())
		  {
			System.out.println("This is iterator linkedhashset :-" + itr.next());
		  }
		}
		
		try
		{
			if(lhs.contains("None"));
			System.out.println("None is not subset of array");
			
		}
		catch(Exception e)
		{
			System.out.println("This is exception");
		}
		
		String[] lhsarray = new String[lhs.size()];
		  lhs.toArray(lhsarray);
		  for(String strlhsarray :lhsarray)
		  {
			  System.out.println("Linked hash set converted to array as :- " +  strlhsarray);
		  }
			
		

	}

}
