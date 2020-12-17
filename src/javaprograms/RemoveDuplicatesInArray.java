package javaprograms;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesInArray {
	int j = 20;

	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<>();
		int[] a = { 1, 2, 3, 2, 1, 4, 5, 9, 6, 9 };
		System.out.println("With Duplicates");
		for (int i = 0; i < a.length; i++) {
			int k = a[i];
			System.out.println(k);
			s.add(k);
		}
		for (int val : s) {
			if (val == 5) {
				System.out.println("Expected value = " + val);
			}
		}
		System.out.println("WithOut Duplicates");
		System.out.println(s);
		Iterator<Integer> it = s.iterator();
		while (it.hasNext()) {
			int allVal = it.next();
			System.out.println(allVal);

		}
		
		int dupCount = a.length-s.size();

		
		System.out.println("Duplicate Count = "+dupCount);
	}
}
