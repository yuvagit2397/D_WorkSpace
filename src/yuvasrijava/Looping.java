package yuvasrijava;

import java.util.Scanner;

public class Looping {

	public static void iteration() {
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		System.out.println("even numbers");
		// for(initialization;declaration;increment/decrement)
		for (int i = 1; i <= k; i++) {

			// System.out.println(i);
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("odd numbers");
		for (int j = 1; j <= k; j++) {

			// System.out.println(i);
			if (j % 2 == 1) {
				System.out.println(j);
			}

		}
	}

	public static void main(String[] args) {
		iteration();
	}

}
