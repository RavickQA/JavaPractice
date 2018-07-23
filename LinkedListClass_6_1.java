package practice;

import java.util.*;

public class LinkedListClass 
{

	public static void main(String[] args)
		{
		
		 List<Integer> l1=new LinkedList<>();
		 l1.add(1);
		 l1.add(2);
		 l1.add(3);
		 l1.add(4);
		 l1.add(5);
		 l1.add(6);
		 l1.add(7);
		 l1.add(8);
		 l1.add(9);
		 l1.add(10);
		 
		 System.out.println("\n this is type 1 retreiving the list");
		 for(Integer In : l1)
				System.out.println(In);
		 
		 //inserting new item to the list
		 l1.add(4,-4);
		 
		 System.out.println("\n this is type 2 retreiving the list");
		 for (int i = 0; i < l1.size(); i++) 
			{
	            System.out.println(l1.get(i));
	        }
		 
		Object o = l1.remove(9); // removed number 9 from the list
		System.out.println("\n remove number" + o + " from the list");
		
		Object r = l1.lastIndexOf(8);
		System.out.println("Last Index" +  r);
					
		System.out.println("\n this is iterating the list");
		 Iterator<Integer> It=l1.iterator();
				 {
			       while(It.hasNext())
			       {
			    	   System.out.println(It.next());
			       }
				 }
			
		
		try
		{
		Object getNumber = l1.get(7);
		System.out.println(getNumber);
		}
		catch(ArrayStoreException e)
		{
			System.out.println(e.getMessage());
		}
							

	}

}
