package practice;

import java.util.ArrayList;

public class ArrayListClasss 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("one");
		a1.add("two");
		a1.add("three");
		a1.add("four");
		a1.add("five");
		a1.add("six");
		a1.add("seven");
		a1.add("eight");
		a1.add("nine");
		a1.add("ten");
			
		System.out.println("This is type 1 retrieving list");
		for(String str : a1)
		System.out.println(str);
		
		
		
		System.out.println("\nThis is type 2 retrieving list");
		System.out.println(a1.get(2));
		
		System.out.println("Remove the 1 item from last records");
		a1.remove(a1.size() - 3);
		
		System.out.println("\nThis is type 3 retrieving list");
		for (int i = 0; i < a1.size(); i++) 
		{
            System.out.println(a1.get(i));
        }
		
		
			

	}

}
