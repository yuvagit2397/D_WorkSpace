package com.AutomationPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeatedword {
	
	public static void repitativechar() {
		
    String s="welcomegod";
    char[] ch= s.toCharArray();
   Map<Character,Integer> mapdata= new LinkedHashMap<Character,Integer>();
    for(char c:ch) {
    	if(mapdata.containsKey(c)) {
    		Integer it=mapdata.get(c);
    		mapdata.put(c, it+1);
    	}
    	else {
    		mapdata.put(c, 1);
    	}
}
   Set<Entry<Character, Integer>> entrySet = mapdata.entrySet();
   System.out.println("Duplicates value");
   for (Entry<Character, Integer> entry : entrySet) {
	if(entry.getValue()>1)
	{
		System.out.println(entry);
	}
}
	}
	public static void repitativeword() {
		
	    String s="welcome to world to java to world to java java ";
	  String[] split = s.split(" ");
	   Map<String,Integer> mapdata= new LinkedHashMap<String,Integer>();
	    for(String s1:split) {
	    	if(mapdata.containsKey(s1)) {
	    		Integer it=mapdata.get(s1);
	    		mapdata.put(s1, it+1);
	    	}
	    	else {
	    		mapdata.put(s1, 1);
	    	}
	}
	   Set<Entry<String, Integer>> entrySet = mapdata.entrySet();
	   System.out.println("Duplicates value");
	   for (Entry<String, Integer> entry : entrySet) {
		if(entry.getValue()>1)
		{
			System.out.println(entry);
		}
	}
		}

	public static void main(String[] args) {
		repitativechar();
		repitativeword();
	}

}
