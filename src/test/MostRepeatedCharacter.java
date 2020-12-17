package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MostRepeatedCharacter {
	static Map<Character, Integer> m = new HashMap<>();
	static Set<Integer> ts=new TreeSet<Integer>();
	static int k;
	static int k1;
	public static void main(String[] args) {
		String s = "abbcccccd";
		char[] cs = s.toCharArray();
		
		for (char c : cs) {
			if (m.containsKey(c)) {
				Integer it = m.get(c);
				m.put(c, it + 1);

			} else {
				m.put(c, 1);
			}
			

		}
		System.out.println(m);
		Set<Entry<Character,Integer>> e=m.entrySet();
		for (Entry<Character, Integer> e1 : e) {
			ts.add(e1.getValue());
			}
		System.out.println(ts);
		Object[] array = ts.toArray();
		int max=array.length-1;
		
		Object ma = array[max];
		
		for (Entry<Character, Integer> val : e) {
			if(val.getValue()==ma) {
				Character key = val.getKey();
				Integer value = val.getValue();
				System.out.println(key+"="+value);
			}
		}
		
		}
		
	}


