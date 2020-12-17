package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
public static void LinkedHashMap() {
 Map<String,Integer> m=new LinkedHashMap<>();
 m.put("a", 4);
 m.put("k", 4);
 m.put("b", 2);
 m.put("c", 5);
 m.put("c", 8);
 m.put("a", 6);
 System.out.println(m);
 //EntrySet
 Set<Entry<String,Integer>> e=m.entrySet();
 System.out.println("using entryset");
 
 for (Entry<String, Integer> entry : e) {
	//String key = entry.getKey();
	//Integer value = entry.getValue();
	//System.out.println(key+"="+value);
	 System.out.println(entry);
}
}
public static void HashMap() {
	 try {
		Map<String,Integer> m=new HashMap<>();
		 m.put("a", 4);
		 m.put("b", 2);
		 m.put("c", 5);
		 m.put("c", 8);
		 m.put("a", 6);
		 System.out.println(m);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	}
public static void treeMap() {
	 Map<String,Integer> m=new TreeMap<>();
	 m.put("a", 4);
	 m.put("k", 4);
	 m.put("b", 2);
	 m.put("c", 5);
	 m.put("c", 8);
	 m.put("a", null);
	 System.out.println("tree= "+m);
	}
public static void main(String[] args) {
	LinkedHashMap();  
	HashMap();
	treeMap();
}
}
