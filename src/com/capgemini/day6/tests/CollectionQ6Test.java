package com.capgemini.day6.tests;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class CollectionQ6Test {

	HashMap<String, ArrayList<String>> map= new HashMap<String,ArrayList<String>>();
	@Test
	void testStudentFavouriteFruit() {
		
		String[] favorites = new String[] {"fasgh","asdyau"};
		map.put("Sandeep", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"banana","kiwi","orange"};
		map.put("Sudarshan", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"peru","cockroach"};
		map.put("Harini", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"peru","papaya","apple"};
		map.put("Sharad", new ArrayList<>(Arrays.asList(favorites)));
		
		assertEquals(4, map.size());
		for (Map.Entry<String,ArrayList<String>> entry : map.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
		
		
		
	}
	@Test
	void testSearchFavouriteFood()
	{
		assertEquals(new ArrayList<>(Arrays.asList(new String[] {"fasgh","asdyau"})),("Harini"));
	}
	
	/*public boolean SearchFavouriteFood(String name){
	
		for (Map.Entry<String,ArrayList<String>> entry : map.entrySet()) 
		{
			System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
			if(entry.getKey()==name)
			return true;
		}
		return false;
	}*/
}


