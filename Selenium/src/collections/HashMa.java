package collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMa {
	
	public static void main(String args[])
	{
		HashMap<String,String>  hm= new HashMap<String,String>();
		
		hm.put("Selenium","Java");
		hm.put("QTP", "VBSCRIPT");
		hm.put("DotNet", "C#");
		
	System.out.println(hm);
	
	System.out.println("Total Size of Map is: "+hm.size());
	System.out.println("does it conatisn key DotNet:"+ hm.containsKey("DotNet"));
	System.out.println("does it conatisn key dotnet :"+hm.containsKey("dotnet"));
	
	System.out.println("Does it contains value Java : "+hm.containsValue("Java"));
	System.out.println("Does it contains value xyz : "+hm.containsValue("xyz"));
	
	System.out.println("Value of Selenium: "+hm.get("Selenium"));
    System.out.println("Is HashMap empty? "+hm.isEmpty());
    System.out.println("When adding Duplicate key Seleium "+hm.put("Selenium","forduplicatekey"));
    
    
    hm.remove("DotNet");
    
    System.out.println("Total Size of Map  after removing one element: "+hm.size());
    
    hm.put("newkey","NewValue");
	
    // Keyset return all key entries
    
    Set<String> keys= hm.keySet();
    
    System.out.println("Total Avaialable keys are:"+keys.size());
    System.out.println("Keys values are as given below:");
    for (String key: keys)
    {
    	System.out.println(hm.get(key));
    }
    	
    
    // add complete collection into hashmap as once
    
    HashMap<String,String> hm1 = new HashMap<String,String>();
    
    hm1.put("Selenium1", "JavaValue1");
    hm1.put("QTP1","VBScript1");
    
    hm.putAll(hm1);
    
    System.out.println(hm1);
    System.out.println(hm);
    System.out.println(hm.size());
    
    
// Iterate through Entry Set
    
    System.out.println(hm.entrySet());
    
    
    hm.entrySet();
    
    Set <Entry<String,String>> keyvalues = hm.entrySet();
    
    System.out.println("Size of Entry set :"+keyvalues.size());
    
   for(Entry<String,String> entry:keyvalues)
   {
	   System.out.println("Key is: "+entry.getKey()+" And value is: "+entry.getValue());
   }
    
    
   //Clear all values
   
  System.out.println("clear all values from hm hashmap");
  hm.clear();

   
   
   
  }
	
	}

