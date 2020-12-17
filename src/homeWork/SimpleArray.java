package homeWork;

import java.security.PublicKey;
import java.util.Scanner;

public class SimpleArray {
	public static void declare() {
		double[] a1=new double[3];
		a1[0]=2.01234567890d;
		a1[1]=2.1234567890d;
		a1[2]=2.234567890d;
		for (int i = 0; i < 3; i++) {
			System.out.println(a1[i]);
			
		}
	}
	public static void comparing() {
		int[] a2= {11,12,13};
		System.out.println("enter the no");
		Scanner scan=new Scanner(System.in);
		int b=scan.nextInt();
		for (int j = 0; j < 3; j++) {
			System.out.println(a2[j]);
			if (b==a2[j]) {
				System.out.println(b);
				
			}
		}
		
	
	}
	public static void getting() {
		float[] a3=new float[2];
		System.out.println("print the no in decimal value");
		for (int k = 0; k <2; k++) {
			Scanner scan1=new Scanner(System.in);
			a3[k]=scan1.nextFloat();
			}
		for (float f : a3) {
			System.out.println(f);
		}
	}
	public static void main(String[] args) {
	//declare();
	//comparing();
	getting();

	}

}
