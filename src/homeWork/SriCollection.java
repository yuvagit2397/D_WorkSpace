package homeWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SriCollection {
	public static void collect() {
		List<String> s = new ArrayList<String>();
		Set<Integer> set=new HashSet<>();
		set.add(2);
		set.add(2);
		set.add(3);
		set.add(5);set.add(6);
		set.add(5);
		set.add(2);
		System.out.println("set values= "+set);
		List<String> s1 = new ArrayList<String>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		s.add("e");
		s.add("f");
		s.add("g");
		s.add(6, "h");
		s1.add("1");
		s1.add("2");
		s1.add("3");
		s1.add("b");
		s1.add("e");
		System.out.println(s);
		s1.retainAll(s);
		System.out.println("using retain All method " + s1);
		
		String x = s.get(1);
		System.out.println("Using get " + x);
		s.remove(3);
		System.out.println("using remove " + s);
		x = s.get(4);
		System.out.println("after using remove " + x);
		boolean y = s.contains("e");
		System.out.println("using contains\n given value is " + y);
		s1.addAll(s);
		System.out.println("using addAll method " + s1);
		
		
		
		s1.removeAll(s);
		System.out.println("using remove all " + s1);
		s.clear();
		System.out.println("using clear method " + s);

	}

	public static void main(String[] args) {
		collect();

	}

}
