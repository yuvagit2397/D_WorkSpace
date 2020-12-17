package homeWork;

import java.util.Scanner;

public class PrimeNumber {
	public void prime() {
		int p, n, s = 0;
		System.out.println("enter the value of n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Prime numbers");
		for (int i = 2; i < n; i++) {
			p = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					p = 1;
					break;

				}

			}
			if (p == 0) {
				s++;
				
				System.out.println(i);
				

			}
		
		}	System.out.println("total nos= "+s);


	}

	public static void main(String[] args) {
		PrimeNumber ob = new PrimeNumber();
		ob.prime();
	}

}
