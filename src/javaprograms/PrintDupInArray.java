package javaprograms;

import java.util.ArrayList;
import java.util.List;

public class PrintDupInArray {
	public static void main(String[] args) {
		int a[] = { 2, 3, 2, 4, 12, 3, 5, 8, 12, 5, 3, 12, 5 };
		List<Integer> li = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					if (li.contains(a[i]) == false) {
						System.out.println(a[i]);
						li.add(a[i]);

					}

				}
			}
		}
		System.out.println(li);
	}
}
