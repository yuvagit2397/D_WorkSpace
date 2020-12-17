package javaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWord {
	
	public static void main(String[] args) {
		Map<String,Integer> mp=new HashMap<>();
		String s="i a am a am a a girl";
		String[] split = s.split(" ");
		for(int i=0;i<split.length;i++) {
			String name=split[i];
			
			if(mp.containsKey(name)) {
				Integer it = mp.get(name);
				mp.put(name, it+1);
				
			}else {
				mp.put(name, 1);
			}
		}
		System.out.println(mp);
		Set<Entry<String,Integer>> e=mp.entrySet();
		for (Entry<String, Integer> entry : e) {
			if(entry.getValue()>1) {
				System.out.println(entry);
			}
			
		}
		
	}
}

