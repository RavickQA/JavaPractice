package practice;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass 
{

	public static void main(String[] args) 
	{
	    TreeMap<String,String> tmap = new TreeMap<>();
	    
	    tmap.put("1", "First");
	    tmap.put("2", "Second");
	    tmap.put("3", "Third");
	    tmap.put("4", "Fourth");
	    
	    if(!tmap.isEmpty())
	    {
	    	System.out.println(tmap.size());
	    	System.out.println(tmap.get("3"));
	    }
	    
	    //Copying list from one treemap to other
	    
	    TreeMap<String, String> subMap = new TreeMap<String, String>();
        subMap.put("5", "Sixth");
        subMap.put("6", "Seventh");
        tmap.putAll(subMap);
        System.out.println(tmap);
        
             
        // reverse the list
        
        Map<String, String> reversetmap = tmap.descendingMap();
        System.out.println("Reverse Map List: " + reversetmap );
        
  // To get key set
        
        Set<String> tmapkeys = tmap.keySet();
        for(String key: tmapkeys)
        {
        System.out.println("These are key sets :-" + key);
        }
        
        
        
        
        
        
	    

	}

}

