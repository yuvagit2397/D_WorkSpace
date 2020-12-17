package javaprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedCharacter {

	public static void repeatedCharacter() {
		Map<Character, Integer> mp = new HashMap<>();
		String s = "malayalam";
		char[] ch = s.toCharArray();
		for (char c : ch) {
			if (mp.containsKey(c)) {
				Integer it = mp.get(c);
				mp.put(c, it + 1);
			} else {
				mp.put(c, 1);
			}
		}

//System.out.println(mp);
		Set<Entry<Character, Integer>> en = mp.entrySet();
		for (Entry<Character, Integer> entry : en) {
			if (entry.getValue() > 1) {
				// Character key = entry.getKey();
				// Integer value = entry.getValue();
				// System.out.println(key+"="+value);
				System.out.println(entry);
			}
		}

	}

	public static void repeatedCharacterWithoutMap() {
		String s = "asdfghasdfas";
		List<Character> li = new ArrayList<>();
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			for (int j = i + 1; j < s.length(); j++) {
				char c1 = s.charAt(j);
				if (c == c1) {
					count = count + 1;// a=2

				}
			}
			if (li.contains(c) == false) {
				System.out.println(c + "=" + count);
				li.add(c);
				count = 1;

			}
		}

	}

	public static void main(String[] args) {
		repeatedCharacterWithoutMap();
		System.out.println("-------------");
		repeatedCharacter();

	}

}

//Repeated character without using map
