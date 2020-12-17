package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void hashSetEx() {
		Set<Integer> s = new HashSet<>();
  
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(2);
		s.add(3);
		

		//System.out.println(s);
		System.out.println("using foreach");
		for (Integer values : s) {
			System.out.println(values);
		}
		System.out.println("using iterator");
		Iterator itor= s.iterator();
		while(itor.hasNext()) {
			//Integer name=(Integer) itor.next();
			//System.out.println(name);
			System.out.println(itor.next());
		}
		
		
		

	}

	public static void linkedHashSet() {
		
		Set<String> s1 = new LinkedHashSet<>();
		s1.add("c");
		s1.add("b");
		s1.add(null);
		s1.add("a");
		s1.add("d");
		s1.add("e");
		s1.add(null);
		
		System.out.println(s1);
	}
	public static void treeSet() {
		Set<String> s2 = new TreeSet<>();
		s2.add("ghee");
		s2.add("kallur");
		s2.add("last");
		s2.add("jel");
		s2.add("height");
		s2.add("hai");
		//s2.add(null);
		System.out.println(s2); 
	} 

	public static void main(String[] args) {
		SetExample ob=new SetExample();
		hashSetEx();
		linkedHashSet();
		treeSet();
	}

}
