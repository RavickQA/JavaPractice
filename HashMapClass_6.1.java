package practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapClass {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "Raj");
		map.put(2, "Ram");
		map.put(5, "Rohan");
		map.put(6, "Rinku");
		map.put(4, "Raghu");
		map.put(3, "Rahim");
		
		String text =map.get(5);
		// To get required index and value
		System.out.println(text);
		
		map.put(4, "xyz"); // overrides the value
		String t = map.get(4);
		System.out.println("This is override value :" + t);
		
		
		map.remove(3); // remove an item from the record
		for(Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey() + " - " + m.getValue());
		}
		
		int i = map.size();
		System.out.println("Size of hash map - " + i);
		

		
		
		
		
		
		

	}

}
