package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample {
	public static void listIteration() {

		List<Integer> li = new ArrayList<>();

		li.add(10);
		li.add(30);
		li.add(20);
		li.add(50);
		li.add(40);
		li.add(60);

		System.out.println(li);

		// [10, 30, 20, 50, 40, 60]
		int x;
		System.out.println("Using ForLoop");
		for (int i = 0; i < li.size(); i++) {
			x = li.get(i);
			System.out.println(x);
		}
		System.out.println("Foreach");
		for (Integer ch : li) {
			System.out.println(ch);
		}
		System.out.println("Using Iterator");
		Iterator it = li.iterator();
		while (it.hasNext()) {
           Integer y= (Integer) it.next();
			System.out.println(y);

		}
		

	}
	
}
