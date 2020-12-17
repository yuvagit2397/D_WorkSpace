package homeWork;

import java.util.Scanner;

public final class Factorial {
	public static void factorial() {
	int fact=1;
	int n;
	System.out.println("enter the number");
	Scanner no=new Scanner(System.in);
	n=no.nextInt();
	for (int i = 1; i <= n; i++) {
		fact=fact*i;
	}
	System.out.println("FACTORIAL VALUE IS  "+fact);
	}
	public static void main(String[] args) {
		factorial();
	}

}
